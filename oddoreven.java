import java.util.Scanner;

class NumberCheck {
    int number;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = sc.nextInt();
    }

    void check() {
        if (number % 2 == 0) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        NumberCheck obj = new NumberCheck();
        obj.getData();
        obj.check();
    }
}
