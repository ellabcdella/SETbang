package com.setbang.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.setbang.domain.MyPageListVO;
import com.setbang.domain.PartnerVO;
import com.setbang.service.MyPageListService;
import com.setbang.service.PartnerService;

@Controller
public class PartnerController {
	private static final Logger logger = LoggerFactory.getLogger(PartnerController.class);
	
	@Autowired
	private PartnerService partnerService;
	
	@Autowired
	private MyPageListService myPageListService;
		
	// 협력업체 페이지로 이동
	@RequestMapping(value = "partnerBooking.do", method = RequestMethod.GET)
	public String selectinfo2(PartnerVO vo, HttpSession session, Model model)throws Exception{
		logger.info("PartnerController selectinfo2 method");
		
		String id = (String)session.getAttribute("sessionId");
		PartnerVO selectInfo = partnerService.selectInfo(id);
		
		model.addAttribute("PartnerVO", selectInfo);
		return "/partner/partnerApply";
		
	}
	
	// 협력업체 selectBox 조회
	@RequestMapping(value = "selectCompany.do", method = RequestMethod.GET)
	public String selectCompany(HttpSession session, Model model)throws Exception{
		logger.info("PartnerController selectCompany method");
		
		String id = (String)session.getAttribute("sessionId");
		
		String company = partnerService.selectCompany(id);
		model.addAttribute("PartnerVO", company);
		
		return "/partner/partnerApply";
		
	}
	
	// 협력업체 신청
	@RequestMapping(value="insertCompany.do", method=RequestMethod.POST)
	public String insertCompany(HttpSession session, Model model, HttpServletRequest request) throws IOException{
		logger.info("PartnerController insertCompany method");

		String id = (String)session.getAttribute("sessionId");
		
		PartnerVO vo = new PartnerVO();

		int memcode = partnerService.followMemCode(id);
		
		String ptr_name = request.getParameter("ptr_name");
		String ptr_start = request.getParameter("ptr_start");
		String ptr_end = request.getParameter("ptr_end");
		
		String followName = partnerService.followName(id);
		model.addAttribute("PartnerVO", followName);
		
		String followTel = partnerService.followTel(id);
		model.addAttribute("PartnerVO", followTel);
	
		if(memcode !=0) {
			vo.setPtr_name(ptr_name);
			vo.setMem_code(memcode);
			vo.setPtr_start(ptr_start);
			vo.setPtr_end(ptr_end);
			vo.setPtr_apply_name(followName);
			vo.setPtr_tel(followTel);

				model.addAttribute("ptr_name", ptr_name);
				model.addAttribute("mem_code", memcode);
				model.addAttribute("ptr_start", ptr_start);
				model.addAttribute("ptr_end", ptr_end);
				model.addAttribute("ptr_apply_name", followName);
				model.addAttribute("ptr_tel", followTel);
			
				partnerService.insertCompany(vo);
				
				// Session에서 Mem_code 가져오기
				String sessionId = (String) session.getAttribute("sessionId");
				int mem_code = myPageListService.findmemcode(sessionId);
				
				// Mem_code로 자신의 협력업체지원서비스 신청현황 가져오기
				List<MyPageListVO> partnerlist = myPageListService.partnerlist(mem_code);
					model.addAttribute("partnerlist", partnerlist);
				
				return "myPage/myPagePartnerlist";
		}else {		
		return "redirect:/partnerApply.do";
	}	
}
	
}
