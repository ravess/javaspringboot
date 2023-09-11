package com.tms.a1.Service;

import org.springframework.stereotype.Component;

import com.tms.a1.Entity.User;
import com.tms.a1.Repository.UserRepository;
import com.tms.a1.Exception.EntityNotFoundException;

import lombok.AllArgsConstructor;
import java.util.List;
import java.util.Optional;
@AllArgsConstructor
@Component
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Override
    public User getUser(String username) {
        Optional<User> user = userRepository.findByUsername(username);
        return unwrapUser(user, username);
    }
    @Override
    public List<User> getAllUsers() {
        return (List<User>)userRepository.findAll();
    }

    static User unwrapUser(Optional<User> entity, String username) {
        if (entity.isPresent()) return entity.get();
        else throw new EntityNotFoundException(username, User.class);
    }
}
