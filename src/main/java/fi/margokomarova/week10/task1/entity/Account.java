package fi.margokomarova.week10.task1.entity;

import fi.margokomarova.week10.task1.exception.WrongLoginException;

public class Account {
    private String login;

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
}
