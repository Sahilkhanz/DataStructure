public class CircularQueue {
    private int maxSize, queueArray[], front, rear;

    CircularQueue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = -1;
        rear = -1;
    }

    boolean isEmpty() {
        return front == -1;
    }

    boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    void enQueue(int element) {
        if (isFull()) {
            System.out.println("enQueue Opertion cannot take place as Queue is Full!");
            return;
        } else {
            if (isEmpty()) {
                front = 0;
                rear = 0;
            } else {
                rear = (rear + 1) % maxSize;
            }
            queueArray[rear] = element;
        }
    }
    
    int deQueue() {
        int item = -1;
        if (isEmpty()) {
            System.out.println("There is no item for deQueue as Queue is empty.");
        } else {
            item = queueArray[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % maxSize;
            }
        }
        return item;
    }

    void printArray() {
        if (isEmpty()) {
            System.out.println("There is no element to print. As the array is Empty...");
            return;
        }

        int i = front;
        while (true) {
            System.out.print(queueArray[i]+" <- ");
            if(i  == rear)
            break;
            i = (i + 1) % maxSize;
        }
    }

    public static void main(String[] args) {
        CircularQueue operation = new CircularQueue(3);

        operation.enQueue(1);
        operation.enQueue(2);
        operation.enQueue(3);
        operation.enQueue(3);

        operation.printArray();
        System.out.println("\nDeQueue"+operation.deQueue());
        System.out.println("DeQueue"+operation.deQueue());
        System.out.println("DeQueue"+operation.deQueue());
    }
}