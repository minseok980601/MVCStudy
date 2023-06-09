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
	public Member memLogin(Member mvo);	// 로그인 체크
	public int memUpdate(Member mvo);	// 수정하기
	public Member getMember(String memID);	// 회원ID 가져오기
	public void memProfileUpdate(Member mvo);	// 이미지 업로드
}
