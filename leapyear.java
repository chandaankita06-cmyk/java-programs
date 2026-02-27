import java.util.Scanner;

class LeapYear {
    int year;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        year = sc.nextInt();
    }

    void check() {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LeapYear obj = new LeapYear();
        obj.getData();
        obj.check();
    }
}
