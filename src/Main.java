import service.StudentService;

import java.util.Scanner;

public class Main {

    private static final StudentService studentService = new StudentService();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO THE STUDENT MANAGEMENT APPLICATION :)");

        while (true){
            System.out.println("Select operation: " +
                    "\n 1. Create Student" +
                    "\n 2. Get All Students" +
                    "\n 3. Find Student By Name" +
                    "\n 4. Exit system");

            int menu = sc.nextInt();

            if (menu == 1){
                studentService.createStudent();
            } else if (menu == 2) {
                studentService.getAllStudents();
            } else if (menu == 3) {
                studentService.findStudentByName();
            } else if (menu == 4){
                System.exit(200);
            }
        }
    }
}