package studentmanagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class Manage {
    List<Student> list = new ArrayList<>();
    void get(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roll number");
        int rollNo =sc.nextInt();
        boolean check = false;
        for(Student s:list){
            if(s.rollNo==rollNo){
                check = true;
                break;
            }
        }
        if(check){
            try{
                throw new DuplicateStudentException();
            }
            catch (DuplicateStudentException r){
                System.out.println("Please entered correct rollnumber");
            }
            return;
        }

        System.out.println("Enter the age");
        int age = sc.nextInt();
        System.out.println("Enter the name");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Enter the division");
        String division = sc.nextLine();
        System.out.println("Enter the address");
        String address = sc.nextLine();
        list.add(new Student(rollNo,age,name,division,address));
    }
    void display(){
        for(Student s:list){
            System.out.println(s.toString1());
        }
    }
    void addMarks(){
        Scanner sc = new Scanner(System.in);
        int grace=1;
        System.out.println("Enter the rollno");
        int rollNo = sc.nextInt();
        boolean check = false;
        for(Student s:list){
            if(s.rollNo==rollNo){
                check = true;
                System.out.println("Please enter result ID");
                s.resultId = sc.nextInt();
                System.out.println("Enter marks of 5 subject line by line");
                s.total=0;
                for(int i=0;i<5;i++){

                    int mark=sc.nextInt();
                    if(mark<0 || mark>100){
                        try{
                            throw new MarksNotInRangeException();
                        }catch (MarksNotInRangeException m){
                            i--;
                            System.out.println("Please enter marks carefully");
                        }
                    }else{
                        if(mark<35 && grace!=0){
                            mark+=5;
                            grace--;
                        }
                        s.total += mark;
                        s.marks[i] = mark;
                        if(mark<35 ){

                            s.passingStatus="FAIL";
                        }
                    }
                }
                break;
            }
        }
        if(!check){
            try{
                throw new RollNumberException();
            }
            catch (RollNumberException r){
                System.out.println("Please entered correct rollnumber");
            }
        }
    }
    void DisplayResult(){
        Collections.sort(list,new Comparator<Student>(){
            public int compare(Student s1,Student s2){
                return s1.rollNo -s2.rollNo;
            }
        });
        for(Student s:list){
            System.out.println(s);
        }
    }
}
