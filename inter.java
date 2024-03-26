// player class (Parent class)
class Player{
    protected String name = "Someone Parent";
    public void newMessage(){
        System.out.println(("This is the Parent01 message"));
    }
}


class NewPlayer extends Player{
    private String playername = "Child01";
    public static void main(String[] args) {
        NewPlayer newSkill = new NewPlayer();
        newSkill.newMessage();
        System.out.println((newSkill.name + " " + newSkill.playername));
    }
}