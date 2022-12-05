package com.example.demo.Service;


import com.example.demo.Model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();

    public User getUserById(Long id);

    public void saveUser(User user);

    public void updateUser(Long id, User updateUser);

    public void deleteUser(Long id);
}
