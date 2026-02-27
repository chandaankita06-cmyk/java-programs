import java.util.Scanner;

class Temperature {
    double celsius;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        celsius = sc.nextDouble();
    }

    void convert() {
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}

public class Main {
    public static void main(String[] args) {
        Temperature obj = new Temperature();
        obj.getData();
        obj.convert();
    }
}
