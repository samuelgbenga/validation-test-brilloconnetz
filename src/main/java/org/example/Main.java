package org.example;

import java.util.Scanner;

public class Main {





    public static void main(String[] args) {

        User user = new User();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your user name: ");
        user.setUserName(input.nextLine());

        System.out.print("Enter your Email: ");
        user.setEmail(input.nextLine());

        System.out.print("Enter your password: ");
        user.setPassword(input.nextLine());

        System.out.print("Enter your DOB: ");
        user.setDateOfBirth(input.nextLine());

        if(Validator.validate()) {

            user.setToken(JwtPrimaryKeyGen.jwtKeyGen(user.getUserName()));

           // System.out.println(user.getToken());

            if(JwtPrimaryKeyGen.verifyToken(user.getToken())){
                System.out.println("Verification Passed");
            }else{
                System.out.println("Verification Failed");
            };

            }
        else {
            System.out.println(user);
        };


    }
}