class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> anagramListMap = new HashMap<>();
        int pos;

        for (String str : strs) {
            int[] freqArray = new int[26];
            
            for (int i = 0; i < str.length(); i++) {
                pos = str.charAt(i) - 'a';
                freqArray[pos]++;
            }
            anagramListMap.putIfAbsent(Arrays.toString(freqArray), new ArrayList<String>());
            anagramListMap.get(Arrays.toString(freqArray)).add(str);
        }

        for (List<String> value : anagramListMap.values()) {
            result.add(value);
        }
        return result;
    }
}