package com.newlecture.web.controller.notice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ListController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("ListControoler in ");
		ModelAndView mv = new ModelAndView("notice.list");//실제로 찾아갈 주소
		
		//mv.setViewName("/WEB-INF/view/index.jsp");
		
	return mv;
	}

}
