import java.util.*;
public class LongestSubarrsumK {
    public static int Possubarrk(int[] arr, long k){
    //Longest Subarray with sum K | [Postives and Negatives]
    //     int n = arr.length;
    //     Map <Integer,Integer> sumMp = new HashMap<>();
    //     int sum = 0;
    //     int maxLen = 0;
    //     for(int i=0;i<n;i++){
    //         sum += arr[i];
    //         if(sum==k){
    //             maxLen = Math.max(maxLen, i+1);
    //         }
    //         int rem = sum-k;
    //     if(sumMp.containsKey(rem)){
    //         int len = i - sumMp.get(rem);
    //         maxLen = Math.max(maxLen, len);
    //     }
    //     if(!sumMp.containsKey(sum)){
    //         sumMp.put(sum, i);
    //     }
    // }
    // return maxLen;

    //Longest Subarray with given Sum K(Positives) 
        int left = 0, right = 0;
        long sum = arr[0];
        int max = 0;
        int n = arr.length;
        while(right<n){
            while(left<=right && sum>k){
                sum -= arr[left];
                left++;
            }
            if(sum == k){
                max = Math.max(max, right-left+1);
            }
            right++;
            if(right<n){
                sum += arr[right];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(Possubarrk(arr, k));
    }
}
