package co.kr.doje.dao;

import java.util.Map;

import co.kr.doje.VO.UserVO;

public interface UserDao {
	public UserVO getLogin(Map<String , String> reqParam);
	public int insertUser(Map<String , String> reqParam);
}
