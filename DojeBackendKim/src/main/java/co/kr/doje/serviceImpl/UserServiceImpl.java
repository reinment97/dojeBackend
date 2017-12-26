package co.kr.doje.serviceImpl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import co.kr.doej.service.UserService;
import co.kr.doje.VO.UserVO;
import co.kr.doje.dao.UserDao;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Resource(name = "UserDao")
	private UserDao userDao;
	
	
	@Override
	public UserVO getLogin(Map<String, String> reqParam) {
		return userDao.getLogin(reqParam);
	}


	@Override
	public int insertUser(Map<String, String> reqParam) {
		return userDao.insertUser(reqParam);
	}

}
