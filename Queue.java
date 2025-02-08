public class Queue {
    private int queue[], size, front,pos;

    Queue(int length) {
        queue = new int[length];
        front = 0;
        size = length;
        pos = 0;

        
    }

    public boolean enQueue(int element) {
        if (pos == size ) {
            System.out.println("OverFlow\n ");
            return false;
        } else {
            queue[pos] = element;
            pos++;
        }
        return true;
    }
    
    public boolean deQueue() {
        if (pos == 0) {
            System.out.println("Queue Empty\n");
            return false;
        } else {
            for (int i = 0; i < size - 1; i++) {
                queue[i] = queue[i + 1];
            }
            pos--;
        }
        return true;
    }

    public void printArray() {
        System.out.println();
        for (int i = 0; i < pos;i++) {
            System.out.print(queue[i]+" <- ");
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
