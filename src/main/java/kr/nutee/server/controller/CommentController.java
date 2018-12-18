package kr.nutee.server.controller;


import com.sun.xml.internal.bind.v2.TODO;
import kr.nutee.server.dto.Comment;
import kr.nutee.server.model.Insertion;
import kr.nutee.server.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("comment")
public class CommentController {

    /*Todo
    주석 작성
     */
    @Autowired
    CommentService commentService;

    @PostMapping("/write")
    public ResponseEntity<Void> write(Comment comment) {
        if (Insertion.SUCCESS.getCode() == commentService.WriteComment(comment)) {
            return new ResponseEntity<Void>(HttpStatus.OK);
        } else {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
    }
}
