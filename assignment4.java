package assignment4;
import java.util.Scanner;
public class assignment4 {
	private int length;
	private int breadth;
	public assignment4(int l,int b)
	{
		length=l;
		breadth=b;
	}
	public int showDetails()
	{
		int area;
		area=length*breadth;
		return area;
	}
	public static void main(String[] args) {
		Scanner set=new Scanner(System.in);
		int l=set.nextInt();
		int b=set.nextInt();
		assignment4 a=new assignment4(l,b);
		int fina=a.showDetails();
		System.out.println("The Area of the rectangle is "+ fina);
		
		
	}

	
		
	}


