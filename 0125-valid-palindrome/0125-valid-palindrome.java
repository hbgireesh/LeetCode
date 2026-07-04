class Solution {
    public boolean isPalindrome(String s) {
        //isLetterOrDigit() to check the character is letter or digit
        int left = 0;
        int right = s.length()-1;
        while (right > left) {
            while (right > left && !Character.isLetterOrDigit(s.charAt(left)))
                left++;
            while (right > left && !Character.isLetterOrDigit(s.charAt(right)))
                right--;
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) 
                return false;
            right--;
            left++;
        }
        return true;
    }
}