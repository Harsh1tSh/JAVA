public class Mainn {
    int value = 20;
    String neew = "Java is Godd";

    public static void main(String[] args){
        Mainn newObj = new Mainn();
        Mainn newObj2 = new Mainn();

        newObj.value = 50;
        newObj.neew = "Text changed";
        System.out.println(newObj.value);
        System.out.println(newObj2.value);
        System.out.println(newObj.neew);
        System.out.println(newObj2.neew);
    }
}
