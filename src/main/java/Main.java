import HomeTaskLibraryProvision.Group;
import HomeTaskLibraryProvision.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Group programmers = new Group();
        Scanner scanner = new Scanner(System.in);
        String name = "";
        String surname = "";
        Student student1 = new Student(surname, name);
        System.out.println("Enter quantity if students");
        int quantity = scanner.nextInt();
        Student[] students = new Student[quantity];
        int quantityOfStudents;
        boolean exit = false;
        while (!exit) {
            programMenu();
            int userChoice = scanner.nextInt();
            if (userChoice == 1) {
                for (int i = 0; i < students.length; i++) {
                    System.out.println("Enter name of student");
                    name = scanner.next();
                    System.out.println("Enter surname of student");
                    surname = scanner.next();
                    students[i] = new Student(surname, name);
                    programmers.add(students[i]);
                }
                programmers.printAll();
            } else if (userChoice == 2) {
                System.out.println("Which number of student you wish rename");
                int number = scanner.nextInt();
                System.out.println("Enter new name of student");
                name = scanner.next();
                System.out.println("Enter new surname of student");
                surname = scanner.next();
                programmers.renameStudent(students[number], surname, name);
                programmers.printAll();
            } else if (userChoice == 3) {
                System.out.println("Which number of student you wish remove");
                int number = scanner.nextInt();
                programmers.delStudent(students[number]);
                programmers.printAll();
            } else if (userChoice == 4) {
                exit = true;
            } else {
                return;
            }
        }
    }

    public static void programMenu() {
        System.out.println(
                "Choose a menu item:" + "\n"
                        + "1. Add" + "\n"
                        + "2. Change" + "\n"
                        + "3. Remove" + "\n"
                        + "4. Exit" + "\n");
    }
}
