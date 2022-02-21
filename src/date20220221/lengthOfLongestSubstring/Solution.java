package date20220221.lengthOfLongestSubstring;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author wugang
 * @date 2020/12/8 11:37
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        //若s为null，或s是空串，返回0
        if (s == null || s.equals("")){
            return 0;
        }

        //将字符串转为字符数组
        char[] chars = s.toCharArray();
        //maxleng为最长子串的长度；left为开始计算的位置；i为下标，方便取出字符；length为s的长度，用于循环退出条件
        int maxLen = 0, left = 0, i = 0, length = s.length();
        //使用HashMap存储字符串，key为字符，value为字符对应的下标
        Map<Object, Integer> stringMap = new HashMap<>();

        while (left < length && i < length){
            //若hashMap中已经存在该字符，则计算目前子串的长度，left前移一位
            if (stringMap.containsKey(chars[i]) && stringMap.get(chars[i]) >= left){
                maxLen = Math.max(maxLen, i - left);
                left = stringMap.get(chars[i]) + 1;
            }
            //将字符存入hashMap中
            stringMap.put(chars[i], i);
            i++;
        }
        return Math.max(maxLen, i - left);
    }

    /**
     * 官方解答
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring1(String s) {
        // 哈希集合，记录每个字符是否出现过
        Set<Character> occ = new HashSet<Character>();
        int n = s.length();
        // 右指针，初始值为 -1，相当于我们在字符串的左边界的左侧，还没有开始移动
        int rk = -1, ans = 0;
        for (int i = 0; i < n; ++i) {
            if (i != 0) {
                // 左指针向右移动一格，移除一个字符
                occ.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                // 不断地移动右指针
                occ.add(s.charAt(rk + 1));
                ++rk;
            }
            // 第 i 到 rk 个字符是一个极长的无重复字符子串
            ans = Math.max(ans, rk - i + 1);
        }
        return ans;
    }
}
