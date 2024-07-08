package org.example;

public class Validator {

    static int validCount = 0;

    // validate user name;
    public static boolean userNameValidation(String userName){

        if(userName == "" || userName == null || userName.length() < 4){

            return false;
        }
        validCount++;
        return true;
    }

    // validate email
    public static boolean emailValidation(String email){
        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";

        if(!email.matches(regex)) return false;
        validCount++;
        return true;
    }

    // password validation
    public static boolean passwordValidation(String password){
        String regex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$";

        if(!password.matches(regex)) return false;

        validCount++;
        return true;
    }

    public static boolean dobValidation(String dob){
        int intDob = Integer.parseInt(dob);

        if(intDob < 16) return false;

        validCount++;
        return true;

    }

    public static boolean validate(){
        return validCount == 4;
    }

}
