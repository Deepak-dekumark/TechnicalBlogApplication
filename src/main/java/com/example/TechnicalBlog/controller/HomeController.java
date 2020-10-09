package com.example.TechnicalBlog.controller;

import com.example.TechnicalBlog.Service.PostService;
import com.example.TechnicalBlog.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@ComponentScan
public class HomeController {

    @Autowired
    private PostService postService;

    @RequestMapping("/")
    public String getAllPost(Model model){
        List posts=postService.getAllPost();
        model.addAttribute("posts",posts);
        return "index";
    }
}
