fun maxDepth1(root: TreeNode?): Int {
    if (root == null) {
        return 0
    }

    return Math.max(maxDepth1(root.left), maxDepth1(root.right)) + 1
}

fun maxDepth2(root: TreeNode?): Int {
    var root = root
    val stack = java.util.LinkedList<Pair<TreeNode?, Int>>()

    if (root != null) {
        stack.add(Pair(root, 1))
    }

    var depth = 0
    var current: Pair<TreeNode?, Int>
    var currentDepth: Int
    while (!stack.isEmpty()) {
        current = stack.poll()
        root = current.first
        currentDepth = current.second
        if (root != null) {
            depth = Math.max(depth, currentDepth)
            stack.add(Pair(root.left, currentDepth + 1))
            stack.add(Pair(root.right, currentDepth + 1))
        }
    }

    return depth
}
