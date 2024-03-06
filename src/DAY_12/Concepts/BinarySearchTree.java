package DAY_12.Concepts;

import DAY_12.Problems.TreeNode;
import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class BinarySearchTree {

    static int index = 0;
    static int[] output;

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

    public static int count(TreeNode th){
//        operation
//        *terminal condition
//        recusive function call
        if(th == null)
            return 0;

        int currrentcount = 1;
        int left = count(th.left);
        int right = count(th.right);
        return currrentcount + left + right;
//        return 1 + count(th.left) + count(th.right);
    }

    public static void preOrderToArray(TreeNode head){
        if(head == null)
            return ;
        //operation
        output[index++] = head.data;

        preOrderToArray(head.left);
        preOrderToArray(head.right);
    }

    public static TreeNode balance(TreeNode unBalancedHead){
        int cnt = count(unBalancedHead);
        System.out.println("COUNT : " + cnt);

        // convert to an array
        output = new int[cnt];
        System.out.println(Arrays.toString(output));
        preOrderToArray(unBalancedHead);
        System.out.println(Arrays.toString(output));

        // sort the array
        Arrays.sort(output);
        System.out.println("Sorted Array: " + Arrays.toString(output));
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.sort(Comparator.naturalOrder());

        // convert sorted arrray to balanced binary search tree
        TreeNode bstHead = CreateBinarySearchTree(output,0,output.length-1);

        printTreeNodeChainInorder(bstHead);
        //return null
        return bstHead;
    }

    public static boolean isContains(TreeNode head,int target){
        //search for target in given bst
        //return true if present
        //return false if not present
        // time complexity: O(logn)
        // space complexity: O(logn)
        // iterative
        if(head == null)
            return false;
        if(head.data == target)
            return true;
        if(target < head.data)
            return isContains(head.left,target);
        else
            return isContains(head.right,target);
    }

    public static boolean isContainsPreorder(TreeNode head,int target){
        //time complexity: O(log n ) or O(n) right: O(n)
        //space complexity: O(N) or O(log n) right O(log n)

        if(head == null){
            return false;
        }
        if(head.data == target){
            return true;
        }
        return false || isContainsPreorder(head.left,target) || isContainsPreorder(head.right,target);
    }

    public static int heightOfBst(TreeNode Head){
        if(Head == null)
            return 0;

        //to not consider leaf nodes.
        if ((Head.left == null) && (Head.right == null))
            return 0;
//        int left = heightOfBst(Head.left);
//        int right = heightOfBst(Head.right);
//        int maxHeight = Math.max(left,right);
//        int currHeight = 1;
//        return currHeight + maxHeight;
        return 1 + Math.max(heightOfBst(Head.left),heightOfBst(Head.right));
    }

    public static void insertInBst(TreeNode head,int target){
        if(head == null)
           return;

        if(target < head.data){
            if(head.left != null)
                insertInBst(head.left,target);
            else
                head.left = new TreeNode(target);
        }else{
            if(head.right != null)
                insertInBst(head.right,target);
            else
                head.right = new TreeNode(target);
        }
    }

    public static boolean insert(TreeNode head, int target){
        if(isContains(head,target)) {
            System.out.println("already exists");
            return false;
        }
        insertInBst(head,target);
        return true;
    }

    public static void main(String[] args){
        int[] arr1 = {4,2,6,1,3,5,7};
        int[] arr2 = {1,2,3,4,5,6,7};
//        TreeNode Head1 = Create(0,arr1);
//        TreeNode Head2 = Create(0,arr2);
//        System.out.println(isBinarySearchTree(Head1));
//        System.out.println(isBinarySearchTree(Head2));

        // input
        int[] arr3 = {7,3,2,1,5,4,6,10,9};
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
//        head = balance(head);
//        System.out.println(isContains(head,0));
        System.out.println(heightOfBst(head));
        insertInBst(head,8);
        printTreeNodeChainInorder(head);

    }

}
