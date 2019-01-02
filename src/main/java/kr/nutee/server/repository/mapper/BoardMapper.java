package kr.nutee.server.repository.mapper;

import java.util.List;

import kr.nutee.server.dto.Board;

/*
 * BoardMapper Interface
 */

public interface BoardMapper {

	/*
	 * @return Board List
	 */
	public abstract List<Board> findAll();

}
