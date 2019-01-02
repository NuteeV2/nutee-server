package kr.nutee.server.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
 * Board DTO
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Board {

	private int id;
	private String boardName;

}
