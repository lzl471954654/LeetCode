/*
*
    You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

    You may assume the two numbers do not contain any leading zero, except the number 0 itself.

    Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
    Output: 7 -> 0 -> 8
*
*
*/

/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int = 0) {
 *     var next: ListNode? = null
 * }
 */

class ListNode(var `val`:Int = 0){
    var next: ListNode? = null
}
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var list1 = l1
        var list2 = l2
        var sum = 0
        var tempSum = 0
        var pre1:ListNode? = null
        while (list1!=null&&list2!=null){
            list1.`val`+=(sum/10)
            sum = list1.`val` + list2.`val`
            tempSum = sum%10
            list1.`val` = tempSum
            pre1 = list1
            list1 = list1.next
            list2 = list2.next
        }
        if(list2 == null && list1 == null){
            if(sum>=10){
                val node = ListNode(sum/10)
                pre1!!.next = node
                node.next = null
            }else{
                pre1!!.`val` += (sum/10)
            }
        }else if (list1 == null){
            addNumberIntoList(list2,sum/10)
            pre1!!.next = list2
        }else{
            addNumberIntoList(list1,sum/10)
        }
        return l1
    }

    fun addNumberIntoList(list: ListNode?, value:Int ){
        var l = list
        l!!.`val` += value
        while (l!=null&&l.`val`>=10){
            val temp = l.`val`
            l.`val` = temp%10
            if (l.next!=null){
                l.next!!.`val` += (temp/10)
            }else{
                val node =  ListNode(temp/10)
                l.next = node
                node.next = null
            }
            l = l.next
        }
    }
}