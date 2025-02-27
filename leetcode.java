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
