/*
3. Longest Substring Without Repeating Characters
Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

寻找最长不重复子串
* */

fun main(args: Array<String>) {
    val s = Solution3()
    println(s.lengthOfLongestSubstring("abba"))
}

class Solution3 {
    fun lengthOfLongestSubstring(s: String): Int {
        if(s.isEmpty())
            return 0
        else if(s.length==1)
            return 1
        var low = -1
        var high = 0
        var max = 0
        s.forEachIndexed { index, c ->
            high = index
            val find = findElement(s,low,high,c)
            if(find!=-1){
                low = find
            }
            if((high-low)>max)
                max = high-low
        }
        return max
    }

    fun findElement(s:String,start:Int,end:Int,target:Char):Int{
        var flag = false
        var curos = start+1
        while (curos<end){
            if(s[curos] == target){
                flag = true
                break
            }else
                curos++
        }
        return if(flag)
                    curos
               else
                -1
    }
}