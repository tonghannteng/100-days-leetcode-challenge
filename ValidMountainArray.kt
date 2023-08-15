package leetcode

/**
 * @author: tonghann.teng
 * @since: 8/15/23 (Day 3)
 * @link: https://leetcode.com/problems/valid-mountain-array/description/
 */
fun validMountainArray(arr: IntArray): Boolean {
    if (arr.size < 3) return false
    if (arr[0] >= arr[1]) return false
    if (arr[arr.size - 1] >= arr[arr.size - 2]) return false
    var indexLeft = 0
    var indexRight = 0
    for (i in 1 until arr.size) {
        if (arr[i] <= arr[i - 1]) {
            indexLeft = i - 1
            break
        }
    }
    for (i in arr.size - 2 downTo 0) {
        if (arr[i] <= arr[i + 1]) {
            indexRight = i + 1
            break
        }
    }
    return indexRight - indexLeft == 0 || indexRight - indexLeft == 1
}
