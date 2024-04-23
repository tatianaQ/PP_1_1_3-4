package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Имя1", "Фамилия1", (byte) 43);
        userService.saveUser("Имя2", "Фамилия2", (byte) 44);
        userService.saveUser("Имя3", "Фамилия3", (byte) 5);
        userService.saveUser("Имя4", "Фамилия4", (byte) 8);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}