//Reverse of a string by using for-loop...

public class Testone {
    public static void main(String[] args) {
        String s1="hello";
        String reversed="";
        for(int i=s1.length()-1;i>=0;i--){    //Reverse of a string
            reversed+=s1.charAt(i);  //charAt -it is used to specify the indexing for r=every character in the string..
        }
        System.out.println(reversed);
    }
}
