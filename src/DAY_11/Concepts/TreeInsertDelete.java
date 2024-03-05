package DAY_11.Concepts;

import DAY_11.Problems.TreeNode;

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

    public static TreeNode FindTreeNode(int target,TreeNode node){
        // find the tree node which has the given target value
        return null;
    }

    public static TreeNode FindLastChildrenNode(TreeNode node){
        // find the last children node to swap and delete
        return null;
    }

    public static boolean RemoveTargetNode(){
        // remove the target node from tree
        return true;
    }

    public static boolean DeleteData(TreeNode head,int target){

        return true;
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

        //Iterative approach - use our collection stack as ds



//        System.out.println("PRE ORDER");
//        printTreeNodeChainPreorder(head);
//        System.out.println("POST ORDER");
//        printTreeNodeChainPostorder(head);


    }
}
