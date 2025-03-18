package Array;

public class SumOfArray {
public static int sumofarray (int [] arr){
int sum=0;
for(int i=0;i<arr.length;i++){
    sum+=arr[i];
}
return sum;

}   public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int TotalSum=sumofarray(arr);
System.out.println("The sum of array is :"+TotalSum);
    }
}
