package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.UserService;
import com.javaex.util.JsonResult;
import com.javaex.util.JwtUtil;
import com.javaex.vo.UserVo;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	//로그인
	@PostMapping("api/users/login")
	public JsonResult login(@RequestBody UserVo uservo, 
					  HttpServletResponse response) {
		System.out.println("UserController.login");
		System.out.println(uservo);
		UserVo authUser = service.exeLogin(uservo);
		System.out.println(authUser);
		
		if(authUser != null) {
			//토큰을 만들고 "응답문서의 헤더"에 토큰을 붙여서 보낸다
			JwtUtil.createTokenAndSetHeader(response, ""+authUser.getUserNum());
			return JsonResult.success(authUser);
		}else {
			return JsonResult.fail("로그인실패");
		}
	
	}
	
	//회원수정폼, 3번회원정보 가져오기
	@GetMapping("api/users/me")
	public JsonResult modifyform(HttpServletRequest request) {
		System.out.println("UserController.modifyform");
		
		int no = JwtUtil.getNoFromHeader(request);
		System.out.println(no);
		
		if(no != -1) {
			UserVo uservo = service.exeEditForm(no);
			return JsonResult.success(uservo);
		}else {
			return JsonResult.fail("토큰x");
		}
		
	}
	
	//회원정보 수정
	@PutMapping("api/users/me")
	public JsonResult editUser(@RequestBody UserVo uservo,
								HttpServletRequest request) {
		System.out.println("UserController.editUser");
		
		int no = JwtUtil.getNoFromHeader(request);
		uservo.setUserNum(no);
		System.out.println(uservo);
		
		if(no != -1) {//토큰 정상
			uservo.setUserNum(no);
			int count = service.exeEditUser(uservo);
			System.out.println(count+"건 수정완료");
			return null;
		}else {//토큰 비정상
			return JsonResult.fail("토큰x");
		}

	}
	
	//회원가입
	@PostMapping("api/users/join")
	public JsonResult registration(@RequestBody UserVo uservo) {
		System.out.println("UserController.registration");
		System.out.println(uservo);
		int count = service.exeRegister(uservo);
		
		if (count == 1) {
			return JsonResult.success(uservo);
		}else {
			return JsonResult.fail("회원가입 실패");
		}
		
	}

}
