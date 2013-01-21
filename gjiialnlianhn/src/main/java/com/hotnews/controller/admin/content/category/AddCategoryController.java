package com.hotnews.controller.admin.content.category;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
 
@Controller
@RequestMapping("/addCategory")
public class AddCategoryController {
 
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		return "admin/content/category/addCategory";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response) {
		 ModelAndView mav = new ModelAndView();
	     mav.setViewName("admin");
	
	     return mav;
	}
}