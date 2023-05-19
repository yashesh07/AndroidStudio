package OODP4;

public class ReverseTheString {

    public String reverseString(String str){
        String rStr = "";
        for(int i = str.length()-1; i>=0; i--)
            rStr = rStr + str.charAt(i);
        return rStr;
    }

    public static void main(String[] args) {
        String str = "We want offline education";
        System.out.println("Input: " + str);
        System.out.println("Output: " + new ReverseTheString().reverseString(str));
    }
}
