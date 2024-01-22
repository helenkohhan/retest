package com.book.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.book.dto.MemberDTO;

@Mapper
public interface MemberMapper {
	
	List<MemberDTO> selectAllMember();
	
	MemberDTO login(HashMap<String, Object> map);

	
}
