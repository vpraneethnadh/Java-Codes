class unode {
    int data;
    unode next;
    unode prev;

    unode(int data) {
        this.data = data;
        next = null;
        prev = null;
    }
}

public class UberFirst {
    public static unode head;
    public static unode tail;

    public static void insert(int n) {
        unode temp = new unode(n);
        if (head == null)
            head = temp;
        else {
            tail = head;
            while (tail.next != null)
                tail = tail.next;
            tail.next = temp;
            temp.prev = tail;
        }
    }

    public static void delete(int pos) {
        if (head == null)
            return;
        else {
            if (pos == 1)
                head = head.next;
            else {
                tail = head;
                while (pos > 2) {
                    tail = tail.next;
                    pos--;
                }
                tail.next = tail.next.next;
                tail.next.next.prev = tail;
            }
        }
    }

    public static void printdata() {
        if (head == null)
            return;
        else {
            tail = head;
            while (tail != null) {
                System.out.print(tail.data + " ");
                tail = tail.next;
            }
            System.out.println("Null");
        }
    }

    public static void main(String args[]) {
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        System.out.println("After insertion of data:");
        printdata();

        delete(2);
        System.out.println("After deletion of data:");
        printdata();
    }
}
