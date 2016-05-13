package kadai5;
import java.util.Scanner;

public class IntToEng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner sc = new Scanner(System.in);
	        int input = sc.nextInt();

	        System.out.println(translateEng(input));

	}
	 // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	String Eng = "";
    	switch(n){
    	case 0:	
    	    Eng = "zero";
    	    break;
    	case 1:
        	Eng = "one";
        	 break;
    	case 2:
        	Eng = "two";
        	 break;
    	case 3:
        	Eng = "three";
        	 break;
    	case 4:
        	Eng = "four";
        	 break;
    	case 5:
        	Eng = "five";
        	 break;
    	case 6:
        	Eng = "six";
        	 break;
    	case 7:
        	Eng = "seven";
        	 break;
    	case 8:
        	Eng = "eight";
        	 break;
    	case 9:
        	Eng = "nine";
        	 break;
    	case 10:
        	Eng = "ten";
        	break;
    	}
        return Eng;
    }
}
