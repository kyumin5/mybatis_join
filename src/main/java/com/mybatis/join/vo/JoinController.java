package com.mybatis.join.vo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JoinController {
	
	@Autowired
	private MybatisDAO mybatisDAO;
	
	
	@RequestMapping("/joinList.do")
	public String selectList (JoinVO vo, Model model) {
		
		System.out.println("컨트롤러 호출 성공 :/joinList.do");
		
		List<JoinVO> joinList = mybatisDAO.selectListJoin(vo);
		
		model.addAttribute("joinList", joinList);
		
		return "JoinList.jsp";
		
		
	}
	
	@RequestMapping("/s-joinList.do")
	public String selectList (Spring_JoinVO vo, Model model) {
		
		System.out.println("컨트롤러 호출 성공 :/s-joinList.do");
		
		List<Spring_JoinVO> joinList = mybatisDAO.selectListJoin(vo);
		
		Spring_JoinVO joinVO= joinList.get(0);
		Spring_JoinVO joinVO1= joinList.get(1);
		Spring_JoinVO joinVO2= joinList.get(2);
		
		System.out.println(joinVO);
		System.out.println(joinVO1);
		System.out.println(joinVO2);
		
		model.addAttribute("joinList", joinList);
		
		return "s-JoinList.jsp";
		
	}
	
	
	@RequestMapping("/joinList3.do")
	public String selectList (AllJoinVO vo, Model model) {
		
		System.out.println("컨트롤러 호출 성공 :/joinList.do3");
		
		List<AllJoinVO> joinList = mybatisDAO.selectListJoin(vo);
		
		model.addAttribute("joinList", joinList);
		
		return "JoinList3.jsp";
		
		
	}
	
	@RequestMapping("/joinList4.do")
	public String selectList2 (AllJoinVO vo, Model model) {
		
		System.out.println("컨트롤러 호출 성공 :/joinList.do4");
		
		List<AllJoinVO> joinList = mybatisDAO.selectListJoin(vo);
		
		model.addAttribute("joinList", joinList);
		
		return "JoinList4.jsp";
		
		
	}
}
