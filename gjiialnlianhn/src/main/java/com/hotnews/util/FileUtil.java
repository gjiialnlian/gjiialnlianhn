package com.hotnews.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;
import com.hotnews.exception.BaseException;

public class FileUtil {

	@SuppressWarnings("unchecked")
	public static List<FileItem> getMultiPartFileItem(HttpServletRequest request) throws BaseException{
		FileItemFactory  factory = new DiskFileItemFactory();
		ServletFileUpload uploadStream = new ServletFileUpload(factory);
		try {
			return uploadStream.parseRequest(request);
		} catch (FileUploadException e) {
			throw new BaseException(e);
		}
	}

	public static void createDirectory(String basePath,String directoryName) throws BaseException{
		if(isBlank(basePath)) 
			throw new BaseException("basePath is null.");
		if("".equals(directoryName.trim()) || null == directoryName.trim()) 
			throw new BaseException("directoryName is null.");
		
		createDirectory(basePath+directoryName);
	}

	public static void createDirectory(String directoryName) throws BaseException{	
		if(isBlank(directoryName)) 
			throw new BaseException("directoryName is null.");
		
		File newPath = new File(directoryName);
		if(!newPath.exists()) 
			newPath.mkdirs();
	}

	
	
	public static void fileStream(InputStream stream, String directory, String file) throws BaseException{
		createDirectory(directory);
		OutputStream mediaFileOut=null;

		byte buf[] = new byte[1024];
		int len;
		try {
			mediaFileOut = new FileOutputStream(directory+File.separator+file);
			while((len=stream.read(buf))>0){
				mediaFileOut.write(buf,0,len);
				mediaFileOut.flush();
			}
		}catch (FileNotFoundException e) {
			throw new BaseException(e);
		}catch (IOException e) {
			throw new BaseException(e);
		}finally{
			if(stream!=null)
				try {
					stream.close();		
				}catch (IOException e) {
					throw new BaseException(e);
				}
			if(mediaFileOut!=null)
				try {
					mediaFileOut.close();
				}catch (IOException e) {
					throw new BaseException(e);
				}
		}
	}
	
	public static void fileStream(InputStream stream, String filePath) throws BaseException{
		OutputStream mediaFileOut=null;

		byte buf[] = new byte[1024];
		int len;
		try {
			mediaFileOut = new FileOutputStream(filePath);
			while((len=stream.read(buf))>0){
				mediaFileOut.write(buf,0,len);
				mediaFileOut.flush();
			}
		}catch (FileNotFoundException e) {
			throw new BaseException(e);
		}catch (IOException e) {
			throw new BaseException(e);
		}finally{
			if(stream!=null)
				try {
					stream.close();		
				}catch (IOException e) {
					throw new BaseException(e);
				}
			if(mediaFileOut!=null)
				try {
					mediaFileOut.close();
				}catch (IOException e) {
					throw new BaseException(e);
				}
		}
	}
	
	public static FileInputStream fileStream(String filePath) throws BaseException{
		FileInputStream mediaFileIn = null;
		try {
			mediaFileIn = new FileInputStream(filePath);
		}catch (FileNotFoundException e) {
			throw new BaseException(e);
		}finally{
			if(mediaFileIn != null)
				try {
					mediaFileIn.close();
				} catch (IOException e) {
					throw new BaseException(e);
				}
		}
		return mediaFileIn;
	}

	public static boolean isImageFile(FileItem fileItem){

		String filename =fileItem.getName();
		String ext = FilenameUtils.getExtension(filename).trim();
		String[] extType = {"gif","jpg","png","jpeg","bmp"};
		
		for(int i=0;i<extType.length;i++){
			if(ext.equalsIgnoreCase(extType[i])){
				return true;
			}
		}
		return false;
	}

	public static String createFile(FileUpload fileUpload) throws BaseException {
		StringBuilder filePath = new StringBuilder(fileUpload.getBasePath());
		if(!isBlank(fileUpload.getDirectory())){
			filePath.append(fileUpload.getDirectory()).append(File.separator);
			createDirectory(fileUpload.getBasePath(),fileUpload.getDirectory());
		}
		if(fileUpload.isImage()){
			if(!isImageFile(fileUpload.getFileItem())) 
				throw new BaseException("Error on creating file. Invalid image file.");
		}
		if(fileUpload.hasExtension())
			filePath.append(fileUpload.getFileName()).append(".").append(fileUpload.getFileExtension());
		else
			filePath.append(fileUpload.getFileName());
		
		try {
			fileStream(fileUpload.getFileItem().getInputStream(),filePath.toString());
		} catch (IOException e) {
			throw new BaseException(e);
		}
		return filePath.toString();
	}
	
	@SuppressWarnings("resource")
	public static boolean isFileExists(String filePath) throws BaseException{
		boolean retVal=false;
		FileInputStream fis = null;
		File fileHandler = new File(filePath);
		try {
			fis = new FileInputStream(fileHandler);
		}catch (FileNotFoundException e) {
			throw new BaseException(e);
		}finally {
			if (fis != null)
				try {
					fis.close();
				} catch (IOException e) {
					throw new BaseException(e);
				}
		}
		return retVal;
	}
	
	public static boolean isDirectoryExist(String dir){
		File file = new File(dir);	
		if(file.isDirectory())
			return true;
		else
			return false;
	}

	public static FileUpload getFileUpload(HttpServletRequest request) throws BaseException{
		FileUpload fileUpload = null;
		List<FileItem> fileItemList = getMultiPartFileItem(request);
		for(FileItem fileItem : fileItemList){
			try {
				fileUpload = getFileUpload(fileItem);
			} catch (Exception e) {
				throw new BaseException(e);
			}
		}
		return fileUpload;
	}

	public static FileUpload getFileUpload(FileItem fileItem) throws BaseException{
		FileUpload fileUpload =null;
		if(!fileItem.isFormField() && fileItem!=null){
			fileUpload = new FileUpload();
			fileUpload.setFileItem(fileItem);
			try {
				fileUpload.setInputStream(fileItem.getInputStream());
			} catch (IOException e) {
				throw new BaseException(e);
			}
			fileUpload.setFileExtension(FilenameUtils.getExtension(fileItem.getName()));
		}
		return fileUpload;
	}
	
	public static void deleteFile(String filepath){
		File directory = new File(filepath);
		if(directory.exists())
			directory.delete(); 
	}
	
	public static void deleteDir(String dir){
		(new File(dir)).delete();
	}

	public static boolean isBlank(String str){
		if (null == str || "".equals(str))
			return true;
		else
			return false;
	}
	
	public static boolean isValidFileType(FileItem fileItem){
		String filename = fileItem.getName();
		String ext = FilenameUtils.getExtension(filename).trim();
		Object[] extType = getFileExtentions();
		for(int i=0;i<extType.length;i++){
			if(ext.equals(extType[i])){
				return true;
			}
		}
		return false;
	}
	
	public static boolean isValidImageType(FileItem fileItem){
		String filename = fileItem.getName();

		String ext = FilenameUtils.getExtension(filename).trim();
		String[] extType = {"gif","jpg","png","jpeg","bmp"};
		for(int i=0;i<extType.length;i++){
			if(ext.equalsIgnoreCase(extType[i])){
				return true;
			}
		}
		return false;
	}
	
	public static boolean isValidVideoType(FileItem fileItem){
		String filename = fileItem.getName();

		String ext = FilenameUtils.getExtension(filename).trim();
		String[] extType = {"flv"}; // Add all media type extension
		for(int i=0;i<extType.length;i++){
			if(ext.equalsIgnoreCase(extType[i])){
				return true;
			}
		}
		return false;
	}
	
	public static boolean isValidFileCount(int validCnt, List<FileItem> list, String field){
		int count = 0;
		for(FileItem file : list){
			
			if(file.getFieldName().equalsIgnoreCase(field))
				count++;
		}
		
		if(count > validCnt)
			return false;
		else
			return true;
	}
	
	private static Object[] getFileExtentions(){
		List<String> extList = new ArrayList<String>();
		extList.add("doc");
		extList.add("docx");
		extList.add("docm");
		extList.add("dotx");
		extList.add("dotm");
		extList.add("cvs");
		extList.add("xls");
		extList.add("xlsx");
		extList.add("xlsm");
		extList.add("xltx");
		extList.add("xltm");
		extList.add("xlsb");
		extList.add("xlam");
		extList.add("ppt");
		extList.add("pptx");
		extList.add("pptm");
		extList.add("potx");
		extList.add("potm");
		extList.add("ppam");
		extList.add("ppsx");
		extList.add("ppsm");
		extList.add("sldx");
		extList.add("sldm");
		extList.add("thmx");
		extList.add("pdf");
		extList.add("jpg");
		extList.add("gif");
		return extList.toArray();
	}
}