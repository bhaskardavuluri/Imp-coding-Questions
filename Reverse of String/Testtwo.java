//Reversing a string using  string builder &String (tostring()-method)


public class Testtwo{
    public static void main(String[] args) {
        String s1="Harini";
        //String s2=new StringBuilder(s1).reverse().toString();//if you want to Reverse the String in Stringliteral we need to use toString()..
        StringBuffer s2=new StringBuffer(s1).reverse();//Strinh=gbuffer is mutable means we can change or update the objects ..
        System.out.println(s2);
    }
    //toString()-method is used to convert the object into String representation..
}
