
public class MathTest {
    public static void main(String[] args){
        int maxValue = Math.max(30, 70);
        int minValue = Math.min(30, 70);
        System.out.println(maxValue);
        System.out.println(minValue);

        double val1 = Math.round(44.554);
        System.out.println(val1);

        double newCiel = Math.ceil(10.43);
        System.out.println(newCiel);

        double val2 = Math.sqrt(val1);
        System.out.println(val2);

        double rand1 = Math.random();
        System.out.println(rand1);

        double rand2 = (int) (Math.random() * 101);
        System.out.println(rand2);

    }
}
