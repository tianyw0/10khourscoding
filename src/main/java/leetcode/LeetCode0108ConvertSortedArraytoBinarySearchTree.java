package leetcode;

import leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode0108ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0)
            return null;
        Queue<TreeNode> queue = new LinkedList<>();

        TreeNode head = new TreeNode(nums[0]);
        queue.add(head);
        int i = 1;
        while (i < nums.length) {
            TreeNode poll = queue.poll();
            poll.left = new TreeNode(nums[i]);
            queue.add(poll.left);
            i++;

            if(i < nums.length) {
                poll.right = new TreeNode(nums[i]);
                queue.add(poll.right);
                i++;
            }
        }
        return head;
    }
}
