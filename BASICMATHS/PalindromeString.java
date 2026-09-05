class Solution {

    public boolean isPalindrome(String s) {

        char ch[] = s.toCharArray();

        return check(ch, 0, ch.length - 1);
    }

    public boolean check(char ch[], int i, int j) {

        if (j <= i) {
            return true;
        }

        if (!Character.isLetterOrDigit(ch[i])) {
            return check(ch, i + 1, j);
        }

        if (!Character.isLetterOrDigit(ch[j])) {
            return check(ch, i, j - 1);
        }

        if (Character.toLowerCase(ch[i]) != Character.toLowerCase(ch[j])) {
            return false;
        }

        else {
            return check(ch, i + 1, j - 1);
        }
    }
}
