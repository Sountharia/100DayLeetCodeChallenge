class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();
        for(String w : strs){
            char[] arr = w.toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);
            mp.putIfAbsent(s, new ArrayList<>());
            mp.get(s).add(w);
        }
        return new ArrayList<>(mp.values());
    }
}
