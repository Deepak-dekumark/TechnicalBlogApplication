package com.example.TechnicalBlog.controller;

import com.example.TechnicalBlog.Service.PostService;
import com.example.TechnicalBlog.Service.UserService;
import com.example.TechnicalBlog.model.Post;
import com.example.TechnicalBlog.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
   @Autowired
    private PostService postService;

    @RequestMapping("users/login")
    public String login(){
        return "users/login";
    }

    @RequestMapping(value="users/logout",method=RequestMethod.POST)
    public String logout(Model model){
      List<Post> posts=  postService.getAllPost();
      model.addAttribute("posts",posts);
      return "index";
    }

    @RequestMapping(value="users/login",method=RequestMethod.POST)
    public String loginUser(User user){
        if(userService.login(user))
      return "redirect:/posts";
        else
            return "redirect:/users/login";
    }

    @RequestMapping("users/registration")
    public String registration(){
        return "users/registration";
    }

    @RequestMapping(value="users/registration",method=RequestMethod.POST)
    public String registerUser(User user){
        return "users/login";
    }
}
