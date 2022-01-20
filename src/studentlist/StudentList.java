package studentlist;

import java.util.Scanner;

/**
 * This class is to demonstrate arrays of Student objects
 * 
 * @author Paul Bonenfant
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // create array of students
        Student[] students = new Student[3];
        
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter name: ");
            
            String name = input.nextLine();
            
            Student student = new Student(name);
            
            students[i] = student;

//            students[i] = new Student(input.nextLine());

        }
        
        System.out.println("Printing them out");
        
        for (Student student: students) {
            System.out.println(student.getName());
        }

    }
}
