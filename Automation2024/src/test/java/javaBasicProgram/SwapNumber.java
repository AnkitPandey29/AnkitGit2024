package javaBasicProgram;

public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//swap using 3rd variable
		int a =5;
		int b =4;
		System.out.println(a+"--Before--"+b);
		int c=a;
		a=b;
		b=c;
		System.out.println(a+"--After--"+b);
		
		//swap using without 3rd variable(add)
		
		int x =10;
		int y=15;
		System.out.println(x+"--Before--"+y);
		x = x+y;
		y=x-y;
		x=x-y;
		System.out.println(x+"--After--"+y);
		
		//swap using without 3rd variable(multiply and divide)
		
		int m =10;
		int n=15;
		System.out.println(m+"--Before--"+n);
		m = m*n;
		n=m/n;
		m=m/y;
		System.out.println(m+"--After--"+n);
		
		
		
		
		

	}

}
