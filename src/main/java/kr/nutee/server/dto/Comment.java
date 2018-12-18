package kr.nutee.server.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.annotation.Generated;

/*
    Comment DTO
*/

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Comment {
    private String contents;    // 글내용
    private int userId;         // 글쓴이
    private boolean anonymous;  // 익명 선택 여부 ---- 익명 On = true && 익명 Off = false;

    /*
    auto Created var
    private int id;             //default auto_increment
    private String date;        //default getCurrentTimeMills - 날짜 생성자 필요?
    private int reComment;      //default 0
    private boolean deleted;    //default false
    private int articleId;      //default auto_increment
    private int report;         //default 0
     */

    protected Comment() {}


    /*Todo
    @param 작성 해야함
     */
    public Comment(String contents, int userId, boolean anonymous){
        super();
        this.contents = contents;
        this.userId = userId;
        this.anonymous = anonymous;
    }
}
