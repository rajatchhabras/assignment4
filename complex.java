package assignment4;
import java.util.Scanner;
public class complex {
private int real;
private int imag;
public complex(int real,int imag)
{
	this.real=real;
	this.imag=imag;
}
public void display()
{
	if(imag>=0)
	System.out.println("The Complex Number is "+real+" + "+imag+"i");
	else
		System.out.println("The Complex Number is "+real+imag+"i");
		
}
	public static void main(String[] args) {
		Scanner set=new Scanner(System.in);
		int real=set.nextInt();
		int imag=set.nextInt();
	complex c1=new complex(real,imag);
	c1.display();
	
		

	}

}
