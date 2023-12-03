package org.example.alekdev.dao;

import org.example.alekdev.model.User;

public class UserDaoImpl implements UserDao {
    @Override
    public User findByAge(int age) {
        return new User("Person about " + age + " years", age);
    }
}
