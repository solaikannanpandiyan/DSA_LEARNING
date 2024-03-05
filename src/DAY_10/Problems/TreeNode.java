package DAY_10.Problems;

public class TreeNode {


    private int id;
    public int data;
    public TreeNode left;
    public TreeNode right;

    public int getId() {
        return id;
    }

    public TreeNode(int data, TreeNode left, TreeNode right) {
        this.id = this.hashCode();
        this.data = data;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        String leftValue = this.left==null?"null": String.valueOf(this.left.hashCode());
        String rightValue = this.right==null?"null": String.valueOf(this.right.hashCode());
        return "LinkedListNode{" +
                "id=" + this.getId() +
                ", data=" + this.data +
                ", left=" + leftValue +
                ", right=" + rightValue +
                '}';
    }
}
