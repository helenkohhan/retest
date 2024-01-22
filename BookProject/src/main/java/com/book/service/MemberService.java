package com.book.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.book.dto.BookDTO;
import com.book.dto.MemberDTO;
import com.book.mapper.BookMapper;
import com.book.mapper.MemberMapper;

@Service
public class MemberService {
	private MemberMapper mmapper;

	public MemberService(MemberMapper mmapper) {
		this.mmapper = mmapper;
	}

	public MemberDTO login(String mid, String mpassword) {
	    HashMap<String, Object> map = new HashMap<String, Object>();
	    map.put("mid", mid);
	    map.put("mpassword", mpassword);
	    return mmapper.login(map);
	}


	public List<MemberDTO> selectAllMember() {
		return mmapper.selectAllMember();
	}


	
	

}
