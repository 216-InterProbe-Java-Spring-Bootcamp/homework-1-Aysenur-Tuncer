package bootcamphomework1.controller;

import bootcamphomework1.dto.CommentRequest;
import bootcamphomework1.entity.User;
import bootcamphomework1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/addUser")
    public User user(@RequestBody CommentRequest request){
        return userRepository.save(request.getUser());
    }

    @GetMapping("/getUser")
    public List<User> getUser(){
        return userRepository.findAll();
    }
}
