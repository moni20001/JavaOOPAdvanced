package Telephony;

public class Smartphone implements Call,Browse {

    @Override
    public void callPhone(String number) {
        char[] numArr = number.toCharArray();
        boolean isNumber = true;
        for (char n: numArr) {
            if(!Character.isDigit(n)){
                isNumber=false;
            }
        }
        if(isNumber){
            System.out.println("Calling... "+number);
        }
        else{
            System.out.println("Invalid number!");
        }
    }


    @Override
    public void browseSite(String url) {
        char[] numArr = url.toCharArray();
        boolean isSite = true;
        for (char n: numArr) {
            if(Character.isDigit(n)){
                isSite=false;
            }
        }
        if(isSite){
            System.out.println("Browsing: "+url+"!");
        }
        else{
            System.out.println("Invalid URL!");
        }
    }
}
