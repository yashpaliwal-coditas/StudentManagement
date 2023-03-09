package studentmanagement;

import java.util.Scanner;

public class Manu {
    void display(){
        boolean flag=true;
        Scanner sc = new Scanner(System.in);
        Manage manage = new Manage();
        while (flag){
            System.out.println("1: Add a student\n2: Display student \n3: Add student marks\n4: Display marks\n0: Exit");
            int choice = sc.nextInt();
            switch (choice){
                case 1: manage.get();
                break;
                case 2: manage.display();
                break;
                case 3: manage.addMarks();
                break;
                case 4: manage.DisplayResult();
                    break;
                case 0: flag = false;
            }
        }
    }
}
