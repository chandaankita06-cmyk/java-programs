import java.util.Scanner;

class Addition {
    int num1, num2;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();
    }

    void calculate() {
        int sum = num1 + num2;
        System.out.println("Sum = " + sum);
    }
}

public class Main {
    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.getData();
        obj.calculate();
    }
}
