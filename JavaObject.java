
class Student {

    int roll_no;
    String name;

    Student(int roll_no, String name) {
        this.name = name;
        this.roll_no = roll_no;
    }
}

public class JavaObject {

    public static void main(String[] args) {
        Student[] arr;
        arr = new Student[5];
        arr[0] = new Student(1, "Sahil");
        arr[1] = new Student(2, "Ansh");
        arr[2] = new Student(3, "Abhishek");
        arr[3] = new Student(4, "Aakash");
        arr[4] = new Student(5, "Aditya");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Roll no. -> " + arr[i].roll_no + " Name -> " + arr[i].name + "\n");
        }
    }
}
