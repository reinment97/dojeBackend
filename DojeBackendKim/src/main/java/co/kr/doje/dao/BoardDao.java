package co.kr.doje.dao;

import java.util.List;
import java.util.Map;

import co.kr.doje.VO.BoardVO;

public interface BoardDao {
	public List< Map<String , String> > getBoardList();
	public int insertBoard(Map<String , String > reqParam);
	public Map<String , String> getBoard(int id);
	public int deleteBoard(int id);
	public int updateBoard(Map<String , String > reqParam);
}
