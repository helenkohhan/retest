package com.book.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.book.dto.BookDTO;
import com.book.dto.MemberDTO;
import com.book.service.BookService;
import com.book.service.MemberService;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {
		private BookService bservice;
		private MemberService mservice;
	
		public MainController(BookService bservice, MemberService mservice) {
			super();
			this.bservice = bservice;
			this.mservice = mservice;
		}

		@RequestMapping("/")
		  public String index() {
		    return "index";
		}
	
		  
	   @PostMapping("/login")
	   	   public String login(String mid, String mpassword, HttpSession session) {
		   System.out.println(mid + " " + mpassword);
		   MemberDTO dto = mservice.login(mid, mpassword);
		   session.setAttribute("member", dto);
	
		   return "redirect:/main";
	   }
	  
	   @RequestMapping("/main")
	       public ModelAndView main(ModelAndView view) {
		   List<BookDTO> bookList = bservice.selectAllBook();
		   List<MemberDTO> memberList = mservice.selectAllMember();  
		  
		   view.addObject("bookList", bookList);
		   view.addObject("memberList", memberList);
		   view.setViewName("main");
		   return view;
	   }

	 
	  
	   @RequestMapping("/book/insert")
	   	   public String insert(BookDTO dto, HttpServletResponse response) throws IOException {
		  
		    try {
		    	bservice.insertBook(dto);
		    } catch (Exception e) {
		    	String msg 
		    	= "<script>alert('데이터 등록에 실패하였습니다');location.href='/main';</script>";
				 response.setContentType("text/html; charset=utf-8");
				 response.getWriter().write(msg);
				 return null;
		    }
		    return "redirect:/main";
	   }

	    
	   
	  
	  @RequestMapping("/book/update/view")
	  public ModelAndView updateView(@PathVariable String isbn, ModelAndView view) {
		  
		  BookDTO dto = bservice.selectBook(isbn);
		  view.addObject("dto", dto);
		  view.setViewName("book_update");
	    return view;
	  }

	  
	  @RequestMapping("/book/update")
	  public String update(BookDTO dto) {
		  bservice.updateBook(dto);
	    return "redirect:/main";
	  }

	  
	  @RequestMapping("/book/delete/{isbn}")
	  public String delete(@PathVariable String isbn) {
		  bservice.deleteBook(isbn);
	    return "redirect:/main";
	  }

	  
	  
	
	  
	  @RequestMapping("/book/search")
	  public ResponseEntity<String> search(String kind, String search) {
	    System.out.println(kind + " " + search);
	    List<BookDTO> list = bservice.searchBook(kind, search);
	    return new ResponseEntity(list, HttpStatus.OK);
	  }

	  
	  
	  

	

}
