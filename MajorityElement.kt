package leetcode

/**
 * @author: tonghann.teng
 * @since: 8/9/23 (Day 1)
 * @link: https://leetcode.com/problems/majority-element/
 */
fun majorityElement(nums: IntArray): Int {
    val map = mutableMapOf<Int, Int>()
    var max = 0
    var result = 0
    nums.forEach { n ->
        map.put(n, map.getOrDefault(n, 0) + 1)
    }
    map.forEach {
        if (it.value > max) {
            max = it.value
            result = it.key
        }
    }
    return result
}
