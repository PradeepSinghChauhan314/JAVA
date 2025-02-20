package calculator;

public class Reversarray {
	public static void Revers(int[]arr)
	{
			for(int i=arr.length-1;i>=0;i--) {
				System.out.println(arr[i]);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int [] X= {1,2,3,4,5};
		Revers(X);
		
	}

}