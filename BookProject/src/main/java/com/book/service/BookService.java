package com.book.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.book.dto.BookDTO;
import com.book.dto.MemberDTO;
import com.book.mapper.BookMapper;

@Service
public class BookService {
	private BookMapper mapper;

	public BookService(BookMapper mapper) {
		this.mapper = mapper;
	}

	public List<BookDTO> selectAllBook() {
		return mapper.selectAllBook();
	}

	public int insertBook(BookDTO dto) {
		return mapper.insertBook(dto);
		
	}

	public BookDTO selectBook(String isbn) {
		return mapper.selectBook(isbn);
	}

	public int updateBook(BookDTO dto) {
		return mapper.updateBook(dto);
		
	}

	public int deleteBook(String isbn) {
		return mapper.deleteBook(isbn);
	}

	public List<BookDTO> searchBook(String kind, String search) {
		return mapper.searchBook(kind, search);
	}


	
	

}
