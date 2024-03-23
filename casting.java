public class casting {
    public static void main(String[] args){
        // Widening Casting : to convert 
        //      the smaller data type into
        //      larger data type

        // Narrowing casting : to convert
        //      larger type into smaller
        //      size type

        // int newTemp = 30;
        // double newDecimal = newTemp;

        double newDecimal = 1.5d;
        int newTemp = (int) newDecimal;

        System.out.println(newTemp);
        System.out.println(newDecimal);
    }
}
