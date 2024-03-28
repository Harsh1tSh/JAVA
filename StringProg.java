import java.util.Scanner;

public class StringProg {
    public static void main(String[] args){
        char[] charString = {'S','t','r','i','n','g'};
        Scanner sc = new Scanner(System.in);

        String str = new String(charString);
        System.out.println("The value of str is : " + str);

        System.out.println("Enter a String : ");
        str = sc.next();
        System.out.println("The value of str : " + str);

        str = "JAVA Strings";
        System.out.println();

        str = str + " Conacatenate";
        System.out.println("The value of str is : " + str);

        sc.close();
    }
}
