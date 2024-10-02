package com.javaex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.UserDao;
import com.javaex.vo.UserVo;

@Service
public class UserService {

	@Autowired
	private UserDao dao;
	

	// Login
	public UserVo exeLogin(UserVo userVo) {
		System.out.println("UserService.exeJoin()");

		UserVo authUser = dao.selectUser(userVo);
		return authUser;

	}

	// 회원정보수정
	public UserVo exeEditForm(int no) {
		System.out.println("UserService.exeEditForm()");

		UserVo userVo = dao.userSelectOneByNo(no);
		return userVo;
	}

	// 회원정보 수정
	public int exeEditUser(UserVo userVo) {
		System.out.println("UserService.exeEditUser()");

		int count = dao.userUpdate(userVo);
		return count;
	}
	
	// 회원가입
	public int exeRegister(UserVo uservo) {
		System.out.println("UserService.exeRegister");
		
		int count = dao.registeration(uservo);
		
		return count;
	}

}
