/*
给定一个已经按升序排列的数组，找到两个数使他们加起来的和等于特定数。
函数应该返回这两个数的下标，index1必须小于index2。注意返回的值不是 0-based。

 注意事项

你可以假设每个输入刚好只有一个答案

样例
给定数组为 [2,7,11,15] ，target = 9
返回 [1,2]
* */
class Solution1 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val answer = IntArray(2)
        nums.forEachIndexed { index, i ->
            nums.forEachIndexed { index1, i1 ->
                if(i+i1 == target){
                    answer[0] = index
                    answer[1] = index1
                    return answer
                }
            }
        }
        return answer
    }
}