fun missingNumber(nums: IntArray): Int {
    if (nums.size == 1 && nums[0] == 0) return 1
    nums.sort()
    val a = (0..nums.size).toList()
    repeat(nums.size) {
        if (a[it] < nums[it]) return a[it]
    }
    return a.last()
}
