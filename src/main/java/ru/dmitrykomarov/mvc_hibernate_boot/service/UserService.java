package ru.dmitrykomarov.mvc_hibernate_boot.service;

import ru.dmitrykomarov.mvc_hibernate_boot.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(long id);

    void saveUser(User user);

    void deleteUser(long id);

    void updateUser(User user);
}
