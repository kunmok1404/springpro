package kr.board.mvc01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.board.mvc01.entity.Board;
import kr.board.mvc01.mapper.BoardMapper;

@Controller
public class BoardController {
	
	@Autowired
	private BoardMapper boardMapper;

	@GetMapping("/boardList.do")
	public String boardList(Model model) {
		model.addAttribute("list", boardMapper.getList());
		return "boardList"; 
	}
	
	@GetMapping("/boardForm.do")
	public String boradForm() {
		return "boardForm";
	}
	
	@PostMapping("/boardInsert.do")
	public String boardInsert(Board vo) {
		boardMapper.boardInsert(vo);
		return "redirect:/boardList.do";
	}
	
	@GetMapping("/boardContent.do")
	public String boardContent(Integer idx, Model model) {
		boardMapper.boardCount(idx);
		model.addAttribute("boardDto", boardMapper.boardContent(idx));
		return "boardContent"; 
	}
	
	@GetMapping("/boardDelete.do/{idx}")
	public String boardDelete(@PathVariable("idx") Integer idx) {
		boardMapper.boardDelete(idx);
		return "redirect:/boardList.do"; 
	}
	
	@GetMapping("/boardUpdateForm.do/{idx}")
	public String boardUpdateForm(@PathVariable("idx") Integer idx, Model model) {
		model.addAttribute("boardDto", boardMapper.boardContent(idx));
		return "boardUpdate"; 
	}
	
	@PostMapping("/boardUpdate.do")
	public String boardUpdate(Board vo) {
		boardMapper.boardUpdate(vo);
		return "redirect:/boardList.do"; 
	}
	
}