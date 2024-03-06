package DAY_12.Concepts;

import DAY_12.Problems.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

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

    public static TreeNode Create(int i, int[] arr){
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
        if(head == null)
            return true;

        if(head.left != null){
            if(head.left.data > head.data){
                return false;
            }
        }
        if(head.right != null){
            if(head.right.data < head.data){
                return false;
            }
        }

        return isBinarySearchTree(head.left) && isBinarySearchTree(head.right);
    }

    public static TreeNode CreateBinarySearchTree(int[] arr, int start, int end){
        if(start>end)
            return null;
        int mid = (start + end) / 2;
        TreeNode newNode = new TreeNode(arr[mid]);
        newNode.left = CreateBinarySearchTree(arr,start,mid-1);
        newNode.right =CreateBinarySearchTree(arr,mid+1,end) ;
        return newNode;
    }

    static void printTreeNodeChainInorder(TreeNode node){
        if(node == null) // termination or end condition
            return;
        printTreeNodeChainInorder(node.left); // recursive function call
        printOneTreeNode(node); // operation
        printTreeNodeChainInorder(node.right); // recursive function call
    }

    public static TreeNode balance(TreeNode unBalancedHead){
        // convert to an Arraylist

        // sort the Arraylist
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.sort(Comparator.naturalOrder());

        // convert sorted arrray to balanced binary search tree

        //return null
        return null;
    }


    public static void main(String[] args){
        int[] arr1 = {4,2,6,1,3,5,7};
        int[] arr2 = {1,2,3,4,5,6,7};
//        TreeNode Head1 = Create(0,arr1);
//        TreeNode Head2 = Create(0,arr2);
//        System.out.println(isBinarySearchTree(Head1));
//        System.out.println(isBinarySearchTree(Head2));

        // input
        int[] arr3 = {7,3,2,1,5,4,6};
        System.out.println(Arrays.toString(arr3));
        Arrays.sort(arr3);
//      {7,3,2,1,5,4,6};
//        Array:
//      {1,  2,  3,  4,  5,  6,  7};
//        Index:
//      {0,  1,  2,  3,  4,  5,  6};
        System.out.println(Arrays.toString(arr3));
        TreeNode head = CreateBinarySearchTree(arr3,0,arr3.length-1);
        printTreeNodeChainInorder(head);
    }

}
