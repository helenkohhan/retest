package com.book.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.book.dto.BookDTO;
import com.book.dto.MemberDTO;

@Mapper
public interface BookMapper {


	List<BookDTO> selectAllBook();

	int insertBook(BookDTO dto);

	BookDTO selectBook(String isbn);

	int updateBook(BookDTO dto);

	int deleteBook(String isbn);

	List<BookDTO> searchBook(String kind, String search);


}
