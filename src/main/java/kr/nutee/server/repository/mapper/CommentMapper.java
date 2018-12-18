package kr.nutee.server.repository.mapper;

import kr.nutee.server.dto.Comment;

public interface CommentMapper {
    /*Todo
    @param 작성
    @return 작성
     */
    public abstract int WriteComment(Comment comment);  // 댓글 작성
    public abstract int DeleteComment(Comment comment); // 댓글 삭제
    public abstract int ModifyComment(Comment comment); // 댓글 수정
    public abstract int ReportComment(Comment comment); // 댓글 신고
}
