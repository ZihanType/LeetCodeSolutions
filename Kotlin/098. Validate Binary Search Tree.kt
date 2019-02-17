fun isValidBST(root: TreeNode?): Boolean {
    if (root == null) {
        return true
    }

    return isSubTreeLessThan(root.left, root.`val`)
            && isSubTreeGreaterThan(root.right, root.`val`)
            && isValidBST(root.left)
            && isValidBST(root.right)
}

fun isSubTreeLessThan(node: TreeNode?, `val`: Int): Boolean {
    if (node == null) {
        return true
    }

    return node.`val` < `val`
            && isSubTreeLessThan(node.left, `val`)
            && isSubTreeLessThan(node.right, `val`)
}

fun isSubTreeGreaterThan(node: TreeNode?, `val`: Int): Boolean {
    if (node == null) {
        return true
    }

    return node.`val` > `val`
            && isSubTreeGreaterThan(node.left, `val`)
            && isSubTreeGreaterThan(node.right, `val`)
}
