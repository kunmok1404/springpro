package kr.board.mvc01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.board.mvc01.entity.Board;

@Mapper
public interface BoardMapper {

	public List<Board> getList(); // 게시판 전체목록 조회 
	public void boardInsert(Board vo);
	public Board boardContent(Integer idx);
}
