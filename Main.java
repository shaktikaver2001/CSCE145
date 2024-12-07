//Shakti Kaver
import java.util.Scanner;

public class Main {

    // Method to add two vectors
    public static double[] addVectors(double[] vector1, double[] vector2) {
        double[] result = new double[vector1.length];
        for (int i = 0; i < vector1.length; i++) {
            result[i] = vector1[i] + vector2[i];
        }
        return result;
    }

    // Method to subtract two vectors
    public static double[] subtractVectors(double[] vector1, double[] vector2) {
        double[] result = new double[vector1.length];
        for (int i = 0; i < vector1.length; i++) {
            result[i] = vector1[i] - vector2[i];
        }
        return result;
    }

    // Method to find the magnitude of a vector
    public static double magnitudeOfVector(double[] vector) {
        double sum = 0;
        for (double val : vector) {
            sum += val * val;
        }
        return Math.sqrt(sum);
    }

    // Method to input a vector from the user
    public static double[] inputVector(int size, Scanner scanner) {
        double[] vector = new double[size];
        System.out.println("Enter values for the vector:");
        for (int i = 0; i < size; i++) {
            vector[i] = scanner.nextDouble();
        }
        return vector;
    }

    // printing a vector
    public static void printVector(double[] vector) {
        for (double value : vector) {
            System.out.println(value);
        }
    }

    // Main program
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the Vector Operations Program!");

        while (true) {
            // Display the menu
            System.out.println("\nEnter 1. To Add 2 Vectors");
            System.out.println("Enter 2. To Subtract 2 Vectors");
            System.out.println("Enter 3. To Find the Magnitude of a Vector");
            System.out.println("Enter 9. To Quit");

            int choice = keyboard.nextInt();

            if (choice == 9) {
                System.out.println("Goodbye!");
                break;
            }

            System.out.print("Enter the size of the vector(s): ");
            int size = keyboard.nextInt();

            if (size < 1) {
                System.out.println("Invalid Size");
                continue;
            }

            switch (choice) {
                case 1: // Add Vectors
                    System.out.println("Enter values for Vector1");
                    double[] vector1 = inputVector(size, keyboard);
                    System.out.println("Enter values for Vector2");
                    double[] vector2 = inputVector(size, keyboard);

                    if (vector1.length != vector2.length) {
                        System.out.println("Error: Vectors must have the same size.");
                    } else {
                        double[] sumVector = addVectors(vector1, vector2);
                        System.out.println("Result:");
                        printVector(vector1);
                        System.out.println("+");
                        printVector(vector2);
                        System.out.println("=");
                        printVector(sumVector);
                    }
                    break;

                case 2: // Subtract Vectors
                    System.out.println("Enter values for Vector1");
                    vector1 = inputVector(size, keyboard);
                    System.out.println("Enter values for Vector2");
                    vector2 = inputVector(size, keyboard);

                    if (vector1.length != vector2.length) {
                        System.out.println("Error: Vectors must have the same size.");
                    } else {
                        double[] subtractedVector = subtractVectors(vector1, vector2);
                        System.out.println("Result:");
                        printVector(vector1);
                        System.out.println("-");
                        printVector(vector2);
                        System.out.println("=");
                        printVector(subtractedVector);
                    }
                    break;

                case 3: // Find Magnitude of Vector
                    System.out.println("Enter values for the vector");
                    double[] vector = inputVector(size, keyboard);
                    double magnitude = magnitudeOfVector(vector);
                    System.out.println("The magnitude is: " + magnitude);
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
