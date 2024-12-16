package fi.margokomarova.week10.task1.exception;

public class WrongPasswordException extends Exception {

    public WrongPasswordException (){
     }

    public WrongPasswordException(Exception cause){
        super(cause);
    }

    public WrongPasswordException(String message){
        super(message);
    }
    public WrongPasswordException(String message,Exception cause){
        super(message, cause);
    }



}
