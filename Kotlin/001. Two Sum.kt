fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = mutableMapOf<Int, Int>()
    var right: Int
    var left: Int
    var leftIndex: Int?

    for (rightIndex in nums.indices) {
        right = nums[rightIndex]
        left = target - right
        leftIndex = map[left]
        if (leftIndex != null) {
            return intArrayOf(leftIndex, rightIndex)
        } else {
            map[right] = rightIndex
        }
    }
    return intArrayOf()
}
