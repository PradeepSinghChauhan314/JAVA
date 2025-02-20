package calculator;

public class Arrayeven {
	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6};
		int num=a.length;
		int X=0;
		for(int i=0;i<num;i++)
		if(a[i]%2==0)
			X+=1;
		{System.out.println("Even element count is:"+X);
		}
		
	}
	}

