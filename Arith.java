import java.util.Scanner;

public class Arith {
    public static void main(String[] args){
        int a, b, result;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter The value of a and b : ");
        a = scanner.nextInt();
        b = scanner.nextInt();

        result = a + b;
        System.out.println("Result after addition : " + result);

        result = a - b;
        System.out.println("Result after Subtraction :" + result);

        result = a * b;
        System.out.println("Result after Multiplication : " + result);

        scanner.close();
    }
}
