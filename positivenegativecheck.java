import java.util.Scanner;

class NumberSign {
    int number;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = sc.nextInt();
    }

    void check() {
        if (number > 0) {
            System.out.println("The number is Positive");
        } else if (number < 0) {
            System.out.println("The number is Negative");
        } else {
            System.out.println("The number is Zero");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        NumberSign obj = new NumberSign();
        obj.getData();
        obj.check();
    }
}
