public class solution3_4_3 {
    public boolean isPalindrome(String word) {
        String reverse = "";

        for(int i = 1 ; i <= word.length() ; i++) {
            reverse += word.charAt(word.length() - i);
        }

        if (word.equals(reverse)) {
            return true;
        } else {
            return false;    
        }
    }
}