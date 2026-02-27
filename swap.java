import java.util.LinkedList;
import java.util.Queue;

class SwapNumbers {
    int num1, num2;

    SwapNumbers(int a, int b) {
        num1 = a;
        num2 = b;
    }

    void swap() {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(num1);
        queue.add(num2);

        num1 = queue.poll();
        num2 = queue.poll();
    }

    void display() {
        System.out.println("First Number = " + num1);
        System.out.println("Second Number = " + num2);
    }
}

public class Main {
    public static void main(String[] args) {
        SwapNumbers obj1 = new SwapNumbers(10, 20);
        SwapNumbers obj2 = new SwapNumbers(obj1.num2, obj1.num1);

        System.out.println("Before Swapping (Object 1):");
        obj1.display();

        obj1 = obj2;

        System.out.println("After Swapping (Object 1):");
        obj1.display();
    }
}
