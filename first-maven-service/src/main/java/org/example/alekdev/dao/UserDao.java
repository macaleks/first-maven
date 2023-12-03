package org.example.alekdev.dao;

import org.example.alekdev.model.User;

public interface UserDao {

    User findByAge(int age);
}
