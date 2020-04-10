package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter your login: ");
            String login = scanner.nextLine();
            System.out.println("Enter your password: ");
            String password = scanner.nextLine();


            Thread th = new Thread(new GetThread());
            th.setDaemon(true);//умирает с мейном
            th.start();


            while (true) {
                String text = scanner.nextLine();
                if (login.isEmpty()) {
                    System.out.println("Please, register");
                }

            }
        } finally {
            scanner.close();
        }
    }
}


