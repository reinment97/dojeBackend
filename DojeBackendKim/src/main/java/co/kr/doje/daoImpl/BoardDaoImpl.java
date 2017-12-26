package co.kr.doje.daoImpl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.kr.doje.VO.BoardVO;
import co.kr.doje.dao.BoardDao;

@Repository("BoardDao")
public class BoardDaoImpl implements BoardDao{

	@Autowired
	private SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public List< Map<String , String> > getBoardList() {
		return sqlSession.selectList("getBoardList");
	}

	@Override
	public int insertBoard(Map<String , String > reqParam) {
		return sqlSession.insert("insertBoard", reqParam);
	}

	@Override
	public Map<String , String> getBoard(int id) {
		return sqlSession.selectOne("getBoard",id);
	}

	@Override
	public int deleteBoard(int id) {
		return sqlSession.delete("deleteBoard",id);
	}

	@Override
	public int updateBoard(Map<String, String> reqParam) {
		return sqlSession.update("updateBoard", reqParam);
	}
	 
}
