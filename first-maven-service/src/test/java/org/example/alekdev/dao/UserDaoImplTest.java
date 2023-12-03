package org.example.alekdev.dao;

import org.example.alekdev.model.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserDaoImplTest {

    UserDaoImpl dao = new UserDaoImpl();

    @Test
    public void findByAge() {
        User user = dao.findByAge(37);

        assertEquals(37, user.getAge());
    }
}