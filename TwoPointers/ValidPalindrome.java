class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;

        while(left<right){
            char LeftChar = s.charAt(left);
            char RightChar = s.charAt(right);


            if(!Character.isLetterOrDigit(LeftChar)){
                left++;
                continue;
            }

            if(!Character.isLetterOrDigit(RightChar)){
                right--;
                continue;
            }

            if(Character.toLowerCase(LeftChar)!=Character.toLowerCase(RightChar)){
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}

