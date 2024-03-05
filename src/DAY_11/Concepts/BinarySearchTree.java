package DAY_11.Concepts;

import DAY_11.Problems.TreeNode;

public class BinarySearchTree {

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

    public static TreeNode Create(int i,int[] arr){
        if(i>=arr.length) // end condition
            return null;

        //recursive function call
        TreeNode left = Create((2*i)+1,arr);
        TreeNode right = Create((2*i)+2,arr);

        // operation
        TreeNode res = new TreeNode(arr[i], left,right);
//        printOneTreeNode(res);
        return res;
    }

    static boolean isBinarySearchTree(TreeNode head){


        return true;
    }

    public static void main(String[] args){
        int[] arr1 = {4,3,6,1,2,5,7};
        int[] arr2 = {1,2,3,4,5,6,7};
        TreeNode Head1 = Create(0,arr1);
        TreeNode Head2 = Create(0,arr2);
        System.out.println(isBinarySearchTree(Head1));
        System.out.println(isBinarySearchTree(Head2));
    }

}
