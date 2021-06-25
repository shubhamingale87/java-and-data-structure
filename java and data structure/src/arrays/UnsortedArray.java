package arrays;

public class UnsortedArray 
{
	static int InsertElement(int arr[],int n,int key,int capacity) {
	if(n>=capacity)
		return n;
	
	   arr[n]=key;
				
	   return (n+1);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] arr= new int[20];
			arr[0]=20;
			arr[1]=45;
			arr[2]=55;
			arr[3]=22;
			arr[4]=34;
			arr[5]=66;
			arr[6]=21;
			int capacity=arr.length;
			int n=7;
			int key=54;
			
			System.out.print("before insertion");
			for(int i=0; i<n; i++)
				System.out.print(arr[i]+" ");
			n =InsertElement(arr, n, key, capacity);
			System.out.print("\nAfter insertion");
			for(int i=0; i<n; i++)
				System.out.print(arr[i]+" ");
			
		}

	}


