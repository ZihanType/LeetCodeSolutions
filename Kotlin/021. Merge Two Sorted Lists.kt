fun mergeTwoLists1(l1: ListNode?, l2: ListNode?): ListNode? {
    var head: ListNode? = null

    when {
        l1 == null -> return l2
        l2 == null -> return l1
        l1.`val` < l2.`val` -> {
            head = l1
            head.next = mergeTwoLists1(l1.next, l2)
        }
        l1.`val` >= l2.`val` -> {
            head = l2
            head.next = mergeTwoLists1(l1, l2.next)
        }
    }

    return head
}

fun mergeTwoLists2(l1: ListNode?, l2: ListNode?): ListNode? {
    var l1 = l1
    var l2 = l2
    val start = ListNode(0)
    var temp: ListNode? = ListNode(0)
    start.next = temp
    while (l1 != null && l2 != null) {
        if (l1.`val` <= l2.`val`) {
            temp!!.next = l1
            l1 = l1.next
        } else {
            temp!!.next = l2
            l2 = l2.next
        }
        temp = temp.next
    }
    if (l1 != null) {
        temp!!.next = l1
    }
    if (l2 != null) {
        temp!!.next = l2
    }
    return start.next!!.next
}
