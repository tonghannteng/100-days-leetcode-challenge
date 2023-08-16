package leetcode

/**
 * @author: tonghann.teng
 * @since: 8/16/23 (Day 4)
 * @link: https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
 */
fun sumOddLengthSubarrays(arr: IntArray): Int {
    var sum = 0
    for (i in arr.indices) {
        var j = i
        while (j < arr.size) {
            for (m in i..j) {
                sum += arr[m]
                print("${arr[m]} ")
            }
            println()
            j += 2
        }
    }
    return sum
}
