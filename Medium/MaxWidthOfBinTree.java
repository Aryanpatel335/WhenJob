// package Medium;
// import java.util.*;
// import javafx.util.Pair;
// class TreeNode{
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode(){}
//     TreeNode(int val){
//         this.val = val;
//     }
//     TreeNode(int val, TreeNode left, TreeNode right){
//         this.val = val;
//         this.left = left;
//         this.right = right;
//     }
// }

// //incomplete
// //lc 662. Maximum Width of Binary Tree
// //https://leetcode.com/problems/maximum-width-of-binary-tree/editorial/ 
// public class MaxWidthOfBinTree {
    
//     public int MaxWidthOfBinTree(TreeNode root){
//         if(root == null){
//             return 0;
//         }

//         LinkedList<Pair<TreeNode,Integer>> queue = new LinkedList<>();
//         Integer maxWidth  = 0 ;
//         queue.add(new Pair<>(root,0));
//         while(queue.size() > 0){
//             Pair<TreeNode,Integer> head = queue.getFirst();
//             int size = queue.size();
//             Pair<TreeNode,Integer> elem = null;
//             for(int i = 0 ; i < size ; i++){
//                 elem = queue.removeFirst();
//                 if(elem.getKey().left != null){
//                     queue.add(new Pair<>(elem.getKey().left,2*elem.getValue()));
//                 }
//                 if(elem.getKey().right != null){
//                     queue.add(new Pair<>(elem.getKey().right,2*elem.getValue()+1));
//                 }
//             }
//             maxWidth = Math.max(maxWidth, elem.getValue() - head.getValue - 1);
//         } 
//         return maxWidth;
//     }
// }
