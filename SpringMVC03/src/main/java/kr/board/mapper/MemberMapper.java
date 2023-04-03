package kr.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import kr.board.entity.Board;
import kr.board.entity.Member;

@Mapper
public interface MemberMapper {
	
	public Member registerCheck(String memID);
	public int register(Member m);		// 회원등록(성공1, 실패0)
	
}