package DZ_1;

class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left < right) {
            if(Character.isLetterOrDigit(s.charAt(left))) {
                if (Character.isLetterOrDigit(s.charAt(right))) {
                    if (Character.toUpperCase(s.charAt(left)) != Character.toUpperCase(s.charAt(right))) {
                        return false;
                    }
                    left++;
                    right--;
                }
                else right--;
            }
            else left++;
        }
        return true;
    }
}