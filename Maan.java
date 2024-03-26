public class Maan {
    int playersnum;
    String playername;

    public Maan(int number, String name){
        playersnum =  7 * number;
        playername = name; 
    }

    public static void main(String[] args){
        Maan newObj = new Maan(30, "Crister");
        System.out.println(newObj.playersnum + " " + newObj.playername);
    }
}
