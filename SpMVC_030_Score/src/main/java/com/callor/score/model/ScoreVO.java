package com.callor.score.model;

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
public class ScoreVO {

	private long st_seq;
	private String st_stnum;
	private String st_sbcode;
	private String st_score;
	
	private String sb_code;
	private String sb_name;

}
