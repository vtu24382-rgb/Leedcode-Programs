import java.util.*;

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<int[]> nodeList = new ArrayList<>();
        
        // Queue: node, row, col
        Queue<Object[]> queue = new LinkedList<>();
        queue.offer(new Object[]{root, 0, 0});
        
        while (!queue.isEmpty()) {
            Object[] arr = queue.poll();
            TreeNode node = (TreeNode) arr[0];
            int row = (int) arr[1];
            int col = (int) arr[2];
            
            nodeList.add(new int[]{col, row, node.val});
            
            if (node.left != null)
                queue.offer(new Object[]{node.left, row + 1, col - 1});
            
            if (node.right != null)
                queue.offer(new Object[]{node.right, row + 1, col + 1});
        }
        
        // Sort by col → row → value
        Collections.sort(nodeList, (a, b) -> {
            if (a[0] != b[0])
                return a[0] - b[0];  // column
            if (a[1] != b[1])
                return a[1] - b[1];  // row
            return a[2] - b[2];      // value
        });
        
        List<List<Integer>> result = new ArrayList<>();
        int prevCol = Integer.MIN_VALUE;
        
        for (int[] node : nodeList) {
            int col = node[0];
            int value = node[2];
            
            if (col != prevCol) {
                result.add(new ArrayList<>());
                prevCol = col;
            }
            
            result.get(result.size() - 1).add(value);
        }
        
        return result;
    }
}