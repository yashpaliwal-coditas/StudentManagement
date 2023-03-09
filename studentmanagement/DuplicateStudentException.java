package studentmanagement;

public class DuplicateStudentException extends Exception{
    DuplicateStudentException(){
        System.out.println("Student already exist");
    }
}
