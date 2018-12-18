package kr.nutee.server.repository.mapper.impl;

import kr.nutee.server.dto.Comment;
import kr.nutee.server.repository.mapper.CommentMapper;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CommentMapperImpl implements CommentMapper {
    /*Todo
    주석 작성 & Spring 방식에 맞는지 확인
     */
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;


    @Override
    public int WriteComment(Comment comment) {
        return sqlSessionTemplate.insert("write",comment);
    }

    @Override
    public int DeleteComment(Comment comment) {
        return 0;
    }

    @Override
    public int ModifyComment(Comment comment) {
        return 0;
    }

    @Override
    public int ReportComment(Comment comment) {
        return 0;
    }
}
