package DAY_9.Concepts;

import DAY_7.Problems.Node;
import DAY_9.Problems.TreeNode;
import com.sun.source.tree.Tree;

import java.util.HashMap;

public class TreeMethods {
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


    public static TreeNode Create(int i){
        if(i>=arr.length) // end condition
            return null;

        //recursive function call
        TreeNode left = Create((2*i)+1);
        TreeNode right = Create((2*i)+2);

        // operation
        TreeNode res = new TreeNode(arr[i], left,right);
        printOneTreeNode(res);
        return res;
    }

    public static TreeNode CreateNodeHashMap(){
        // TIME : O(N)
        // SPACE: O(N)
        HashMap<Integer,TreeNode> hm = new HashMap<Integer,TreeNode>();

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

    public static void main(String[] args){
//        Approaches:
//        1) static generate each node and connect
//        1) Create a Tree
//        input: [1 , 2 , 3, 4, 5, 6, 7,null,null,null,15]
//        index: [0,  1 , 2, 3, 4, 5, 6, 7,   8,  9,   10]
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



        TreeNode head = Create(0);
//        printTreeNodeChain(head);


    }
}
