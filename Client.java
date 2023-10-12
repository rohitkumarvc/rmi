import java.util.Scanner;
import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            Interface adder = (Interface) Naming.lookup("rmi://localhost/Service");
            Scanner a = new Scanner(System.in);
            int num1 = a.nextInt();
            Scanner b = new Scanner(System.in);
            int num2 = b.nextInt();
            int result = adder.add(num1, num2);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
