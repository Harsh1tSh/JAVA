public class CondOper {
    public static void main(String[] args){
        boolean bool1 , bool2, res;

        bool1 = true;
        bool2 = false;

        res = bool1 || bool2;
        System.out.println("Or (||): " + res);

        res = bool1 && bool2;
        System.out.println("And (&): " + res);

        
    }
}
