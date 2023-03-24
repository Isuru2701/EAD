package StringHandling;

public class StringBasics {

    public static void main(String[] args) {

        String mystring = "New String";

        System.out.println(mystring.charAt(2));

        System.out.println(mystring.indexOf('n'));

        System.out.println(mystring.toLowerCase());

        if(mystring.equals("new string"))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");

        mystring = mystring.replace("New", "Old");
        System.out.println(mystring);

    }
}
