public class Arrrr {
    public static void main(String[] args){
        String[] players = {"Ron","Mes","Sla","Ney"};
        int[] numbers = {7, 3, 4, 5};

        System.out.println(players[0]);
        System.out.println(numbers[1]);

        for(int i=0; i<players.length;i++){
            System.out.println(players[i]);
        }

        for(int i=0; i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

        for(String ch : players){
            System.out.println(ch);
        }


        int[][] newnumber = {{10,20,30},{40,50,60}};
        int t = newnumber[0][2];
        System.out.println(t);
    }
}
