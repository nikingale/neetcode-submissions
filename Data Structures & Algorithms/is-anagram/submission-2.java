class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] sArray = new int[26];
        int pos = 0;

        for(int i = 0; i < s.length(); i++) {
            pos = s.charAt(i) - 'a';
            sArray[pos]++;

            pos = t.charAt(i) - 'a';
            sArray[pos]--;
        }

        for (int i = 0; i < 26; i++) {
            if (sArray[i] != 0) {
                return false;
            }
        }
        return true;
    }
}

// Complexity: Array approach -> O(n) + O(C) = O(n)