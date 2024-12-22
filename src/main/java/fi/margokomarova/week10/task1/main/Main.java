package fi.margokomarova.week10.task1.main;

import fi.margokomarova.week10.task1.entity.Account;
import fi.margokomarova.week10.task1.exception.WrongLoginException;
import fi.margokomarova.week10.task1.exception.WrongLoginOrPasswordException;
import fi.margokomarova.week10.task1.exception.WrongPasswordException;

import java.util.HashMap;

public class Main {
    public static void main(String args[]) {
        Account account = new Account();
        HashMap<String, String> loginPassword=new HashMap<>();
        loginPassword.put("hell0123", "hellotiger");
        account.setLoginPassword(loginPassword);
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
        try{
            account.checkLoginAndPassword("hello", "5555");
        } catch (WrongLoginOrPasswordException exception){
            System.out.println(exception);
        }
    }
}
