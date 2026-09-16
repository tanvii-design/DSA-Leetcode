class Solution {
    public int[] rearrangeArray(int[] arr) {
        int posIndex=0;
        int negIndex=1;
        int ans[]=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                ans[posIndex]=arr[i];
                posIndex+=2;
            }
            else {
                ans[negIndex]=arr[i];
                negIndex+=2;
            }
        }
        return ans;
    }
}
