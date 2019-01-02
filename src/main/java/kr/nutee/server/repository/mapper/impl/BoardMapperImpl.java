package kr.nutee.server.repository.mapper.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.nutee.server.dto.Board;
import kr.nutee.server.repository.mapper.BoardMapper;

/**
 * BoardMapper Implementation
 */
@Repository
public class BoardMapperImpl implements BoardMapper{

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<Board> findAll() {
		return sqlSession.selectList("findAll");
	}
}
