package DataStructers;

public class ourlinkedlist<Type> {
    node headNode;

    public void ourlinkedlist() {
        headNode = null;
    }

    public void add(Object value) {
        node newNode = new node(value, null);
        if (headNode == null) {
            headNode = newNode;
        } else {
            newNode.next = headNode;
            headNode = newNode;
        }
    }
    public void delete() {
        headNode = headNode.next;
    }
    public void display() {
        node n = headNode;
        while(n!=null) {
            System.out.println((Type)n.value);
            n=n.next;
        }
    }
}
