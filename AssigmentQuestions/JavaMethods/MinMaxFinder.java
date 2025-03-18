package JavaMethods;

public class MinMaxFinder {
   public static int[] findMinMax(int[] array){
if (array ==null || array.length==0){
   throw new IllegalArgumentException("Array must not be null or empty");
}
int min =array[0];
int max =array[0];
for (int i=1; i<array.length;i++){
   if (array [i] <min){
      min=array[i];
   }
   else if(array[i] >max){
      max= array[i];
   }
}
return new int[]{min,max};

   }
   public static void main(String[] args) {
      int[] numbers={10,3,43,6,6,43,34,3,4,};
      int[] minmax =findMinMax(numbers);
   System.out.println("Minimum value:" +minmax[0]);
   System.out.println("Maximum value:" +minmax[1]);
   } 
}
