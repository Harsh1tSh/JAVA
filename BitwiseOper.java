public class BitwiseOper {
    public static void main(String[] args){
        byte val1 = 12;
        byte val2 = 10;
        byte res;
 
        res = (byte) ~val1; // bitwise complement of val1
        System.out.println("The result " + res);



        res = (byte) (val1 & val2); // bitwise and
        System.out.println("The Result : " + res);

        res = (byte) (val1 | val2);
        System.out.println("The Result : " + res);

        res  = (byte) (val1 ^ val2); // bitwise XOR
        System.out.println("The Result : " + res);

        res = (byte) (val1 << 2);
        System.out.println("The Result : " + res);
    }
}
