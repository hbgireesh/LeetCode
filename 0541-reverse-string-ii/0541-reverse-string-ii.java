class Solution {
    public String reverseStr(String s, int k) {
        char[] res = s.toCharArray();
        int n = res.length;
        for (int i=0; i<n; i+=k*2){
            int left = i;
            int right = Math.min(left+k-1,n-1);
            while (left < right) {
                char temp = res[left];
                res[left] = res[right];
                res[right] = temp;
                left++;
                right--;
            }
        }
        return new String(res);
    }
}