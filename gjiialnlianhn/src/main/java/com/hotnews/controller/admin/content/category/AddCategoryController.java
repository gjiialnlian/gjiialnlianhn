package com.hotnews.controller.admin.content.category;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import com.hotnews.bean.ItemBean;
import com.hotnews.constant.CategoryTable;
import com.hotnews.constant.ImagePath;
import com.hotnews.constant.UserStatus;
import com.hotnews.exception.BaseException;
import com.hotnews.service.file.FileService;
import com.hotnews.service.item.ItemService;
import com.hotnews.util.IDGeneratorUtil;


@Controller
@RequestMapping("/addCategory")
public class AddCategoryController {
 
	@Autowired
	private FileService fileService;
	@Autowired
	private ItemService itemService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		return "admin/content/category/addCategory";
	}
	
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String handleFormUpload(@RequestParam("upload") MultipartFile file, @RequestParam("name") String name, String catOpt, String url){
		 try {
			String itemId = IDGeneratorUtil.getDBGeneratedId(CategoryTable.find(catOpt));
			ImagePath path = ImagePath.DEFAULT_PATH;
			path.setCatTable(CategoryTable.find(catOpt));
			path.setItemId(itemId);
			
			fileService.uploadImageFile(file, path);
			itemService.add(new ItemBean("", catOpt, name, url, UserStatus.ACTIVE.getUserStatusStr()));
		} catch (BaseException e) {
			return "";
		}
		
		return "admin/content/category/addCategory";
	}
}