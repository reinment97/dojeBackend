package co.kr.doje.daoImpl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.kr.doje.dao.CommentDao;


@Repository("CommentDao")
public class CommentDaoImpl implements CommentDao{

	@Autowired
	private SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public List<Map<String, String>> getCommentList(int board_id) {
		return sqlSession.selectList("getCommentList", board_id);
	}

	@Override
	public int updateComment(Map<String, String> reqParam) {
		return sqlSession.update("updateComment",reqParam);
	}

	@Override
	public int insertComment(Map<String, String> reqParam) {
		return sqlSession.insert("insertComment",reqParam);
	}

}
