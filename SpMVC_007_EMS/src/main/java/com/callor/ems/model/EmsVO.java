package com.callor.ems.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmsVO {

	private long e_seq;
	
	private String e_from_email;

	@Email(message="Email 형식이 아닙니다")
	@NotEmpty(message="받는사람 email 은 반드시 입력하세요")	
	private String e_to_email;
	
	@NotEmpty(message="보내는 사람 이름은 null일수 없다")
	private String e_from_name;
	
	@Length(min = 1, max=100, message=" 받는 사람 이름은 1~100글자여야함")
	@NotEmpty(message="받는 사람 이름은 꼭 입력")
	private String e_to_name;
	
	@NotEmpty(message="제목 꼭 적어줘")
	private String e_subject;
	private String e_content;
	//@Size(min=1, max=10, message=" num는 1부터 10 사이의 값이어야함")
	private String e_send_date;
	private String e_send_time;
	
	//@Min(value=1,message="num는 1보다 커야함")
	//@Max(value=10,message="num는 10보다 작아야함")
	private int num;
	
	//@DecimalMin(value="1",message="decimal은 십진수 1보다 커야함")
	//@DecimalMax(value="10",message="decimal은 십진수 10보다 작아야함")
	private int decimal;
	
	//@Pattern(regexp = "^.*(?=^.{8,15}$)(?=.*\\d)(?=.*[a-zA-Z])(?=.*[!@#$%^&+=]).*$")
	private String password;
	
}
