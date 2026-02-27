import java.util.Scanner;

class Maximum {
    int num1, num2, num3;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        num3 = sc.nextInt();
    }

    void findMax() {
        int max = num1;

        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        System.out.println("Maximum number = " + max);
    }
}

public class Main {
    public static void main(String[] args) {
        Maximum obj = new Maximum();
        obj.getData();
        obj.findMax();
    }
}
