package com.callor.todo.service.auth;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.callor.todo.model.UserVO;

@Service("authenticationProvider")
public class AuthorProvierImpl implements AuthenticationProvider{

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
	
		// getPrincipal().toString(), getCredentials().toString() 형식으로
		// 사용할수 있지만 null point exception이 발생할수 있어서
		// 문자열 형변환을 사용한다
		String username =(String) authentication.getPrincipal();
		String password = (String) authentication.getCredentials();
		
		if(username.equals("lee98") == false) {
			throw new UsernameNotFoundException("username 이 잘못되었습니다");
		}if(password.equals("!aa1234") == false) {
			throw new BadCredentialsException("비밀번호가 잘못됨");
		}
		UserVO userVO = UserVO.builder()
								.username(username)
								.password(password)
								.email("email")
								.realname("공유")
								.nickname("이광수")
								.build();
		List<GrantedAuthority> grantList = new ArrayList<>();
		grantList.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
		grantList.add(new SimpleGrantedAuthority("ROLE_USER"));
		
		UsernamePasswordAuthenticationToken token= 
				new UsernamePasswordAuthenticationToken(userVO, null, grantList);
		return token;
	}

	/*
	 * security 에서 인증절차를 수행하기 위하여 AuthenticationProvider를
	 * 상속받으면 반드시 supports 를 true 로 만들어 주어야한다
	 */
	
	
	@Override
	public boolean supports(Class<?> authentication) {
		// TODO Auto-generated method stub
		return true;
	}

}
