import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args){
        Scanner newObj = new Scanner(System.in);
        String name;

        System.out.println("Type your name : ");
        name = newObj.nextLine();

        System.out.println("Your name is " + name);
        newObj.close();
    }
}
