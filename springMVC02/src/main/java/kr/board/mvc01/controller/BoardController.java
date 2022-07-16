package kr.board.mvc01.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.board.mvc01.entity.Board;
import kr.board.mvc01.mapper.BoardMapper;

@Controller
public class BoardController {
	
	@Autowired
	private BoardMapper boardMapper;
	
	@GetMapping("/")
	public String main() {
		return "main";
	}
	
	@ResponseBody
	@GetMapping("/boardList.do")
	public List<Board> boardList() {
		return boardMapper.getList();
	}
	
	@ResponseBody
	@PostMapping("/boardInsert.do")
	public void boardInsert(Board board) {
		boardMapper.boardInsert(board);
	}
	
	@ResponseBody
	@GetMapping("/boardDelete.do")
	public void boardDelete(@RequestParam("idx") Integer idx) {
		boardMapper.boardDelete(idx);
	}

}