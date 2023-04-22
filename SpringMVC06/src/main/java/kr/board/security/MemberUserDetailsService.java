package kr.board.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import kr.board.entity.Member;
import kr.board.mapper.MemberMapper;

public class MemberUserDetailsService implements UserDetailsService{

	@Autowired
	private MemberMapper memberMapper;
	
	// loadUserByUsername 아이디의 해당하는 회원이 있는지 검사하고 패스워드 까지 검사해주는 메소드
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// 로그인 처리 하기
		Member mvo = memberMapper.memLogin(username);
		// --> UserDetails --> implements ---> User -> extends ---> MemberUser 
		if (mvo != null) {
			// return mvo;		// new MemberUser(mvo);		// Member, AuthVO
		} else {
			throw new  UsernameNotFoundException("user with username" + username + "does not exist.");
		}
		
	}

	
}
