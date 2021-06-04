package linkedlistPallindorome;

public class LinkedList {

    private Node head = null;

    public void insertFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public Node getHead() {
        return head;
    }

    @Override
    public String toString() {
        return "LinkedList{" + "head=" + head.val + '}';
    }

}
