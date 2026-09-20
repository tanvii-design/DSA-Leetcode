class Solution {
    public int longestConsecutive(int[] arr) {
        if (arr.length==0) {
            return 0;
        }
        Arrays.sort(arr);
        int lastSmaller=Integer.MIN_VALUE;
        int cut=0;
        int longest=1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]-1==lastSmaller){
                cut++;
                lastSmaller=arr[i];
            } else if (arr[i]!=lastSmaller) {
                cut=1;
                lastSmaller=arr[i];
            }
            longest=Math.max(longest,cut);
        }
        return longest;
    }
}
