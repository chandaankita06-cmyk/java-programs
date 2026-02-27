import java.util.Scanner;

class ReverseNumber {
    int number;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = sc.nextInt();
    }

    void reverse() {
        int reversed = 0;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp = temp / 10;
        }

        System.out.println("Reversed Number = " + reversed);
    }
}

public class Main {
    public static void main(String[] args) {
        ReverseNumber obj = new ReverseNumber();
        obj.getData();
        obj.reverse();
    }
}
