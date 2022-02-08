package CustomizeException;

public class StudentForm {


    public void register_Stu(int age) throws InvalidAgeException {
        if (age < 19)
            throw new InvalidAgeException("Not eligible for College"+" "+age);
    }
    public void register_Stu(String person){
        if(!person.equalsIgnoreCase("student"))
            throw new InvalidPersonException("Not a student"+" "+person);

    }
}
