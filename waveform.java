package assignment4;
import java.util.Scanner;
public class waveform {

	public static void main(String[] args) {
		int i,j;
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		for( i=0;i<10;i++)
		{
		arr[i]=sc.nextInt();
		}
		for(j=0;j<10;)
		{
			int temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
			j=j+2;
		}
		System.out.println("The Formed waveform is ");
		for( i=0;i<10;i++)
		{
			System.out.print(arr[i]);
		}
		
	}

}
