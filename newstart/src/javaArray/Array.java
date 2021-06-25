package javaArray;
import java.util.*;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the size of the array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter array is");
		for(int i=0; i<n; i++)
			arr[i]=sc.nextInt();
		System.out.println(" array is");
		for(int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
	}

}
