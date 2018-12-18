package kr.nutee.server.service.impl;

import kr.nutee.server.dto.Comment;
import kr.nutee.server.repository.mapper.CommentMapper;
import kr.nutee.server.service.CommentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentMapper commentMapper;
    /*Todo
    주석 작성
     */

    @Override
    public int WriteComment(final Comment comment) {
        return commentMapper.WriteComment(comment);
    }

    @Override
    public int DeleteComment(final Comment comment) {
        return 0;
    }

    @Override
    public int ModifyComment(final Comment comment) {
        return 0;
    }

    @Override
    public int ReportComment(final Comment comment) {
        return 0;
    }
}
