import struct.TreeNode;

/**
 * @author luyingjian
 * @date 2024/2/26
 */
public class Seq_938 {

    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;
        if (root.val > high) {
            return rangeSumBST(root.left, low, high);
        }

        if (root.val < low) {
            return rangeSumBST(root.right, low, high);
        }

        return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);


    }

    public int test(TreeNode root) {
        if (root == null) return 0;
        return root.val + test(root.left) + test(root.right);
    }
}
