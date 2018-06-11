package assignment4;
import java.util.Scanner;
public class SecondLargest {

	public static void main(String[] args) {
		int max=0,j,i;
		int k=0;
	Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for( i=0;i<size;i++)
		{
		arr[i]=sc.nextInt();
		if(arr[i]>max)
		{
			max=arr[i];
			k=i;
		}
		}
		
		arr[k]=0;
		max=0;
		for( j=0;j<size;j++)
		{
		  if(arr[j]>max)
		  {
			  max=arr[j];
		  }
		}
		System.out.println("The Maximum Element Is "+max);
	}
		

}
