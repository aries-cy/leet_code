package leetcode1_10;

/**
 * 给定一个字符串，找出不含有重复字符的最长子串的长度
 * 示例：
 * 给定 "abcabcbb" ，没有重复字符的最长子串是 "abc" ，那么长度就是3。
 * 给定 "bbbbb" ，最长的子串就是 "b" ，长度是1。
 * 给定 "pwwkew" ，最长子串是 "wke" ，长度是3。请注意答案必须是一个子串，"pwke" 是 子序列  而不是子串。
 */
public class A3_lenLongestSubstring {

    public static void main(String[] args) {
        int length = lengthOfLongestSubstring("asdsadeq");
        System.out.println(length);
    }

    public static int lengthOfLongestSubstring(String s) {
        int l=0,r=-1;
        int res = 0;
        char[] chars = s.toCharArray();
        int arr[] = new int[256];
        while (r+1<chars.length&&l<chars.length){
            if(arr[chars[r+1]]==0){
                arr[chars[++r]]++;
            }else {
                arr[chars[l++]]--;
            }
            if(res<r-l+1){
                res = r-l+1;
            }
        }
        return res;
    }
}
