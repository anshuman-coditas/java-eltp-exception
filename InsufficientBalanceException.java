package CustomizedExceptionAssignment;

public class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(){
        System.out.println("Default");
    }
    InsufficientBalanceException(String msg){
        System.out.println("Parameter as msg "+msg);
    }
    InsufficientBalanceException(Throwable cause){
        System.out.println("Parameter as cause "+cause);
    }
    InsufficientBalanceException(String msg,Throwable cause){
        System.out.println("Parameter as msg and cause "+msg+" "+cause);
    }
}
