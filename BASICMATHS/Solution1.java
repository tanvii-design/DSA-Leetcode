import java.util.Scanner;

class Solution1 {
    public boolean isPalindrome(int x) {
        if (x<0) {
            return false;
        }
        int reverse=0;
        int x1=x;
        while (x1 != 0) {
            int reminder=x1%10;
            reverse=reverse*10+reminder;
            x1=x1/10;
        }
        if (reverse==x){
            return true;
        }
        else {
            return false;
        }
    }
}
class Main11{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        Solution1 obj=new Solution1();
        boolean flag=obj.isPalindrome(n);
        System.out.println(flag);
    }
}
