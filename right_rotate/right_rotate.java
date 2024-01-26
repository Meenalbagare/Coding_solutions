import java.util.ArrayList;
import java.util.Collections;
public class Solution {
    
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        int n=arr.size();
        k=k%n;
        ArrayList<Integer> res=new ArrayList<>(n);
        res.addAll(arr.subList(k, n));
        res.addAll(arr.subList(0, k));

        return res;
    }
}