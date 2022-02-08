package CustomizeException;
public class InvalidAgeException extends Exception {
    InvalidAgeException(){
        System.out.println("Default");
    }
    InvalidAgeException(String msg){
        System.out.println("Parameter as msg "+msg);
    }
    InvalidAgeException(Throwable cause){
        System.out.println("Parameter as cause "+cause);
    }
    InvalidAgeException(String msg,Throwable cause){
        System.out.println("Parameter as msg and cause "+msg+" "+cause);
    }
}
