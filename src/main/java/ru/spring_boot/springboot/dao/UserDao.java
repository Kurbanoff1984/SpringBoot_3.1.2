package ru.spring_boot.springboot.dao;


import ru.spring_boot.springboot.models.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    void removeUserById(int id);

    List<User> getAllUsers();

    User getUser(int id);
    void updateUser(int id, User user);
}
