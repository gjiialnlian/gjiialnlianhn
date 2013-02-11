package com.hotnews.service.file;

import java.io.IOException;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.hotnews.constant.ImagePath;
import com.hotnews.exception.BaseException;
import com.hotnews.service.file.FileService;
import com.hotnews.util.FileUtil;

@Service("fileService")
public class FileServiceImpl implements FileService{

	@Override
	public void uploadImageFile(MultipartFile file, ImagePath imagePath) throws BaseException {
		try {
			if(file != null && file.getInputStream() != null)
				FileUtil.fileStream(file.getInputStream(), imagePath.getPath(), file.getOriginalFilename());
		} catch (IOException e) {
			throw new BaseException(e);
		} catch (BaseException e) {
			throw new BaseException(e);
		}
	}
}
