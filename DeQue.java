import java.util.Scanner;

public class DeQue {
    private int capacity, queueArray[], front, rear, size;

    DeQue(int length) {
        capacity = length;
        queueArray = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    boolean isEmpty() {
        return size==0;

    }

    boolean isFull() {
        return (rear + 1) % capacity == front;
    }

    void enQueueInFront(int element) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        } else {
            if (isEmpty()) {
                front = 0;
                rear = 0;
            } else {
                front = (front - 1 + capacity) % capacity;
            }
            queueArray[front] = element;
            size++;
        }
    }

    void enQueueAtRear(int element) {
        if (isFull()) {
            System.out.println("Queue is Full!....");
            return;
        } else {
            if (isEmpty()) {
                front = 0;
                rear = 0;
            } else {
                rear = (rear + 1) % capacity;
            }
            queueArray[rear] = element;
            size++;
        }
    }

    void printArray() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return;
        } else {
            int i = front;
            int count = 0;
            while (count < size) {
                System.out.print(queueArray[i] + " <- ");

                i = (i + 1) % capacity;
                count++;
            }
        }
        System.out.println();
    }

    int deQueueAtRear() {
        int item = -1;
        if (isEmpty()) {
            System.out.println("Queue is empty -_- ");
        } else {
            item = queueArray[rear];
            if (rear ==  front) {
                rear = -1;
                front = -1;
            } else {
                rear = (rear - 1) % capacity;
            }
            size--;
        }

        return item;
    }

    int deQueueAtfront() {
        int item = -1;
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
        } else {
            item = queueArray[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % capacity;
            }
            size--;
        }
        return item;
    }

    public static void main(String[] args) {
        DeQue func;
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter the Size of the array -> ");
        int size = scan.nextInt();
        func = new DeQue(size);
        

        System.out.println(
                "\nPress ->\n 1. EnQueue At Front\n 2. EnQueue At Rear\n 3.DeQueue At Front\n 4.DeQueue At Rear\n 5.Print Queue\n 6.Exit");
        while (true) {
            System.out.print("Enter the option ->");
            int num = scan.nextInt();
            int element;
            switch (num) {
                case 1:
                    System.out.print("\n Enter the Element  -> ");
                     element = scan.nextInt();
                    func.enQueueInFront(element);                
                    break;            
                case 2:
                    System.out.println("Enter the Element  -> ");
                     element = scan.nextInt();
                     func.enQueueAtRear(element);
                    break;
            
                case 3:
                System.out.println("Element DeQueue from front -> "+func.deQueueAtfront());
                
                break;
                
                case 4:
                System.out.println("Element DeQueue from Rear -> "+func.deQueueAtRear());
                    
                    break;
            
                case 5:
                    func.printArray();
                    break;
            
                case 6:
                    return;
            
                default:
                System.out.println("invalid input");
                    break;
            }
        }

    }
}