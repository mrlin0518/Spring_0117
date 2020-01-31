
package com.web.spring.study.di3;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class UserDAO {
    @Value("#{${users : {{'username': 'admin', 'password': '1234'}, {'username': 'john', 'password': '5678'}}}}")
    private List<Map<String,String>> users;

    public List<Map<String, String>> getUsers() {
        return users;
    }

    public void setUsers(List<Map<String, String>> users) {
        this.users = users;
    }
    
    public Map<String,String> getUser(String username){
        return users.stream().filter(u -> u.get("username").equals(username)).findFirst().get();
    }
    
    public String addUser(String username,String password){
        Map user = new LinkedHashMap();
        user.put("username", username);
        user.put("password", password);
        users.add(user);
        return "success";
    }
    
    public String updatePassword(String username,String password){
        Map<String,String> user = getUser(username);
        if(user==null) return "Username:"+username+" not fond";
        user.replace("password", password);
        return "Update Password success";
    }

    public String deleteUser(String username){
        Map<String,String> user= getUser(username);
        if(user==null) return "Username:"+username+" not fond";
        user.remove(username);
        return "Delete UserName success";
    }
    
    @Override
    public String toString() {
        return "UserDAO{" + "users=" + users + '}';
    }
    
}
