package fi.margokomarova.week10.task1.entity;

import fi.margokomarova.week10.task1.exception.WrongLoginException;
import fi.margokomarova.week10.task1.exception.WrongPasswordException;

public class Account {
    private String login;
    private String password;
    private String confirmation;

    //public Account (String login){
    //this.login=login;
    //}
    public void checkLogin(String login) throws WrongLoginException {
        if (login == null) {
            throw new WrongLoginException("Fill in login");
        }
        if (login.length() < 5 || login.length() > 20) {
            throw new WrongLoginException("Incorrect login");
        }
        this.login = login;
    }

    public void checkPassword(String password, String confirmation) throws WrongPasswordException {
        if (password == null) {
            throw new WrongPasswordException("Fill in password");
        }
        if (password.length() < 8 || password.length() > 20) {
            throw new WrongPasswordException("Incorrect password");
        }
        if (!password.equals(confirmation)) {
            throw new WrongPasswordException("Password and confirmation are not equal");
        }
        this.password = password;
    }

}
