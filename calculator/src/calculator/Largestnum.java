package calculator;

public class Largestnum {
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,80};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
			System.out.println("the largest number in array is:"+max);
		
		
	}

}
