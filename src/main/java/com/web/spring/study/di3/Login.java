package com.web.spring.study.di3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Login {
    @Autowired
    private UserDAO userDAO;
    
    private boolean loging;

    public boolean isLoging() {
        return loging;
    }
    
    public Boolean check(String username,String password){
        loging =userDAO.getUsers()
                .stream()
                .anyMatch(u->u.get("username").equals(username)&&u.get("password").equals(password)); 
        return loging;  
       
    }
    
    
}
