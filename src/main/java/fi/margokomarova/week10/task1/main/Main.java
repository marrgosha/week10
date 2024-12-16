package fi.margokomarova.week10.task1.main;

import fi.margokomarova.week10.task1.entity.Account;
import fi.margokomarova.week10.task1.exception.WrongLoginException;

public class Main {
    public static void main(String args[]) {
        Account account = new Account();
        try {
            account.checkLogin("hell");
        } catch (WrongLoginException e) {
            System.out.println(e);
        }
    }
}
