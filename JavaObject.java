
import java.util.Scanner;

class Student {

    int roll_no;
    String name;

    Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }
}

public class JavaObject {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter the number of entries you want -> ");
        int entry = scan.nextInt();
        scan.nextLine(); // Consume the leftover newline character

        Student[] arr = new Student[entry];

        for (int j = 0; j < entry; j++) {
            System.out.println("Enter your Name -> ");
            String name1 = scan.nextLine();  // Read the full name
            System.out.println("Enter your Roll no. -> ");
            int roll_no1 = scan.nextInt();
            scan.nextLine(); // Consume the leftover newline character

            arr[j] = new Student(roll_no1, name1);
        }

        System.out.println("\nStudent Details:");
        for (int i = 0; i < entry; i++) {
            System.out.println("Roll no: " + arr[i].roll_no + " | Name: " + arr[i].name);
        }

        scan.close(); // Close the scanner to prevent memory leaks
    }
}
