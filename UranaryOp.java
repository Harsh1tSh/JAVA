public class UranaryOp {
    public static void main(String[] args){
        int val1 = 50;
        int val2 ;

        val2 = -val1;
        System.out.println("The val1 = " + val1 + ",var2 = " + val2);

        val1= 50;
        val2 = val1++;
        System.out.println("The val1 = " + val1 + ",var2 = " + val2);

        val1 = 50;
        val2 = ++val1;
        System.out.println("The val1 = " + val1 + ",var2 = " + val2);

        val1 = 50;
        val2 = val1--;
        System.out.println("The val1 = " + val1 + ",var2 = " + val2);

        val1 = 50;
        val2 = --val1;
        System.out.println("The val1 = " + val1 + ",var2 = " + val2);

        val2 = -val1;
        System.out.println("The val1 = " + val1 + ",var2 = " + val2);
    }
}
