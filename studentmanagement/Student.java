package studentmanagement;

import java.util.Arrays;

public class Student {
    int rollNo,age,resultId,total;
    String name,division,address,passingStatus="PASS";
    int[] marks = new int[5];

    public Student(int rollNo, int age, String name, String division, String address) {
        this.rollNo = rollNo;
        this.age = age;
        this.name = name;
        this.division = division;
        this.address = address;
    }

    public String toString1() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", division='" + division + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", age=" + age +
                ", resultId=" + resultId +
                ", total=" + total +
                ", name='" + name + '\'' +
                ", division='" + division + '\'' +
                ", address='" + address + '\'' +
                ", passingStatus='" + passingStatus + '\'' +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
