class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] sArray = new int[26];
        int[] tArray = new int[26];
        int pos = 0;

        for(int i = 0; i < s.length(); i++) {
            pos = s.charAt(i) - 'a';
            sArray[pos]++;

            pos = t.charAt(i) - 'a';
            tArray[pos]++;
        }

        if (Arrays.equals(sArray, tArray)) {
            return true;
        }
        return false;
    }
}

// Complexity: Array approach -> O(n) + O(C) = O(n)