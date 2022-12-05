package com.example.demo.Dao;


import com.example.demo.Model.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllUsers();

    public User getUserById(Long id);

    public void saveUser(User user);

    public void deleteUser(Long id);
}
