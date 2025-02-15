public class Queue {
    private int queue[], size, front, rear, count;

    Queue(int length) {
        queue = new int[length];
        size = length;
        front = 0;
        rear = -1;
        count = 0;
    }

    public boolean enQueue(int element) {
        if (count == size) {
            System.out.println("OverFlow\n");
            return false;
        } else {
            rear = (rear + 1) % size;
            queue[rear] = element;
            count++;
        }
        return true;
    }

    public boolean deQueue() {
        if (count == 0) {
            System.out.println("Queue Empty\n");
            return false;
        } else {
            front = (front + 1) % size;
            count--;
        }
        return true;
    }

    public void printArray() {
        System.out.println();
        for (int i = 0; i < count; i++) {
            System.out.print(queue[(front + i) % size] + " <- ");
        }
    }

    public static void main(String[] args) {
        Queue operation = new Queue(6);

        operation.enQueue(1);
        operation.enQueue(2);
        operation.enQueue(3);
        operation.enQueue(4);
        operation.enQueue(5);
        operation.printArray();
        operation.deQueue();
        operation.printArray();
        operation.deQueue();
        operation.printArray();
    }
}


