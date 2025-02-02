
import java.util.Scanner;

public class Stack {

    int MAX = 100;
    int stack[] = new int[MAX];
    int top;

    Stack() {
        top = -1;
    }

    boolean push(int num) {
        if (top == MAX - 1) {
            System.out.println("Stack is Full");
            return false;
        } else {
            top++;
            stack[top] = num;
            System.out.println(num + " at " + top + " is inserted successfully");
        }
        return true;
    }

    boolean pop() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return false;
        } else {
            System.out.println(stack[top] + " is pop out of the stack ");
            top--;
        }
        return true;
    }

    int peak() {
        if (top == -1) {
            System.out.println("The Stack is Empty");
            return -1;
        }
        return stack[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == MAX - 1;
    }

    void printStack() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack stack = new Stack();
        while (true) {
            System.out.println(
                    "Enter the num for the operation \n 1.Push\n 2.Pop\n 3.Check If stack is full\n 4.Check If stack is empty\n 5.Print Last Element of stack\n 6.Print Stack\n 7.exit ");
            int num = scan.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Enter the element");
                    int element = scan.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    if (stack.isFull()) {
                        System.out.println("The stack is full.");
                    } else {
                        System.out.println("The stack is not full.");
                    }
                    break;
                case 4:
                    if (stack.isEmpty()) {
                        System.out.println("The stack is empty.");
                    } else {
                        System.out.println("The stack is not empty.");
                    }
                    break;
                case 5:
                    System.out.println("The peak element is :" + stack.peak());
                    break;
                case 6:
                    stack.printStack();
                    break;
                case 7:
                    System.out.println("Exiting the program...");
                    return; // Exit the loop and stop the program
            }
        }
    }

}
