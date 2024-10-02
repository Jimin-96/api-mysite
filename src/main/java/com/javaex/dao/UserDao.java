package com.javaex.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.UserVo;

@Repository
public class UserDao {

	@Autowired
	private SqlSession sqlsession;


	public UserVo selectUser(UserVo uservo) {
		System.out.println(uservo);

		UserVo userVo = sqlsession.selectOne("mysite.selectOne", uservo);
		System.out.println("Dao" + userVo);

		return userVo;
	}

	// no로 한명데이터 가져오기(회원정보수정 폼)
	public UserVo userSelectOneByNo(int no) {
		System.out.println("UserDao.userSelectOneByNo()");

		UserVo userVo = sqlsession.selectOne("mysite.selectOneByNo", no);
		return userVo;
	}

	// 수정(회원정보수정)
	public int userUpdate(UserVo userVo) {
		System.out.println("UserDao.userUpdate()");

		int count = sqlsession.update("mysite.update", userVo);
		return count;
	}
	
	// 회원가입
	public int registeration(UserVo userVo) {
		System.out.println("UserDao.registeration");
		
		int count = sqlsession.insert("mysite.insert", userVo);
		
		return count;
	}

}
