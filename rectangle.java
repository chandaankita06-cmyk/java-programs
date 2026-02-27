import java.util.Scanner;

class Rectangle {
    double length, width;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter width: ");
        width = sc.nextDouble();
    }

    void calculate() {
        double area = length * width;
        double perimeter = 2 * (length + width);
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.getData();
        obj.calculate();
    }
}
