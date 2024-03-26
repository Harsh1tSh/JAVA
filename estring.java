public class estring {
    public static void main(String[] args){
        String fullmessage = "This is a Stirng";
        System.out.println("The length of fullmessage is  " + fullmessage.length());
        System.out.println(fullmessage.toUpperCase());
        System.out.println(fullmessage.toLowerCase());
        System.out.println(fullmessage.indexOf("S"));

        String first = "This the\n first sentence ";
        String second = "and this is \"the\" second sentence";
        System.out.println(first +  second);
        System.out.println(first.concat(second));
    }
}
 