package DAY_7.Problems;

public class Node{

    public int getId() {
        return id;
    }

    private int id;

    public int data;

    public Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
        this.id = this.hashCode();
    }


}

