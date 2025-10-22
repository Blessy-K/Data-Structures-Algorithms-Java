class Solution {
    public List<String> letterCombinations(String digits) {
        // if (digits.length() == 0) return new ArrayList<>();

        // String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        // List<String> result = new ArrayList<>();

        // if (digits.length() == 1) {
        //     for (char c : map[digits.charAt(0) - '0'].toCharArray())
        //         result.add("" + c);
        // } else if (digits.length() == 2) {
        //     String s1 = map[digits.charAt(0) - '0'];
        //     String s2 = map[digits.charAt(1) - '0'];
        //     for (char c1 : s1.toCharArray())
        //         for (char c2 : s2.toCharArray())
        //             result.add("" + c1 + c2);
        // }

        // return result;


        
        // if (digits == null || digits.length() == 0) return new ArrayList<>();

        // String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        // Queue<String> queue = new LinkedList<>();
        // queue.add("");

        // for (char digit : digits.toCharArray()) {
        //     int size = queue.size();
        //     String letters = map[digit - '0'];

        //     for (int i = 0; i < size; i++) {
        //         String combination = queue.poll();
        //         for (char c : letters.toCharArray()) {
        //             queue.add(combination + c);
        //         }
        //     }
        // }

        // return new ArrayList<>(queue);



        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) return result;

        String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        backtrack(result, map, digits, 0, new StringBuilder());
        return result;
    }

    private void backtrack(List<String> result, String[] map, String digits, int index, StringBuilder current) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = map[digits.charAt(index) - '0'];
        for (char c : letters.toCharArray()) {
            current.append(c);
            backtrack(result, map, digits, index + 1, current);
            current.deleteCharAt(current.length() - 1); // backtrack step
        }
    }
}