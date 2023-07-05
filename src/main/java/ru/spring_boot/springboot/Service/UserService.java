package ru.spring_boot.springboot.Service;

import ru.spring_boot.springboot.models.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    void removeUserById(int id);

    List<User> getAllUsers();

    User getUser(int id);

    void updateUser(int id, User user);

}
