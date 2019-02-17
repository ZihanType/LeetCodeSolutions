fun isSymmetric1(root: TreeNode?): Boolean {
    if (root == null)
        return true

    return checkNodes(root.left, root.right)
}

fun checkNodes(left: TreeNode?, right: TreeNode?): Boolean {
    if (left == null && right == null)
        return true

    if (left == null || right == null)
        return false

    if (left.`val` != right.`val`)
        return false

    return checkNodes(left.left, right.right)
            && checkNodes(left.right, right.left)
}

fun isSymmetric2(root: TreeNode?): Boolean {
    if (root == null)
        return true

    val deque = java.util.LinkedList<TreeNode?>()
    deque.addFirst(root.left)
    deque.addLast(root.right)

    var previous: TreeNode?
    var next: TreeNode?
    while (!deque.isEmpty()) {
        previous = deque.pollFirst()
        next = deque.pollLast()

        if (previous == null && next == null)
            continue

        if (previous == null || next == null)
            return false

        if (previous.`val` != next.`val`)
            return false

        deque.addFirst(previous.right)
        deque.addFirst(previous.left)

        deque.addLast(next.left)
        deque.addLast(next.right)
    }

    return true
}
