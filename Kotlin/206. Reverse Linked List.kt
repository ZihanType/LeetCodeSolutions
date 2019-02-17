fun reverseList1(head: ListNode?): ListNode? {
    if (head == null) {
        return null
    }

    var before = head
    var after = head.next
    var tmp: ListNode?

    // headNode -> tailNode, so tailNode.next = null
    before.next = null

    while (after != null) {
        // reverse linked list
        tmp = after.next
        after.next = before

        // move pointer
        before = after
        after = tmp
    }

    return before
}

fun reverseList2(head: ListNode?): ListNode? {
    if (head?.next == null) {
        return head
    }

    val subList = reverseList2(head.next)

    head.next?.next = head
    head.next = null
    return subList
}
