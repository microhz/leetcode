package micro.leetcode.bytedance;

/**
 * @author : micro
 * @date : 2019/5/30
 * @description :
 */
public class Leetcode {

    // given a string and find the longest string that not repeat
    // example

    /**
     * input: "abcabcbb"
     * output: 3
     * @param s
     * @return
     *
     *
     * input: "bbbbb"
     * output: 1
     */
    public int lengthOfLongestSubstring(String s) {
        char[] array = s.toCharArray();

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            String temp = "";
            for (int j = i; j < array.length; j++) {
                if (!temp.contains(String.valueOf(array[j]))) {
                    temp = temp + array[j];
                } else {
                    break;
                }
            }

            if (temp.length() > count) {
                count = temp.length();
            }
        }

        return count;
    }

}
