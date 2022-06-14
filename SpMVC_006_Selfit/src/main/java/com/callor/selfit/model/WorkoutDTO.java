package com.callor.selfit.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 * DTO 와 VO
 * DTO(Data Transfer Object)  : 데이터를 담아서 이동하는용도
 * 		- JOIN 등으로 만들어진 결과 데이터를 담는 용도
 * VO(Value Object) : 	데이터와 연산을 포함하는 용도
 * 		- Controller 에서 매개변수로 사용하기
 * 		-일부 Getter() method에 결과를 연산하는 코드를 추가
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WorkoutDTO {

	private String SL_ID;//	VARCHAR2(5),
	private String SL_SCID;//	VARCHAR2(4),
	private String SC_NUM;//	VARCHAR2(6),
	private String SC_LABEL;//	NVARCHAR2(10),
	private String SC_DIVISION;//	NVARCHAR2(20),
	private String SC_DAY; //	VARCHAR2(10),
	private String SC_PART;//	NVARCHAR2(30),
	private String SL_LISTID;//	VARCHAR2(5),
	private String LIST_NAME;//	NVARCHAR2(125),
	private int sl_set;//	NVARCHAR2(125),
	private String sl_weight;//	NVARCHAR2(125),
	private String sl_rep;//	NVARCHAR2(125),
	
}
