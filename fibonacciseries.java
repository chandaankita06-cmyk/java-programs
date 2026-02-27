import java.util.Scanner;

class Fibonacci {
    int n;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        n = sc.nextInt();
    }

    void generate() {
        int a = 0, b = 1;

        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Fibonacci obj = new Fibonacci();
        obj.getData();
        obj.generate();
    }
}
