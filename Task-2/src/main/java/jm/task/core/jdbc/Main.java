package jm.task.core.jdbc;


import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь

        UserServiceImpl userService = new UserServiceImpl(); // создал экземпляр класса UserServiceImpl,реализующий интерфейс userService
        userService.createUsersTable();

        try {

            userService.saveUser("Ivan", "Petrov", (byte) 30);
            userService.saveUser("Petr", "Ivanov", (byte) 25);
            userService.saveUser("Anna", "Gennadievna", (byte) 28);
            userService.saveUser("Maria", "Olegovna", (byte) 22);


            System.out.println("Список пользователей:");
            userService.getAllUsers().forEach(System.out::println);


             } finally {
            //userService.cleanUsersTable();
          // userService. removeUserById(14);
       // userService.cleanUsersTable();
        }
    }
}