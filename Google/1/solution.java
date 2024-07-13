class Solution {
    public int numSplits(String s) {
        int len = s.length();

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);

            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }

        int count = 0;

        for (int splitIndex = 0; splitIndex < (len - 1); splitIndex++) {
            char ch = s.charAt(splitIndex);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
            if (map2.get(ch) == 1)
                map2.remove(ch);
            else
                map2.put(ch, map2.get(ch) - 1);

            if (map1.size() == map2.size())
                count++;
        }

        return count;
    }
}