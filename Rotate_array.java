import java.util.*;
class Rotate_array { 
	void rotate(int arr[], int d, int n) 
	{ 
		for (int i=0;i<d;i++)
		{ 
			rotateOne(arr, n); 
		}
	} 

	void rotateOne(int arr[],int n) 
	{ 
		int i,temp; 
		temp=arr[0]; 
		for (i=0;i<n-1;i++) 
		{
		arr[i] = arr[i + 1];
		} 
		arr[i] = temp; 
		for (int i=0;i<n;i++) 
		{
			System.out.print(arr[i]+" ");
		} 
	} 
 
	public static void main(String[] args) 
	{ 
	Rotate_array r=new Rotate_array();
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
          arr[i]=in.nextInt();
        }
        int start=in.nextInt();
		r.rotate(arr, start, n);  
	} 
} 