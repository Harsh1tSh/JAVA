public class forr {
    public static void main(String[] args){
        for(int v = 0; v < 7; v++){
            // System.out.println(v);
            if(v == 5){
                continue;
            }
            System.out.println(v);
        }

        String[] fruits = {
            "Apple",
            "Bannana",
            "Fig"
        };
        for(String fr : fruits){
            System.out.println(fr);
        }
    }
}
