package bootcamphomework1.controller;

import bootcamphomework1.dto.CommentResponse;
import bootcamphomework1.repository.ProductCommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class CommentController {

    @Autowired
    private ProductCommentRepository productCommentRepository;


    @GetMapping("/getUserComments/{name}")
    public List<CommentResponse> getUserComments(@PathVariable String name){
        return productCommentRepository.getUserComments(name);
    }

    @GetMapping("/getProductComment/{name}")
    public List<CommentResponse> getProductComment(@PathVariable String name){
        return productCommentRepository.getProductComment(name);
    }


}
