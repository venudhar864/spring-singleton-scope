package com.example.client;
import com.example.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        // First request
        UserService user1 = (UserService) context.getBean("userService");
        user1.setUserId(1);
        user1.setFirstName("Alen");
        user1.setLastName("Kevin");
        user1.setUserName(user1.getFirstName()+" "+user1.getLastName());


        System.out.println("Hello object user1 Your name is: " + user1.getUserName());

        // Second request
        UserService user2 = (UserService) context.getBean("userService");

        System.out.println("Hello object user1 Your name is: " + user2.getUserName());

        // Compare references
        System.out.println("'user1' and 'user2' refer to same object: " + (user1 == user2));

        // Print memory addresses
        System.out.println("Address of user1: " + user1);
        System.out.println("Address of user2: " + user2);
    }
}