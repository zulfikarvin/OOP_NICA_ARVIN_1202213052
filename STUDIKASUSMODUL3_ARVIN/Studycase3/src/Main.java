import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    private static boolean repeat = true;
    private static boolean report = false;
    public static void main(String[] args) throws InterruptedException{
        Scanner input = new Scanner(System.in);
        Calculation c = new Calculation();
        Thread thread = new Thread(c);
        do {
            try {
                System.out.println("Calculation Program");
                System.out.println("1.Square");
                System.out.println("2.Circle");
                System.out.println("3.Trapezoid");
                System.out.println("0.Exit");
                System.out.print("Choose option: ");
                int option = input.nextInt();
                switch (option) {
                    case 1:
                        System.out.print("Input side length: ");
                        c.setSide(input.nextDouble());
                        c.setSquare();
                        thread.start();
                        thread.join();
                        report = true;
                        break;
                    case 2:
                        System.out.print("Input radius: ");
                        c.setRadius(input.nextDouble());
                        c.setCircle();
                        thread.start();
                        thread.join();
                        report = true;
                        break;
                    case 3:
                        System.out.print("Input a: ");
                        double a = input.nextDouble();
                        System.out.print("Input b: ");
                        double b = input.nextDouble();
                        System.out.print("Input t: ");
                        double t = input.nextDouble();
                        
                        c.setTrapezoid(a, b, t);
                        thread.start();
                        thread.join();
                        report = true;
                        break;
                    case 0:
                        System.out.println("Program stopped");
                        repeat = false;
                        break;
                        
                    default:
                        System.out.println("Option not Available");
                        continue;
                }
                
                if (report) {
                    System.out.println("\nArea of your shape: " + c.getArea());
                }
                
            } catch (InputMismatchException e) {
                System.out.println("Error: Input should be a number");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: Illegal Argument");
            }
        } while (repeat);
        
        input.close();
    }
}