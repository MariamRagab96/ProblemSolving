package linkedlistPallindorome;

/*Palindrome Linked List

 Given the head of a singly linked list, return true if it is a palindrome.
 
 */
import java.util.*;

class Solution {

    public boolean isPalindrome(Node head) {

        Stack<Integer> stack = new Stack<>();
        Node temp = head;

        while (temp != null) {
            stack.push(temp.val);
            temp = temp.next;
        }
        while (head != null) {
            int data = stack.pop();
            if (data != head.val) {
                return false;
            }
            head = head.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList LinkedList = new LinkedList();
        String s = sc.nextLine();

        for (int i = s.length() - 2; i >= 1; i -= 2) {
            LinkedList.insertFirst(Integer.parseInt(s.substring(i, i + 1)));
        }
        System.out.println(new Solution().isPalindrome(LinkedList.getHead()));
    }
}
