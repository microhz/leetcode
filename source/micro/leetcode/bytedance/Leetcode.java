package micro.leetcode.bytedance;

import java.util.Stack;

/**
 * @author : micro
 * @date : 2019/5/30
 * @description :
 */
public class Leetcode {

    /**
     * The main function test
     * @param args
     */
    public static void main(String[] args) {


        // reverse a linked list test
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);

        reverseList2(listNode);
    }

    // given a string and find the longest string that not repeat
    // example

    /**
     * input: "abcabcbb"
     * output: 3
     * @param s
     * @return
     *
     *
     * input: "bbbbb"
     * output: 1
     */
    public static int lengthOfLongestSubstring(String s) {
        char[] array = s.toCharArray();

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            String temp = "";
            for (int j = i; j < array.length; j++) {
                if (!temp.contains(String.valueOf(array[j]))) {
                    temp = temp + array[j];
                } else {
                    break;
                }
            }

            if (temp.length() > count) {
                count = temp.length();
            }
        }
        return count;
    }


    public static int findCircleNum(int[][] M) {
        return 0;
    }




    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }


    // reverse a linked list

    // tjis algorithm over memory
    public static ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();

        while (head != null) {
            stack.push(head);
            head = head.next;
        }

        head = stack.pop();
        ListNode p = head;
        while (!stack.isEmpty()) {
            p.next = stack.pop();
            p = p.next;
        }

        return head;
    }


    // method
    public static ListNode reverseList2(ListNode head) {
        ListNode pre = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }

        return pre;

    }

}
