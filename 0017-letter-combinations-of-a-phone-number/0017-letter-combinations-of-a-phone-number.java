class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) {
            return new ArrayList<>();
        }
        return permutation("", digits);
    }

    List<String> permutation(String p, String up) {
        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        // Mapping digits to letters
        String[] keypad = {
                "", // 0
                "", // 1
                "abc", // 2
                "def", // 3
                "ghi", // 4
                "jkl", // 5
                "mno", // 6
                "pqrs", // 7
                "tuv", // 8
                "wxyz" // 9
        };

        int digit = up.charAt(0) - '0';
        String letters = keypad[digit];

        List<String> list = new ArrayList<>();

        for (char ch : letters.toCharArray()) {
            list.addAll(permutation(p + ch, up.substring(1)));
        }

        return list;
    }
}