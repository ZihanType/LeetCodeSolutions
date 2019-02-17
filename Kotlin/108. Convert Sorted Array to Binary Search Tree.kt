fun sortedArrayToBST(nums: IntArray): TreeNode? {
    if (nums.isEmpty())
        return null

    val root = TreeNode(nums[nums.size / 2])
    val left = nums.sliceArray(0 until nums.size / 2)
    val right = nums.sliceArray(nums.size / 2 + 1 until nums.size)

    root.left = sortedArrayToBST(left)
    root.right = sortedArrayToBST(right)

    return root
}
