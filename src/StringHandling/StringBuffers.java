package StringHandling;

public class StringBuffers {
    public static void main(String[] args) {

        StringBuffer mystring = new StringBuffer("ABCxyz");

        mystring.append("123");

        mystring.insert(1, "DEF");

        System.out.println("mystring = " + mystring);

    }


}
