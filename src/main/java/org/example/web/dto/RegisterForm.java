package org.example.web.dto;

public class RegisterForm {

    private String username;
    private String password;

    public RegisterForm(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public RegisterForm() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "RegisterForm{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
