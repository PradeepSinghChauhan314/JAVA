package ChallangingQ;

public class TowerOfHanoi {
    //method to solve the Tower of hanoi.
    public static void solveTowerofHanoi(int n,String source,String destination,String auxiliary){
    //Base case:When only one disk left .
    if (n==1){
        System.out.println("Move disk 1 from " + source + " to " + destination);
        return;
    }
    //Move n-1 disks from source to auxiliary ,so they are out of the way.
    solveTowerofHanoi(n-1 , source , auxiliary ,destination);
    System.out.println("Move disk " + n + " from " + source + " to " +destination);
    solveTowerofHanoi(n-1, auxiliary,destination,source);
}
public static void main(String[] args) {
    int n=3;
    String source="A";
    String destination="C";
    String auxiliary="B";
    solveTowerofHanoi( n,source, destination, auxiliary);

}
}
