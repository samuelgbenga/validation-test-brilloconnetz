package org.example;

public class User {
    private  String userName;

    private  String email;

    private  String password;

    private  String dateOfBirth;

    private String token;




    public String getUserName() {

        return userName;
    }

    public String getEmail() {



        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getToken(){
        return token;
    }

    public void setUserName(String userName) {

        this.userName = (Validator.userNameValidation(userName)) ? userName : "empty username or username less than 4";

       // this.userName = userName;
    }

    public void setEmail(String email) {

        this.email = (Validator.emailValidation(email)) ? email : "invalid email";

        //this.email = email;
    }

    public void setPassword(String password) {

        this.password = (Validator.passwordValidation(password)) ? password : "invalid password";

       // this.password = password;
    }

    public void setDateOfBirth(String dateOfBirth) {

        this.dateOfBirth = (Validator.dobValidation(dateOfBirth)) ? dateOfBirth : "less than 16";

        //this.dateOfBirth = dateOfBirth;
    }

    public void setToken(String token){
        this.token = token;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", dateOfBirth='" + token + '\'' +
                '}';
    }
}
