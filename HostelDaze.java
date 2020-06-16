import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        HashMap<Integer,Integer>mp=new HashMap<>();
        int[] ans=new int[n];
        
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i;j<n;j++){
                if(arr[j]>0){
                    if(mp.containsKey(arr[j])){
                        break;
                    }else{
                        count++;
                    }
                }else{
                    mp.put(0-arr[j],0);
                    count++;
                }
            }
            ans[i]=count;
            mp.clear();
            
        }
        for(int i=0;i<n;i++){
        System.out.print(ans[i]+" ");
        }
    }
}
