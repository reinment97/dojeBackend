package co.kr.doje.dao;

import java.util.List;
import java.util.Map;

public interface CommentDao {
	public List<Map<String , String>> getCommentList(int board_id);
	public int updateComment(Map<String , String> reqParam);
	public int insertComment(Map<String , String> reqParam);
}
