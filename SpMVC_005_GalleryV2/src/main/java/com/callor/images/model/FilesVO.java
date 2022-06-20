package com.callor.images.model;

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
public class FilesVO {

	private long i_seq;
	private long i_bseq;
	private String i_orivinaName;
	private String i_imageName;
	
}
