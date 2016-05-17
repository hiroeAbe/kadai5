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
    		Eng =ZeroToTwenty(n);
    	}else if(20<n && n<=100){
    		Eng = TwentyToHundred(n);
    	}else if(100<n && n<=1000){
    		int a =n%100;
    		int b = n/100;
    		if(b == 1 && a != 0){
    			if(a<=1 && a<11){
    			Eng = "onehundred"+ZeroToTwenty(n);
    			}else if(a<=11 && a<99){	
    			Eng = "onehundred"+TwentyToHundred(n);	
    			}
    		}else if(b == 2){
    			if(a == 0){
    				Eng = "twohundred";
    			}else if(a != 0){
    				if(a<=1 && a<11){
    					Eng = "twohundred"+ZeroToTwenty(n);
    				}else if(a<=11 && a<99){	
    					Eng = "twohundred"+TwentyToHundred(n);	
    				}
    			}
    		}else if(b == 3){
    			if(a == 0){
    				Eng = "threehundred";
    			}else if(a != 0){
    				if(a<=1 && a<11){
    					Eng = "threehundred"+ZeroToTwenty(n);
    				}else if(a<=11 && a<99){	
    					Eng = "threehundred"+TwentyToHundred(n);	
    				}
    			}
    		}else if(b == 4){
    			if(a == 0){
    				Eng = "fourhundred";
    			}else if(a != 0){
    				if(a<=1 && a<11){
    					Eng = "fourhundred"+ZeroToTwenty(n);
    				}else if(a<=11 && a<99){	
    					Eng = "fourhundred"+TwentyToHundred(n);	
    				}
    			}
    		}else if(b == 5){
    			if(a == 0){
    				Eng = "fivehundred";
    			}else if(a != 0){
    				if(a<=1 && a<11){
    					Eng = "fivehundred"+ZeroToTwenty(n);
    				}else if(a<=11 && a<99){	
    					Eng = "fivehundred"+TwentyToHundred(n);	
    				}
    			}
    		}else if(b == 6){
    			if(a == 0){
    				Eng = "sixhundred";
    			}else if(a != 0){
    				if(a<=1 && a<11){
    					Eng = "sixhundred"+ZeroToTwenty(n);
    				}else if(a<=11 && a<99){	
    					Eng = "sixhundred"+TwentyToHundred(n);	
    				}
    			}
    		}else if(b == 7){
    			if(a == 0){
    				Eng = "sevenhundred";
    			}else if(a != 0){
    				if(a<=1 && a<11){
    					Eng = "sevenhundred"+ZeroToTwenty(n);
    				}else if(a<=11 && a<99){	
    					Eng = "sevenhundred"+TwentyToHundred(n);	
    				}
    			}
    		}else if(b == 8){
    			if(a == 0){
    				Eng = "eighthundred";
    			}else if(a != 0){
    				if(a<=1 && a<11){
    					Eng = "eighthundred"+ZeroToTwenty(n);
    				}else if(a<=11 && a<99){	
    					Eng = "eighthundred"+TwentyToHundred(n);	
    				}
    			}
    		}else if(b == 9){
    			if(a == 0){
    				Eng = "ninehundred";
    			}else if(a != 0){
    				if(a<=1 && a<11){
    					Eng = "ninehunderd"+ZeroToTwenty(n);
    				}else if(a<=11 && a<99){	
    					Eng = "ninehunded"+TwentyToHundred(n);	
    				}
    			}
    		}
    	}
        return Eng;
    }
    static String ZeroToTwenty(int n){
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
    static String TwentyToHundred(int n){
    	String Eng = "";
    	if(0<=n && n<=20){
    		Eng =ZeroToTwenty(n);
    	}
    	if(20<n && n<=100){
    		int a =n%10;
    		int b = n/10;
			if (b == 2 && a != 0) {
				Eng = "twenty" + ZeroToTwenty(a);
			}else if (b == 3 ){
				Eng = "thirty";
				if(a != 0){
					Eng = Eng + ZeroToTwenty(a);
				}
			}else if (b == 4 ){
				Eng = "forty";
				if(a != 0){
					Eng = Eng + ZeroToTwenty(a);
				}
			}else if (b == 5 ){
				Eng = "fifty";
				if(a != 0){
					Eng = Eng + ZeroToTwenty(a);
				}
			}else if (b == 6 ){
				Eng = "sixty";
				if(a != 0){
					Eng = Eng + ZeroToTwenty(a);
				}
			}else if (b == 7){
				Eng = "seventy";
				if(a != 0){
					Eng = Eng + ZeroToTwenty(a);
				}
			}else if (b == 8){
				Eng = "eighty";
				if(a != 0){
					Eng = Eng + ZeroToTwenty(a);
				}
			}else if (b == 9){
				Eng = "ninety";
				if(a != 0){
					Eng = Eng + ZeroToTwenty(a);
				}
			}else if (b == 10){
				Eng = "hundred";
			}
		}
    	return Eng;
    }
}
