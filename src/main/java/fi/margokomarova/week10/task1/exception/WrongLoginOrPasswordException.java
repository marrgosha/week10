package fi.margokomarova.week10.task1.exception;

public class WrongLoginOrPasswordException extends Exception {

    public WrongLoginOrPasswordException(){
    }

    public WrongLoginOrPasswordException(Exception cause){
        super(cause);
    }

    public WrongLoginOrPasswordException (String message){
        super(message);
    }

    public WrongLoginOrPasswordException (String message,Exception cause){
        super(message,cause);
    }



}
