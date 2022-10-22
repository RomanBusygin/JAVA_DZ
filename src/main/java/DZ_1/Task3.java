package DZ_1;

class Solution {
    public String reverseWords(String s) {
        StringBuilder words = new StringBuilder();
        int endWord = s.length() - 1;
        int startWord = endWord;

        while (startWord >= 0) {
            while (!Character.isLetterOrDigit(s.charAt(endWord))) {
                if (endWord > 0) {
                    endWord--;
                    startWord--;
                }
                else break;
            }
            while (s.charAt(startWord) != ' ') {
                if (startWord > 0) {
                    startWord--;
                }
                else {
                    startWord--;
                    break;
                }
            }

            words.append(s.substring(startWord + 1, endWord + 1));
            words.append(" ");
            endWord = startWord-- - 1;
        }

        while (words.charAt(words.length() - 1) == ' ') {
            words.deleteCharAt(words.length() - 1);
        }
        return words.toString();
    }
}