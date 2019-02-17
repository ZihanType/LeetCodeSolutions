fun levelOrder1(root: TreeNode?): List<List<Int>> {
    val result = arrayListOf<List<Int>>()
    if (root == null)
        return result

    val queue = java.util.LinkedList<TreeNode>()
    val tmp = arrayListOf<Int>()
    var node: TreeNode
    var size: Int

    queue.add(root)

    while (!queue.isEmpty()) {
        size = queue.size

        repeat(size) {
            node = queue.remove()

            tmp.add(node.`val`)

            if (node.left != null)
                queue.add(node.left!!)

            if (node.right != null)
                queue.add(node.right!!)
        }

        @Suppress("UNCHECKED_CAST")
        result.add(tmp.clone() as List<Int>)
        tmp.clear()
    }

    return result
}

fun levelOrder2(root: TreeNode?): List<List<Int>> {
    val result = arrayListOf<ArrayList<Int>>()

    levelOrderHelper(0, result, root)

    return result
}

fun levelOrderHelper(level: Int, result: ArrayList<ArrayList<Int>>, node: TreeNode?) {
    if (node != null) {
        if (level == result.size)
            result.add(arrayListOf())

        result[level].add(node.`val`)
        levelOrderHelper(level + 1, result, node.left)
        levelOrderHelper(level + 1, result, node.right)
    }
}
