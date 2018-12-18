package kr.nutee.server.service;

import kr.nutee.server.dto.Comment;

public interface CommentService {
    /*Todo
    @param 작성
    @return 작성
    주석 작성
     */

    public abstract int WriteComment(Comment comment);  // 댓글 작성
    public abstract int DeleteComment(Comment comment); // 댓글 삭제
    public abstract int ModifyComment(Comment comment); // 댓글 수정
    public abstract int ReportComment(Comment comment); // 댓글 신고
}
