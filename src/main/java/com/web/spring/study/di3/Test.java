package com.web.spring.study.di3;

import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
         String username;
         String password;
        ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/java/com/web/spring/study/di3/applicationConfig.xml");
        UserDAO userDAO = (UserDAO) ctx.getBean("userDAO");
        Login login = (Login) ctx.getBean("login");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter UserName and Password");
        System.out.println("Login:" + login.check(sc.next(), sc.next()));
        if (login.isLoging()) {
            while (!sc.nextLine().equals("exit")) {
                System.out.println("1.getUsers");
                System.out.println("2.getUser");
                System.out.println("3.updatePassword");
                System.out.println("4.deleteUser");
                switch (sc.nextLine()) {
                    case "1":
                        System.out.println(userDAO.getUsers());
                        break;
                    case "2":
                        System.out.println("Enter UserName");
                        System.out.println(userDAO.getUser(sc.next()));
                        break;
                    case "3":
                        System.out.println("Update PassWord");
                        System.out.println("Enter UserName ");
                        username = sc.nextLine();
                        System.out.println("Enter PassWord");
                        password = sc.nextLine();
                        System.out.println(userDAO.updatePassword(username, password));
                        break;
                    case "4":
                        System.out.println("Delete UserName");
                        System.out.println("Enter UserName ");
                        username = sc.nextLine();
                        System.out.println(userDAO.deleteUser(username));
                        break;
                }

            }
        }

    }

}
