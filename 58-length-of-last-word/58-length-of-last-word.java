class Solution {
    public int lengthOfLastWord(String s) {
        String[] wrds = s.split(" ");
        int totalWords = wrds.length;
        String lastWord = wrds[totalWords-1];
        return lastWord.length();
    }
}