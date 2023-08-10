package leetcode

/**
 * @author: tonghann.teng
 * @since: 8/10/23 (Day 2)
 * @link: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
 */
fun findDisappearedNumbers(nums: IntArray): List<Int> {
    val result = ArrayList<Int>()
    val arr = IntArray(nums.size)
    for (num in nums) {
        arr[num - 1]++
    }
    for (i in arr.indices) {
        if (arr[i] == 0) {
            result.add(i + 1)
        }
    }
    return result
}
