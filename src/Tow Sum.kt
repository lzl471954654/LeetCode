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