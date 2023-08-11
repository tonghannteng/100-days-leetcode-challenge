package leetcode

/**
 * @author: tonghann.teng
 * @since: 8/10/23 (Day 2)
 * @link: https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
 */
fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    val result = ArrayList<Int>()
    val map = mutableMapOf<Int, Int>()
    for (n in nums1) {
        map.put(n, map.getOrDefault(n, 0) + 1)
    }
    for (n in nums2) {
        if (map.containsKey(n) && map.getValue(n) > 0) {
            result.add(n)

            map.put(n, map.getValue(n) - 1)
        }
    }
    return result.toIntArray()
}
