import java.util.Scanner;


public class ArrayExapmle {
    public static void main(String[] args){
        int[] intArr = {10,20,30,40,50};

        float[] floatArr = new float[5];
        char[] charArr = new char[5];

        Scanner sc = new Scanner(System.in);

        floatArr[0] = 2.5f;
        floatArr[1] = 7.23f;
        floatArr[2] = 5.6f;
        floatArr[3] = 0f;
        floatArr[4] = 7.125f;

        for (int i =0;i < 5; i++){
            System.out.print("Enter the charachter for index (" + i +") :");
            charArr[i] = sc.next().charAt(0);
        }

        System.out.print("Items of Integer Array : ");
        for(int i=0;i<5;i++){
            System.out.print(intArr[i] + " ");
        }
        
        System.out.println();

        System.out.print("Items of Float array : ");
        for(float item : floatArr){
            System.out.print(item + " ");
        }

        System.out.println();

        System.out.print("Items in Character Array are : ");
        for(char item : charArr){
            System.out.print(item + " ");
        }

        sc.close();
    }
    
}
