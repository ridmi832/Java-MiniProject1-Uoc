import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddStudent add = new AddStudent();
        ViewStudents view = new ViewStudents();
        UpdateStudent update = new UpdateStudent();
        DeleteStudent delete = new DeleteStudent();

        while (true) {
            System.out.println("\n=== Student Database Menu ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    add.addStudent(id, name, age);
                    break;
                case 2:
                    view.viewAllStudents();
                    break;
                case 3:
                    System.out.print("Enter ID to update: ");
                    int updateId = sc.nextInt();
                    System.out.print("Enter new Name: ");
                    String newName = sc.next();
                    System.out.print("Enter new Age: ");
                    int newAge = sc.nextInt();
                    update.updateStudent(updateId, newName, newAge);
                    break;
                case 4:
                    System.out.print("Enter ID to delete: ");
                    int deleteId = sc.nextInt();
                    delete.deleteStudent(deleteId);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
                    //want to check a commot
            }
        }
    }
}
