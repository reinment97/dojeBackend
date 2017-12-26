package co.kr.doje;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import co.kr.doej.service.BoardService;
import co.kr.doje.VO.BoardVO;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/board")
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value = "",produces="application/json", method = RequestMethod.GET)
	public @ResponseBody List<Map<String , String>> getBoardList(@RequestParam Map<String, String> reqParam) throws Exception {
		
		return boardService.getBoardList();
	}

	@RequestMapping(value = "/{id}",produces="application/json", method = RequestMethod.GET)
	public @ResponseBody Map<String , String> getBoard(@PathVariable(value="id") int id) throws Exception {
		
		return boardService.getBoard(id);
	}
	
	@RequestMapping(value = "",produces="application/json", method = RequestMethod.POST)
	public @ResponseBody int insertBoard(@RequestBody Map<String, String> reqParam) throws Exception {
		return boardService.insertBoard(reqParam);
	}
	
	@RequestMapping(value = "",produces="application/json", method = RequestMethod.PUT)
	public @ResponseBody int updateBa(@RequestBody Map<String, String> reqParam) throws Exception {
		logger.info(reqParam.toString());
		return boardService.updateBoard(reqParam);
	}
	
	@RequestMapping(value = "/{id}",produces="application/json", method = RequestMethod.DELETE)
	public @ResponseBody int insertBoard(@PathVariable(value="id") int id) throws Exception {
		return boardService.deleteBoard(id);
	}
	
	
	
}