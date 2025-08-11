import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        StudentManagementSystem sms = new StudentManagementSystem();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.Student add");
            System.out.println("2.Student List");
            System.out.println("3.Student update");
            System.out.println("4.Student delete");
            System.out.println("5.choice");
            int choice = sc.nextInt();
            boolean isExist = false;


            switch (choice) {
                case 1:
                    System.out.println("Student name");
                    String name = sc.next();
                    System.out.println("Student surname");
                    String surname = sc.next();
                    System.out.println("Student email");
                    String email = sc.next();
                    sms.addStudent(name, surname, email);
                    break;
                case 2:
                    sms.listStudents();
                    break;
                case 3:
                    System.out.println("Student ID to Update");
                    int id = sc.nextInt();
                    System.out.println("New name:");
                    String newName = sc.next();
                    System.out.println("New surname:");
                    String newSurname = sc.next();
                    System.out.println("New email:");
                    String newEmail = sc.next();
                    sms.updateStudent(id, newName, newSurname, newEmail);
                    break;
                case 4:
                    System.out.println("Student ID to Delete");
                    int deleteId = sc.nextInt();
                    sms.deleteStudent(deleteId);
                    break;
                case 5:
                    System.out.println("Exit");
                    isExist = true;
                    break;
                default:
                    System.out.println("Wrong choice");

            }
            if (isExist) {
                break;
            }
        }


    }
}
