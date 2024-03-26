public class Statement {
    public static void main(String[] args){
        int f = 10;
        int s = 20;
        int  m = f * s;

        if(f > s){
            System.out.println("Yeah i do not care");
        }
        else{
            System.out.println("Yeah i do care");
        }
        if(true){
            System.out.println("This is True");
        }

        if(m < 20){
            System.out.println("Demn it is bigg");
        } else if (m > 100){
            System.out.println("It is greayter than 100");
        } else {
            System.out.println("I don't care anymore");
        }

        String test = (f > s) ? "Second value is the smallerr" : "First value is smaller";
        System.out.println(test);

    }
}
