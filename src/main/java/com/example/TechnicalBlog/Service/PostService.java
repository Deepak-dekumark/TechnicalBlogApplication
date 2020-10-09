package com.example.TechnicalBlog.Service;

import com.example.TechnicalBlog.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
 public PostService(){
     System.out.println("********POST SERVICE********");
 }
    public List<Post> getAllPost(){
        List<Post> list=new ArrayList<Post>();
        Post post1 = new Post("Post-1", "Post-1 Body", new Date());
        Post post2=new Post("Post-2","Post-2 Body",new Date());
        Post post3=new Post("Post-3","Post-3 Body",new Date());
        list.add(post1);
        list.add(post2);
        list.add(post3);
        return list;
    }

    public List<Post> getOnePost(){
        List<Post> list=new ArrayList<Post>();
        Post post1 = new Post("This is your first post", "This is your first post.It has some valid comment", new Date());
        list.add(post1);
        return list;
    }

    public void createPost (Post newPost){
    }


}
