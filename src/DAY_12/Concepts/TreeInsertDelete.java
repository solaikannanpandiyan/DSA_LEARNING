package DAY_12.Concepts;

import DAY_12.Problems.TreeNode;

import java.util.ArrayDeque;
import java.util.HashMap;

public class TreeInsertDelete {
    static int[] arr = {1,2,3,4,5,6,7};

    static void printOneTreeNode(TreeNode temp){
        String leftValue = temp.left==null?"null": String.valueOf(temp.left.hashCode());
        String rightValue = temp.right==null?"null": String.valueOf(temp.right.hashCode());
        System.out.println("LinkedListNode{" +
                "id=" + temp.getId() +
                ", data=" + temp.data +
                ", left=" + leftValue +
                ", right=" + rightValue +
                '}');
    }


    static void printTreeNodeChain(TreeNode node){
        if(node == null)
            return;
        printTreeNodeChain(node.left);
        printOneTreeNode(node);
        printTreeNodeChain(node.right);
    }

    static void printTreeNodeChainInorder(TreeNode node){
        if(node == null) // termination or end condition
            return;
        printTreeNodeChain(node.left); // recursive function call
        printOneTreeNode(node); // operation
        printTreeNodeChain(node.right); // recursive function call
    }

    static void printTreeNodeChainPreorder(TreeNode node){
        if(node == null)
            return;
        printOneTreeNode(node);
        printTreeNodeChain(node.left);
        printTreeNodeChain(node.right);
    }

    static void printTreeNodeChainPostorder(TreeNode node){
        if(node == null)
            return;
        printTreeNodeChain(node.left);
        printTreeNodeChain(node.right);
        printOneTreeNode(node);
    }

    static void printTreeNodeChainIterativePreorder(TreeNode node){
//        if(node == null)
//            return;
//        printOneTreeNode(node);
//        printTreeNodeChain(node.left);
//        printTreeNodeChain(node.right);

        if(node == null){
            System.out.println("The tree has not nodes");
        }

        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        stack.add(node);
        while(!stack.isEmpty()){
            TreeNode head = stack.pop();

            //operation
            System.out.println(head);

            if(head.right!=null) stack.push(head.right);
            if(head.left!=null) stack.push(head.left);
        }


    }

    public static TreeNode Create(int i){
        if(i>=arr.length) // end condition
            return null;

        //recursive function call
        TreeNode left = Create((2*i)+1);
        TreeNode right = Create((2*i)+2);

        // operation
        TreeNode res = new TreeNode(arr[i], left,right);
//        printOneTreeNode(res);
        return res;
    }

    public static TreeNode CreateNodeHashMap(){
        // TIME : O(N)
        // SPACE: O(N)
        HashMap<Integer, TreeNode> hm = new HashMap<Integer, TreeNode>();

        if(arr.length == 0)
            return null;

        for(int i = 0; i<arr.length;i++){
            hm.put(i, new TreeNode(arr[i],null,null));
        }

        System.out.println(hm);

        for(int i = 0; i<arr.length;i++){
            TreeNode parent = hm.get(i);
            parent.left = hm.getOrDefault( ((i*2)+1), null );
            parent.right = hm.getOrDefault( ((i*2)+2),null);
        }

        return hm.get(0);
    }

    public static TreeNode FindTreeNode(int target, TreeNode node){
        // find the tree node which has the given target value
        if(node == null)
            return null;

        if(node.data == target)
            return node;

        TreeNode left_side = FindTreeNode(target,node.left);
        if(left_side !=  null)
            return left_side;

        TreeNode right_side = FindTreeNode(target,node.right);
        if(right_side != null)
            return right_side;

        return null;
    }

    public static TreeNode FindLastChildrenNode(TreeNode node){
        // find the last children node to swap and delete
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        TreeNode curr = null;
        if(node == null) return curr;
        queue.add(node);
        while(!queue.isEmpty()){
            curr = queue.removeFirst();
            if(curr.left != null) queue.add(curr.left);
            if(curr.right != null) queue.add(curr.right);
        }
        return curr;
    }


    public static void InsertingANewData(){
        //inserting new data as a node into the tree

    }

    public static boolean RemoveTargetNode(TreeNode head, TreeNode target){
        // remove the target node from tree
        if(head == null)
            return false;

        if(head.left == target){
            head.left = null;
            return true;}

        if(head.right == target){
            head.right = null;
            return true;}

        boolean left = RemoveTargetNode(head.left,target);
        if(left)
            return true;

        boolean right = RemoveTargetNode(head.right,target);
        if(right)
            return true;

        return false;
    }

    public static boolean DeleteData(TreeNode head, int target){
        // finding the node with target element to delete - using find target node function
        // swapping the data of the found node with data of last children element - using find last children function
        // removing the relationship of the last children node from the the tree - using Remove function
        System.out.println("FIND LAST CHILDREN");
        TreeNode last = FindLastChildrenNode(head);
        printOneTreeNode(last);

        System.out.println("FINDING NODE IN BINARY TREE");
        TreeNode node = FindTreeNode(target,head);
        if(node!= null)
            printOneTreeNode(node);

        //simple swap
        int temp = last.data;
        last.data = node.data;
        node.data = temp;

        boolean removalStatus = RemoveTargetNode(head,last);
        System.out.println("REMOVAL STATUS: "+ removalStatus);
        System.out.println("PRINT AFTER REMOVAL");


        return removalStatus;
    }


    public static void main(String[] args){
//        Approaches:
//        1) static generate each node and connect
//        1) Create a Tree
//        input: [1,2,3,4,5,6,7]
//        index: [0,  1 , 2, 3, 4, 5, 6]
//                    1
//                 /     \
//               2        3
//              / \      / \
//             4   5    6   7
//

//        TreeNode left = new TreeNode(6,null,null);
//        TreeNode right = new TreeNode(7,null,null);
//        TreeNode parent = new TreeNode(3,left,right);

//        2) hash map
//        TreeNode head =  CreateNodeHashMap();
//        printTreeNodeChain(head);

//        3) recursion

//        4) queque


        //Traversal
        //Recursive approach - function call stack as ds
        TreeNode head = Create(0);
        System.out.println("IN ORDER");
        printTreeNodeChainInorder(head);
        System.out.println("PRE ORDER");
        printTreeNodeChainPreorder(head);
        System.out.println("POST ORDER");
        printTreeNodeChainPostorder(head);

        //Iterative approach - use our collection stack as ds
        System.out.println("IN ORDER");
        printTreeNodeChainIterativePreorder(head);

        //        System.out.println("PRE ORDER");
//        printTreeNodeChainPreorder(head);
//        System.out.println("POST ORDER");
//        printTreeNodeChainPostorder(head);

        //Iterative approach - use our collection stack as ds
        // try for yourself

        System.out.println("BEFORE DELETE");
        printTreeNodeChainPreorder(head);
        DeleteData(head,1);
        System.out.println("AFTER DELETE");
        printTreeNodeChainPreorder(head);

    }
}
