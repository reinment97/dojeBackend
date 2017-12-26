package co.kr.doje.serviceImpl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import co.kr.doej.service.CommentService;
import co.kr.doje.dao.CommentDao;

@Service("commentService")
public class CommentServiceImpl implements CommentService{

	@Resource(name = "CommentDao")
	private CommentDao commentDao;
	
	@Override
	public List<Map<String, String>> getCommentList(int board_id) {
		return commentDao.getCommentList(board_id);
	}

	@Override
	public int updateComment(Map<String, String> reqParam) {
		return commentDao.updateComment(reqParam);
	}

	@Override
	public int insertComment(Map<String, String> reqParam) {
		return commentDao.insertComment(reqParam);
	}

}
