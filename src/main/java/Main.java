import HomeTaskLibraryProvision.Group;
import HomeTaskLibraryProvision.Student;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Group programmers = new Group();
        Scanner scanner = new Scanner(System.in);
        String name = "";
        String surname = "";
        Student student = new Student(surname, name);
        boolean exit = false;
        while (true) {
            programMenu();
            int userChoice = scanner.nextInt();
            if (userChoice == 5) {
                System.out.println("Enter name of student");
                name = scanner.next();
                System.out.println("Enter surname of student");
                surname = scanner.next();
                student = new Student(surname, name);
                programmers.add(student);
                programmers.printAll();
            } else if (userChoice == 6) {
                System.out.println("Which student y want change");
                int i=scanner.nextInt();
                System.out.println("Change name");
                name = scanner.next();
                System.out.println("Change surname");
                surname = scanner.next();
                programmers.renameStudent(i, surname, name);
                programmers.printAll();
            } else if (userChoice == 7){
                System.out.println("Which of the student u want remove");
                int i= scanner.nextInt();
                programmers.delStudent(i);
                programmers.printAll();
            }
            else if(userChoice == 8) {
                return;
            }
        }
    }

    public static void programMenu() {
        System.out.println(
                "Choose a menu item:" + "\n"
                        + "5. Add student" + "\n"
                        + "6. Rename student" + "\n"
                        + "7. Remove student" + "\n"
                        + "8. Exit" + "\n");
    }
}
