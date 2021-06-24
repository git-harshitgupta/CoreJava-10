import com.app.core.Student;

import java.util.ArrayList;
import java.util.Scanner;

import static Validation.Validation.*;

public class Tester {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            ArrayList<Student> students = new ArrayList<>();
            boolean exit = false;
            while(!exit){
                try {
                    System.out.println("1.Add Student\n2.Fetch Student Details\n3.Display all Student\n4.Cancel Admission\n5.Update GPA");
                    System.out.println("Enter your choose");
                    switch(sc.nextInt()){
                        case 1:
                            System.out.println("Enter prn,name,email,password,course,dateOfBirth,GPA");
                            Student e = new Student(sc.next(),sc.next(),validateEmail(sc.next()),validatePassword(sc.next()),convertCourse(sc.next()),convertDate(sc.next()),sc.next());
                            students.add(e);
                            break;
                        case 2:
                            System.out.println("Enter the PNR number");
                            Student pnr = new Student(sc.next());
                            int index = students.indexOf(pnr);
                            System.out.println(students.get(index));
                            break;
                        case 3:
                            for (Student temp : students){
                                System.out.println(temp);
                            }
                            break;
                        case 4:
                            System.out.println("Enter the pnr to be removed");
                            String removePnr = sc.next();
                            if(pnrVarification(removePnr,students)){
                                int removeIndex=students.indexOf(new Student(removePnr));
                                students.remove(removeIndex);
                            }
                            break;
                        case 5:
                            System.out.println("Enter the pnr to be updated");
                            String updatePnr = sc.next();
                            if(pnrVarification(updatePnr,students)){
                                int updateIndex=students.indexOf(new Student(updatePnr));
                                System.out.println("Enter name,course,dateOfBirth,GPA");
                                students.set(updateIndex,new Student(sc.next(),convertCourse(sc.next()),convertDate(sc.next()),sc.next()));
                            }
                    }
                }
                catch(Exception e){
                    e.printStackTrace();
                }
                sc.nextLine();
            }
        }
    }
}
