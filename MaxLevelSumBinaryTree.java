import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class MaxLevelSumBinaryTree {

    public static int maxLevelSum(TreeNode root) {
        if (root == null) return 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int maxSum = Integer.MIN_VALUE;
        int maxLevel = 1;
        int level = 1;

        while (!q.isEmpty()) {
            int size = q.size();
            int sum = 0;

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                sum += node.val;

                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }

            if (sum > maxSum) {
                maxSum = sum;
                maxLevel = level;
            }

            level++;
        }

        return maxLevel;
    }

    public static TreeNode buildTree(Scanner sc) {
        System.out.print("Enter root value: ");
        int val = sc.nextInt();

        if (val == -1) return null;

        TreeNode root = new TreeNode(val);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();

            System.out.print("Enter left child of " + curr.val + ": ");
            int left = sc.nextInt();
            if (left != -1) {
                curr.left = new TreeNode(left);
                q.add(curr.left);
            }

            System.out.print("Enter right child of " + curr.val + ": ");
            int right = sc.nextInt();
            if (right != -1) {
                curr.right = new TreeNode(right);
                q.add(curr.right);
            }
        }

        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeNode root = buildTree(sc);
        int result = maxLevelSum(root);

        System.out.println("Level with maximum sum is: " + result);

        sc.close();
    }
}
