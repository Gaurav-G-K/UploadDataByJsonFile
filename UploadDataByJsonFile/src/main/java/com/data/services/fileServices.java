package com.data.services;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.data.dto.Vehicles;
import com.data.entity.Files;

public interface fileServices {

	public List<Vehicles> UploadFile(MultipartFile file) throws IOException;
	
	public Files getFile(Long id);
}
