package co.kr.doje;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import co.kr.doej.service.UserService;
import co.kr.doje.VO.UserVO;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "",produces="application/json", method = RequestMethod.GET)
	public @ResponseBody UserVO getLogin(@RequestParam Map<String, String> reqParam) throws Exception {
		logger.info(reqParam.toString());
		return userService.getLogin(reqParam);
	}
	
	@RequestMapping(value = "",produces="application/json", method = RequestMethod.POST)
	public @ResponseBody int insertUser(@RequestBody Map<String, String> reqParam) throws Exception {
		
		return userService.insertUser(reqParam);
	}
	
}
