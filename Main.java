package CustomizeException;

public class Main {
    public static void main(String[] args) {
        StudentForm obj_sf=new StudentForm();
            try {
                try{
                    obj_sf.register_Stu(17);
                }
                catch (InvalidAgeException e){
                    System.out.println(e);
                    obj_sf.register_Stu("person");
                }
            } catch (InvalidPersonException e) {
                System.out.println(e);

        }
            }
}
