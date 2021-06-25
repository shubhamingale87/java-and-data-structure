package datastructure;

public class SortedArrayInsertion {
		static int InsertElement(int arr[], int n, int key, int capacity) {
			if(n>=capacity)
				return n;
			
			int i;
			for(i=n-1; (i>=0 && arr[i]>key); i--)
				arr[i+1]=arr[i];
			
		 arr[i+1]=key;
			
		return n+1;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[20];
		arr[0]=3;
		arr[1]=41;
		arr[2]=111;
		arr[3]=121;
		arr[4]=142;
		arr[5]=221;
		arr[6]=232;
		arr[7]=332;
		int n=8;
		int capacity=arr.length;
		int key=2;
		System.out.print("before insertion");
		for(int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
		n =InsertElement(arr, n, key, capacity);
		System.out.print("\nAfter insertion");
		for(int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
				

	}

}
