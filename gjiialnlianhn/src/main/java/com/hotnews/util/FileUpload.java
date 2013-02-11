package com.hotnews.util;

import java.io.InputStream;
import org.apache.commons.fileupload.FileItem;

public class FileUpload {
		private String fileName;
		private String fileExtension;
		private String basePath;
		private String directory;
		private boolean isImage;
		private boolean isThumbNail;
		private boolean hasExtension;
		private FileItem fileItem;
		private InputStream inputStream;
		private int height;
		private int width;
		
		public boolean hasExtension() {
			return hasExtension;
		}
		public void setHasExtension(boolean hasExtension) {
			this.hasExtension = hasExtension;
		}
		public InputStream getInputStream() {
			return inputStream;
		}
		public void setInputStream(InputStream inputStream) {
			this.inputStream = inputStream;
		}
		public String getFileExtension() {
			return fileExtension;
		}
		public void setFileExtension(String fileExtension) {
			this.fileExtension = fileExtension;
		}
		public boolean isImage() {
			return isImage;
		}
		public void setImage(boolean isImage) {
			this.isImage = isImage;
		}
		public FileItem getFileItem() {
			return fileItem;
		}
		public void setFileItem(FileItem fileItem) {
			this.fileItem = fileItem;
		}
		public String getFileName() {
			return fileName;
		}
		public void setFileName(String fileName) {
			this.fileName = fileName;
		}
		public String getBasePath() {
			return basePath;
		}
		public void setBasePath(String basePath) {
			this.basePath = basePath;
		}
		public String getDirectory() {
			return directory;
		}
		public void setDirectory(String directory) {
			this.directory = directory;
		}
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		public int getWidth() {
			return width;
		}
		public void setWidth(int width) {
			this.width = width;
		}
		public boolean isThumbNail() {
			return isThumbNail;
		}
		public void setThumbNail(boolean isThumbNail) {
			this.isThumbNail = isThumbNail;
		}
}
