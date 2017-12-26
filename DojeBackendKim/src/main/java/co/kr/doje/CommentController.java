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
import org.springframework.web.bind.annotation.ResponseBody;

import co.kr.doej.service.CommentService;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/comment")
public class CommentController {
	
	private static final Logger logger = LoggerFactory.getLogger(CommentController.class);
	
	@Autowired
	private CommentService commentService;
	
	@RequestMapping(value = "/{board_id}",produces="application/json", method = RequestMethod.GET)
	public @ResponseBody List<Map<String , String>> getCommentList(@PathVariable(value="board_id") int board_id) throws Exception {
		return commentService.getCommentList(board_id);
	}
	
	@RequestMapping(value = "" ,produces="application/json", method = RequestMethod.POST)
	public @ResponseBody int insertComment(@RequestBody Map<String  , String> reqParam) throws Exception {
		
		commentService.updateComment(reqParam);
		
		return commentService.insertComment(reqParam);
	}
	
	
}