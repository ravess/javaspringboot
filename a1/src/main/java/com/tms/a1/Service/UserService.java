package com.tms.a1.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tms.a1.Entity.User;

@Service
public interface UserService {
    User getUser(String username);
    List<User> getAllUsers();
    
}
