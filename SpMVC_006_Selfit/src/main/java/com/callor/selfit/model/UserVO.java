package com.callor.selfit.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class UserVO  {

	private String username;
	private String password;
	private String email;
	private String name;
	private String nickname;
	private String role;
	
	
}
