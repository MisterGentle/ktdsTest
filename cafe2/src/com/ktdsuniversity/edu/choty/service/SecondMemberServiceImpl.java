package com.ktdsuniversity.edu.choty.service;

import java.util.List;

import com.ktdsuniversity.edu.choty.dao.ListMemberDAOImpl;
//import com.ktdsuniversity.edu.choty.dao.MapMemberDAOImpl;
import com.ktdsuniversity.edu.choty.dao.MemberDAO;
import com.ktdsuniversity.edu.choty.vo.MemberVO;

public class SecondMemberServiceImpl implements MemberService{

	private MemberDAO memberDAO;

	public SecondMemberServiceImpl() {
		memberDAO = new ListMemberDAOImpl(); //List 사용
		//memberDAO = new MapMemberDAOImpl(); //Map 사용
	}

	@Override
	public boolean create(MemberVO memberVO) {
		System.out.println("SecondMemberServiceImpl.create");
		return memberDAO.create(memberVO) > 0;
	}

	@Override
	public List<MemberVO> readAll() {
		System.out.println("SecondMemberServiceImpl.readAll");
		return memberDAO.readAll();
	}

	@Override
	public MemberVO read(int index) {
		return memberDAO.read(index);
	}

	@Override
	public MemberVO read(String valueOf) {
		return memberDAO.read(valueOf);
	}

}