fun removeElements1(head: ListNode?, `val`: Int): ListNode? {
    var node = ListNode(0)
    node.next = head
    val result = node

    while (node.next != null) {
        if (node.next!!.`val` == `val`)
            node.next = node.next!!.next
        else
            node = node.next!!
    }

    return result.next
}

fun removeElements2(head: ListNode?, `val`: Int): ListNode? {
    if (head == null) {
        return null
    }

    head.next = removeElements2(head.next, `val`)
    return if (head.`val` == `val`) head.next else head
}
