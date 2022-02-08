package CustomizeException;
public class InvalidPersonException extends RuntimeException{
    InvalidPersonException(){
        System.out.println("Default");
    }
    InvalidPersonException(String msg){
        System.out.println("Parameter as msg "+msg);
    }
    InvalidPersonException(Throwable cause){
        System.out.println("Parameter as cause "+cause);
    }
    InvalidPersonException(String msg,Throwable cause){
        System.out.println("Parameter as msg and cause "+msg+" "+cause);
    }
}
