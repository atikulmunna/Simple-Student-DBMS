package northsouth.edu;

import java.util.Scanner;

public class StudentDataManagement {
    public static void main(String[] args) {


        System.out.print("Number of new students to enroll: ");
        Scanner input= new Scanner(System.in);
        int NumberOfNewStudents = input.nextInt();

        Student[] n_students = new Student[NumberOfNewStudents];

        for(int i=0; i<NumberOfNewStudents; i++){
            n_students[i] = new Student();
            n_students[i].advising();
            n_students[i].Payment();
            System.out.println(n_students[i].toString());
        }
        for(int i=1; i<NumberOfNewStudents; i++){
            System.out.println(n_students[i].toString());
        }

    }
}

