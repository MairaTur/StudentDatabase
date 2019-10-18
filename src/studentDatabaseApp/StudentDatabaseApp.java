package studentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        System.out.print("Enter number of student to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        for (int n = 0; n<numOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].toString());
        }
        // сколько новых пользователей будет добавлено

        // создать n-количество новых пользователей


    }
}
