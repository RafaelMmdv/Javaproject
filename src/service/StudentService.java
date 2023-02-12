package service;

import config.StudentConfig;
import exception.NotFoundException;
import model.Student;

import java.util.*;

public class StudentService {

    private static Scanner sc = new Scanner(System.in);

    public static Student fillStudent() {
        System.out.println("Enter name : ");
        sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Enter surname: ");
        sc = new Scanner(System.in);
        String surname = sc.nextLine();

        System.out.println("Enter age: ");
        sc = new Scanner(System.in);
        int age = sc.nextInt();

        System.out.println("Enter group number: ");
        sc = new Scanner(System.in);
        String groupNumber = sc.nextLine();

        Student student = new Student(name, surname, age, groupNumber);

        return student;
    }

    public void createStudent() {

        System.out.println("How many students you will register?");
        int count = sc.nextInt();
        StudentConfig.students = new Student[count];

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". Register");
            StudentConfig.students[i] = fillStudent();
        }

        System.out.println("Student successfully registered : ");
    }


    public void getAllStudents() {

        checkArrayIsNull();

        for (int i = 0; i < StudentConfig.students.length; i++) {
                Student student = StudentConfig.students[i];
                System.out.println((i + 1) + "." + student.getFullInfo());
        }


    }

    public void findStudentByName(){
        checkArrayIsNull();

        sc = new Scanner(System.in);
        System.out.println("Enter student name : ");
        String name = sc.nextLine();



        for (int i = 0; i < StudentConfig.students.length; i++){

            if (StudentConfig.students[i].getName().contains(name)){
                System.out.println(StudentConfig.students[i].getFullInfo());
            }
            else {
                throw new NotFoundException("Student not found !");
            }
        }
    }
    public void checkArrayIsNull(){
        if (StudentConfig.students ==null){
            throw new NotFoundException("Array is null");
        }
    }
}
