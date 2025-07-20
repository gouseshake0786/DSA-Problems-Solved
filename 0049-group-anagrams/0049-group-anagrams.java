class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res = new HashMap<>();
        for(String s:strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            res.putIfAbsent(sorted, new ArrayList<>());
            res.get(sorted).add(s);
        }
        return new ArrayList<>(res.values());
    }
}