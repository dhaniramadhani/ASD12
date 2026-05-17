public class DoubleLinkedList24 {
    Node24 head;
    Node24 tail;

    public DoubleLinkedList24() {
        head = null;
        tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa24 data) {
        Node24 newNode = new Node24(null, data, null);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa24 data) {
        Node24 newNode = new Node24(null, data, null);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa24 data) {
        Node24 current = head;

        while (current != null) {
            if (current.data.nim.equals(keyNim)) {

                Node24 newNode = new Node24(current, data, current.next);

                if (current.next != null) {
                    current.next.prev = newNode;
                } else {
                    tail = newNode;
                }

                current.next = newNode;
                break;
            }

            current = current.next;
        }
    }

 public void print() {
    if (isEmpty()) {
        System.out.println("Linked List masih kosong");
    } else {
        Node24 current = head;

        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }
}
public void printReverse() {
    if (isEmpty()) {
        System.out.println("Linked List masih kosong");
    } else {
        Node24 current = tail;

        while (current != null) {
            current.data.tampil();
            current = current.prev;
        }
    }
}
public void removeFirst() {
    if (isEmpty()) {
        System.out.println("Linked List kosong");
    } else if (head == tail) {

        System.out.println("Data yang dihapus:");
        head.data.tampil();

        head = tail = null;
    } else {

        System.out.println("Data yang dihapus:");
        head.data.tampil();

        head = head.next;
        head.prev = null;
    }
}

public void removeLast() {
    if (isEmpty()) {
        System.out.println("Linked List kosong");
    } else if (head == tail) {

        System.out.println("Data yang dihapus:");
        tail.data.tampil();

        head = tail = null;
    } else {

        System.out.println("Data yang dihapus:");
        tail.data.tampil();

        tail = tail.prev;
        tail.next = null;
    }
}
}