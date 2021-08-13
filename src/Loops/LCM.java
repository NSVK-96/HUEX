package Loops;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3, b=6, i=0;
		int max=(a>b)?a:b;  

		for(i=max; i<=a*b; i=i+max)  
		{  
			if(i%a==0 && i%b==0)  
				break;  
		}  
		System.out.println("LCM is: "+i);  
	}  
}