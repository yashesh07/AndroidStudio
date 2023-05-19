package OODP1;

public class ReverseNumber {
    public int reverseNumberUsingLoop(int num){
        int result = 0;
        while(num>0){
            result = (result*10) + (num%10);
            num = num/10;
        }
        return result;
    }
    public int reverseNumberUsingRecursion(int num){
        return recursiveMethod(num, 0);
    }
//    private method for recursive call!!
    private int recursiveMethod(int num, int result){
        if(num>0){
            result = (result*10) + (num%10);
            return recursiveMethod(num/10, result);
        }
        else return result;
    }
}