package CustomizedExceptionAssignment;
public class InvalidAmountException extends Exception{
    InvalidAmountException(){
        System.out.println("Default");
    }
    InvalidAmountException(String msg){
        System.out.println("Parameter as msg "+msg);
    }
    InvalidAmountException(Throwable cause){
        System.out.println("Parameter as cause "+cause);
    }
    InvalidAmountException(String msg,Throwable cause){
        System.out.println("Parameter as msg and cause "+msg+" "+cause);
    }
}
