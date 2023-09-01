package com.newlecture.web.controller.notice;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;
import com.newlecture.web.service.jdbc.JDBCNoticeService;

public class ListController implements Controller {
	
	
	private NoticeService noticeService;
	
	
	
@Autowired
	public void setNoticeService(JDBCNoticeService noticeService) {
		this.noticeService = noticeService;
	}




	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("ListControoler in ");
	
		
		ModelAndView mv = new ModelAndView("notice.list");//실제로 찾아갈 주소
		
		List<Notice> list = noticeService.getList(1, "TITLE", "");
		
		mv.addObject("list", list);
		
	return mv;
	}

}
