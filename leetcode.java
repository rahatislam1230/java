242....
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int count[]= new int[26];
        for(int i=0;i<s.length();++i){
            char ch= s.charAt(i);
            count[ch -'a']++;
        }
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            count[ch -'a']--;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]>0){
                return false;
            }
        }
        return true;
    }
}
9....
class Solution {
    private static boolean CheckPalindrome(String num){
        int left =0;
        int right = num.length()-1;
        while (left<right){
            if (num.charAt(left)!=num.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String num =x+ "";
        return CheckPalindrome(num);
    }
}
13....
import java.util.*;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = map.get(s.charAt(i));

            if (currValue < prevValue) {
                result -= currValue;   
            } else {
                result += currValue;
            }
            
            prevValue = currValue;
        }

        return result;
    }
}
709....
class Solution {
    public String toLowerCase(String s) {
        return s.toLowerCase();
    }
}    
///other
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s=sc.nextLine();
       sc.close();
        Solution solution = new Solution();
        System.out.println(solution.toLowerCase(s));

    }
}
class Solution {
    public String toLowerCase(String s) {
        return s.toLowerCase();
    }
}
852..
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int i =0;
        while(arr[i]<arr[i+1]){
            i++;
        }
        return i;
    }
}    
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
   //     int i =0;
     //   while(arr[i]<arr[i+1]){
      //      i++;
      //  }
        //return i;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                return i;
            }
        }
        return -1;
    }
}
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
         int low=0;
         int high=arr.length-1;
         while(low<high){
            int mid =low + (high-low)/2;
            if(arr[mid]< arr[mid + 1]){
                low= mid+1;
            }else{
                high =mid;
            }
         }
         return low;
   }


}
344
 class Solution {
    public void reverseString(char[] s) {
        int start=0;
        int end = s.length-1;
        while(start<=end){
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
    }
}
171
class Solution {
    public int titleToNumber(String columnTitle) {
        char c []= columnTitle.toCharArray();
        int result =0;
        for(int i=0;i<c.length;i++){
            int num = c[i]-65+1;
            result = result *26+num;
        }
        return result;
    }
}
200
class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    callDFS(grid, i, j);
                }
            }
        }
        return count;
    }

    public void callDFS(char[][] grid, int i, int j) {
   
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == '0') {
            return;
        }


        grid[i][j] = '0';
        callDFS(grid, i, j + 1); 
        callDFS(grid, i, j - 1); 
        callDFS(grid, i + 1, j); 
        callDFS(grid, i - 1, j); 
    }
}
125
