class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index == -1) {
            return word;
        }
        String prefix = word.substring(0, index + 1);
        String suffix = word.substring(index + 1);
        StringBuilder reversedPrefix = new StringBuilder(prefix).reverse();
        return reversedPrefix.toString() + suffix;
        
    }
}