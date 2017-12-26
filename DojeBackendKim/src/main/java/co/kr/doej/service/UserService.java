package co.kr.doej.service;

import java.util.Map;

import co.kr.doje.VO.UserVO;

public interface UserService {
	public UserVO getLogin(Map<String ,  String> reqParam);
	public int insertUser(Map<String ,  String> reqParam);
}
