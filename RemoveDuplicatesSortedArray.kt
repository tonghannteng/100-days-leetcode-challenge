package leetcode

/**
 * @author: tonghann.teng
 * @since: 8/10/23 (Day 2)
 * @link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 */
fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) return 0
    var count = 0
    for (i in 1 until nums.size) {
        if (nums[i] != nums[i - 1]) {
            count++
            nums[count] = nums[i]
        }
    }
    return count + 1
}
