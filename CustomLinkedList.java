public class CustomLinkedList {
    private Node head;

    public CustomLinkedList() {
        head = null;
    }

    public void insert(int lineNumber) {
        Node newNode = new Node(lineNumber);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.lineNumber);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        return sb.toString();
    }
}
