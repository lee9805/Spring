package com.callor.memo.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

public interface FileUpService {

	public String fileUp(MultipartFile file);
	public List<String> filsUp(MultipartHttpServletRequest filesS);
	public void fileDelete(String fileName);
}
