package kr.ac.yyhighschool.serviceImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import kr.ac.yyhighschool.vo.UserVO;

public class MemberService implements UserDetailsService{

	//@Autowired UserService userService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {	

		/*UserVO userVO = userService.getUsersByID(username);
		
		if (userVO == null) {
			throw new UsernameNotFoundException("No user found with username" +                                                                                         userVO.getName());
		}
		Collection<SimpleGrantedAuthority> roles = new ArrayList<SimpleGrantedAuthority>();
		
		roles.add(new SimpleGrantedAuthority("ROLE_USER"));	
	    UserDetails user = new User(username, userVO.getPassword(), roles);
 
	    return user;*/
		return null;
	}
}