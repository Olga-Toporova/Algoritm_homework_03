public class dList {
    private static Node Head;
    private static Node Tail;

    private static class Node {
        private int value;
        private Node next;
        private Node prev;
    }

    public static void addEnd(int value) {
        Node node = new Node();
        node.value = value;

        if (Tail != null) {
            Tail.next = node;
            node.prev = Tail;
        } else {
            Head = node;
        }
        Tail = node;
    }

    public static void print() {
        Node current = Head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }


    public static void reverseList() {
        if (Head != null && Tail != Head) {
            Node left = Head;
            Node right = Tail;

            while (left != right && left != right.next) {
                int value = left.value;
                left.value = right.value;
                right.value = value;

                left = left.next;
                right = right.prev;
            }
        }
        print();
    }

    public static void main(String[] args) {
        addEnd(1);
        addEnd(2);
        addEnd(3);
        addEnd(4);
        addEnd(5);
        addEnd(6);
        addEnd(7);

        print();

        reverseList();
    }
}
