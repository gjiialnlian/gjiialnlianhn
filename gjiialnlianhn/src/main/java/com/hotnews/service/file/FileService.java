package com.hotnews.service.file;

import org.springframework.web.multipart.MultipartFile;
import com.hotnews.constant.ImagePath;
import com.hotnews.exception.BaseException;

public interface FileService{
	void uploadImageFile(MultipartFile file, ImagePath imagePath) throws BaseException;
}
