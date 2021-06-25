package javaArray;
import java.util.*;
public class TwiDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m,n,i,j;
		System.out.println("Enter the size of aaray");
		System.out.println("Enter the row size");
		 m=sc.nextInt();
		 System.out.println("Enter the col size");
		 n=sc.nextInt();
		 int[][] arr=new int[m][n];
		 for(i=0; i<m; i++) {
			 for(j=0; j<n; j++) {
				 arr[i] [j]=sc.nextInt();
			 }
		 }
			 
		 for(i=0; i<m; i++) {
			 for(j=0; j<n; j++) {
				 System.out.print(arr[i] [j]+" ");
			 }
			 System.out.println();
		 }
      }
}