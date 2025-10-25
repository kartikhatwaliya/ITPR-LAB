import java.util.Scanner;

// Define a class to calculate simple interest
class SimpleInterest {
    double principal;
    double rate;
    double time;

    // Constructor
    SimpleInterest(double p, double r, double t) {
        principal = p;
        rate = r;
        time = t;
    }

    // Method to calculate simple interest
    double calculate() {
        return (principal * rate * time) / 100;
    }
}

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter principal amount (P): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter rate of interest (R): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter time in years (T): ");
        double time = scanner.nextDouble();

        // Create an object of SimpleInterest class
        SimpleInterest si = new SimpleInterest(principal, rate, time);

        // Calculate and display simple interest
        double result = si.calculate();
        System.out.printf("Simple Interest = %.2f\n", result);

        scanner.close();
    }
}
