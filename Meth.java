public class Meth {
    static void newGreetings(){
        System.out.println("Hellowwww Function used");
    }

    static int some(int n, int m){
        return (n + m);
    }

    static void greeting(String x){
        System.out.println("Hello : " + x);
    }

    static int mult( int x, int y){
        return x * y;
    }

    public static void main(String[] args){
        newGreetings();
        greeting("Moto!");
        int x = some( 4, 5);
        System.out.println(x);
        System.out.println(mult(4,5));
        

    }
}
