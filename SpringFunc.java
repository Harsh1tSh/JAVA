public class SpringFunc {
    public static void main(String[] args){
        String str1 = "HELLO";
        String str2 = "Hello";

        System.out.println("The length of the String " + str1 + " is " + str1.length());


        // case sensitive
        if(str1.equals(str2)){
            System.out.println(str1 + " & " + str2 + " are the same");
        }
        else{
            System.out.println(str1 + " & " + str2 + " are not the same");
        }

        // case insensitive
        if(str1.equalsIgnoreCase(str2)){
            System.out.println(str1 + " & " + str2 + " are the same (case insensitive)");
        }
        else{
            System.out.println(str1 + " & " + str2 + " are not the same");
        }

        for( int i=0; i<str1.length() ;i++ ){
            System.out.println("The character at " + i + " is " + str1.charAt(i));
        }

        System.out.println("Comparing " + str1 + " and " + str2 + " Distance : " + str1.compareTo(str2));

    }
}
