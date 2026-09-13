class Solution {
    public int majorityElement(int[] arr) {
       int el=0;
        int cut=0;
        for (int i = 0; i < arr.length ; i++) {
            if (cut==0){
                el=arr[i];
                cut++;
            } else if (arr[i]==el) {
                cut++;
            }
            else {
                cut--;
            }
        }
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==el){
                count++;
            }
        }
        if (count> arr.length/2){
            return el;
        }
        else {
            return -1;
        } 
    }
}
