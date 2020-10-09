package com.example.TechnicalBlog.Service;

import com.example.TechnicalBlog.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserService(){
        System.out.println("*********User Service*********");
    }
    public boolean login(User user){
  if(user.getUserName().equals("validUser"))
      return true;
  return false;
    }
}
