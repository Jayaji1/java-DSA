package program;

public class StringToInteger {
    public static void main(String[] args) {
        String str="1234";
        int number=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='0'&&ch<='9'){
                number=number*10+(ch-'0');
            }
            else{
                System.out.println("Invalid input:not a valid number");
                return;
            }
        }
        System.out.println("Convert String to Number  " + number);
    }
}
