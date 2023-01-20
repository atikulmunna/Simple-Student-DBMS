package northsouth.edu;

import java.util.Scanner;
public class Student {
    private String FirstName;
    private String LastName;
    private String Courses;
    private String StudentID;
    private int Semester;

    private int TotalTuitionFee = 0;
    private static int TemplateID = 100000;
    private static int TuitionFeesPerCourse = 19500;

    public Student() {
        Scanner input = new Scanner(System.in);

        System.out.print("First Name: ");
        this.FirstName = input.nextLine();
        System.out.print("Last Name: ");
        this.LastName = input.nextLine();

        System.out.print("1. Spring\n2. Summer\n3. Fall\nSemester : ");
        this.Semester = input.nextInt();

        GeneratedStudentID();
    }

    private void GeneratedStudentID() {
        TemplateID = TemplateID + 1;
        this.StudentID = "22" + Semester + TemplateID;
    }

    public void advising() {
        System.out.println("Enter the course code\nof the course\nyou want to enroll to.\nType C if completed.\n");

        do {
            System.out.print("Course Code: ");
            Scanner input = new Scanner(System.in);
            String CourseCode = input.nextLine();

            if (!CourseCode.equals("C")) {
                Courses = Courses + "\n\t\t" + CourseCode;
                TotalTuitionFee = TotalTuitionFee + TuitionFeesPerCourse;
            } else {
                break;
            }
        } while (true);

        Balance1();
    }
    
    public void Balance1() {
        System.out.println("\nLibrary Fee- 1500 BDT\nStudent Activity Fee- 3000 BDT\nYour total tuition fee is: " + TotalTuitionFee + " BDT");
    }

    public void Balance2() {

        System.out.println("Your current balance is: " + TotalTuitionFee + " BDT");
    }

    public void Payment() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount you want to pay: ");
        int amount = input.nextInt();

        if (amount < (TotalTuitionFee / 2)) {
            System.out.println("\nSorry! You have to pay at least half of the total fee in the first installment\n");
            Payment();
        }
        else {
            TotalTuitionFee = TotalTuitionFee  - amount;
            System.out.println("Successfully paid " + amount + " BDT");
            Balance2();
            }
        }

    public String toString() {
        return "\n\nStudent Information:\nName: " + FirstName + " " + LastName + "\n" + "Student ID: " + StudentID + "\n" + "Enrolled Courses: " + Courses + "\n" + "Balance: " + TotalTuitionFee + " BDT";
    }

}
