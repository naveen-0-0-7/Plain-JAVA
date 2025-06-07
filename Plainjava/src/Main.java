import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hostel hostel = new Hostel();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Remove Student");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Room: ");
                    String room = sc.nextLine();
                    hostel.addStudent(new Student(id, name, room));
                    break;

                case 2:
                    hostel.viewAll();
                    break;

                case 3:
                    System.out.print("Enter ID to remove: ");
                    int removeId = sc.nextInt();
                    hostel.removeStudent(removeId);
                    break;

                case 4:
                    System.out.println("Exiting.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);
    }
}
