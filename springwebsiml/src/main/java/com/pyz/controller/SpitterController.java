package com.pyz.controller;

import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pyz.bo.RegisterBO;
import com.pyz.service.SpitterService;


@Controller
public class SpitterController {

	@Autowired
	private SpitterService spitterService;
	
	@RequestMapping({"/home"})
	public ModelAndView  showHomePage(HttpSession session){
		
		session.setAttribute("username", "pyz");
		ModelAndView mv = new ModelAndView();  
	    mv.addObject("spittles", "test");  
	    mv.setViewName("home");  
	    return mv;
	}
	
	@RequestMapping({"/school"})
	public ModelAndView  showSchoolPage(HttpSession session){
		
		ModelAndView mv = new ModelAndView();
		String testnull=null;
		//spring model不允许null做key
		mv.addObject(testnull,testnull);
		mv.addObject("test","def");
	    mv.setViewName("school");  
	    return mv;
	}
	
	@RequestMapping({"/login"})
	public String  login(@ModelAttribute("registerBo")RegisterBO registerBO){
		
		System.out.println(registerBO.getUserName());
		/*ModelAndView mv = new ModelAndView();
		String testnull=null;
		//spring model不允许null做key
		mv.addObject(testnull,testnull);
		mv.addObject("test","def");
	    mv.setViewName("school");  */
	    //return mv;
		return "school";
	}
	
}
