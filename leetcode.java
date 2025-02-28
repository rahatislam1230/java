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
