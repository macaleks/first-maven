package org.example.alekdev.dao;

import org.example.alekdev.model.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class UserDaoImplIT {

    UserDaoImpl dao = new UserDaoImpl();

    @Test
    public void findByAge() {
        User user = dao.findByAge(37);

        assertEquals(37, user.getAge());
        assertNotEquals("Jake", user.getName());
    }
}