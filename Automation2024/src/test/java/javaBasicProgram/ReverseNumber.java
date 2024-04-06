package javaBasicProgram;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 123;
		int m,r=0;
		while(n>0)
		{
			m=n%10;
			r=r*10+m;
			n=n/10;
		}
		System.out.println(r);
	}

}
