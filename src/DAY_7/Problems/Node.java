package DAY_7.Problems;


class Node{

    public int getId() {
        return id;
    }

    private int id;

    int data;

    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
        this.id = this.hashCode();
    }


}

