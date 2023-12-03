package org.example.alekdev.dao;

public class ServiceMain {
    public static void main(String[] args) {
        System.out.println((new UserDaoImpl()).findByAge(10));
    }
}
