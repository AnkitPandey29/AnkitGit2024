package javaBasicProgram;

public class PallindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 121;
		int s=n;
		int m,r=0;
		while(n>0)
		{
			m=n%10;
			r=r*10+m;
			n=n/10;
		}
		if(s==r)
		{
			System.out.println("Pallindrome");
		}
		else
			System.out.println("Not Pallindrome");
	}

}
