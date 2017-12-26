package co.kr.doje.serviceImpl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import co.kr.doej.service.BoardService;
import co.kr.doje.VO.BoardVO;
import co.kr.doje.dao.BoardDao;

@Service("boardService")
public class BoardServiceImpl implements BoardService{

	@Resource(name = "BoardDao")
	private BoardDao boardDao;
	
	
	@Override
	public List< Map<String , String> > getBoardList() {
		return boardDao.getBoardList();
	}


	@Override
	public int insertBoard(Map<String , String > reqParam) {
		return boardDao.insertBoard(reqParam);
	}


	@Override
	public Map<String , String> getBoard(int id) {
		return boardDao.getBoard(id);
	}


	@Override
	public int deleteBoard(int id) {
		return boardDao.deleteBoard(id);
	}


	@Override
	public int updateBoard(Map<String, String> reqParam) {
		return boardDao.updateBoard(reqParam);
	}

}
