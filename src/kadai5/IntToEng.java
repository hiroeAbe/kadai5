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
    	if(0<=n && n<=20){
    		Eng =zeroToTwenty(n);
    	}
    	if(20<n && n<100){
    		int a =n%10;
    		int b = n/10;
			if (b == 2 && a != 0) {
				Eng = "twenty" + zeroToTwenty(a);
			}else if (b == 3 ){
				Eng = "thirty";
				if(a != 0){
					Eng = Eng + zeroToTwenty(a);
				}
			}else if (b == 4 ){
				Eng = "forty";
				if(a != 0){
					Eng = Eng + zeroToTwenty(a);
				}
			}else if (b == 5 ){
				Eng = "fifty";
				if(a != 0){
					Eng = Eng + zeroToTwenty(a);
				}
			}else if (b == 6 ){
				Eng = "sixty";
				if(a != 0){
					Eng = Eng + zeroToTwenty(a);
				}
			}else if (b == 7){
				Eng = "seventy";
				if(a != 0){
					Eng = Eng + zeroToTwenty(a);
				}
			}else if (b == 8){
				Eng = "eighty";
				if(a != 0){
					Eng = Eng + zeroToTwenty(a);
				}
			}else if (b == 9){
				Eng = "ninety";
				if(a != 0){
					Eng = Eng + zeroToTwenty(a);
				}
			}
		}
        return Eng;
    }
    static String zeroToTwenty(int n){
    	String Eng ="";
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
    	case 11:	
    	    Eng = "eleven";
    	    break;
    	case 12:
        	Eng = "twelve";
        	 break;
    	case 13:
        	Eng = "thirteen";
        	 break;
    	case 14:
        	Eng = "fourteen";
        	 break;
    	case 15:
        	Eng = "fifteen";
        	 break;
    	case 16:
        	Eng = "sixteen";
        	 break;
    	case 17:
        	Eng = "seventeen";
        	 break;
    	case 18:
        	Eng = "eighteen";
        	 break;
    	case 19:
        	Eng = "ninetten";
        	 break;
    	case 20:
        	Eng = "twenty";
        	 break;
    	}
    	return Eng;
    }
}
