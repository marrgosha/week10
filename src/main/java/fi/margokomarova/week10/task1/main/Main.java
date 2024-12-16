package fi.margokomarova.week10.task1.main;

import fi.margokomarova.week10.task1.entity.Account;
import fi.margokomarova.week10.task1.exception.WrongLoginException;
import fi.margokomarova.week10.task1.exception.WrongPasswordException;

public class Main {
    public static void main(String args[]) {
        Account account = new Account();
        try {
            account.checkLogin("hello");
        } catch (WrongLoginException e) {
            System.out.println(e);
        }
        try {
            account.checkPassword("hellotige", "hellotiger");
        } catch (WrongPasswordException exc) {
            System.out.println(exc);
        }
    }
}
