fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) return 0

    var number = 0
    for (index in 0 until nums.size) {
        if (nums[index] != nums[number]) {
            number++
            nums[number] = nums[index]
        }
    }

    return number + 1
}
