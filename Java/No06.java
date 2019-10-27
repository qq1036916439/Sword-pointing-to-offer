/**
 * 根据前序遍历和中序遍历建立树
 */

public class No06 {

    public static void main(String[] args) {
        //
        String preOrder = "12473568";
        //
        String midOrder = "47215386";

        BiTree tree = new BiTree(preOrder, midOrder, preOrder.length());
        tree.postRootTraverse(tree.root,0);
    }

}

class BiTree {
    TreeNode root;

    public BiTree(String preOrder, String midOrder, int count) {
        if (count <= 0) {
            return;
        }
        //前序遍历的 顺序为 前 左 右 所以第一个节点。为头节点
        char c = preOrder.charAt(0);
        int i = 0;
        //通过循环 在中序遍历的是否 分出 左子树 和右子树。
        for (; i < count; i++) {
            if (midOrder.charAt(i) == c) break;
        }
        //设置根节点
        root = new TreeNode(c);
        //可以得出 左边的叶子节点为。根据 左右字数关系找出头结点。
        root.setLchild(new BiTree(preOrder.substring(1, i + 1), midOrder.substring(0, i), i).root);
        root.setRchild(new BiTree(preOrder.substring(i + 1), midOrder.substring(i + 1), count - i - 1).root);
    }


    public void postRootTraverse(TreeNode root, int i) {
        if (root != null) {
            //层序遍历二叉树 .输出结果
            postRootTraverse(root.getLchild(),i++);
            postRootTraverse(root.getRchild(),i++);
        }
    }
}

class TreeNode {
    char data;
    TreeNode Lchild;
    TreeNode Rchild;

    public TreeNode(char data) {
        super();
        this.data = data;
    }

    public TreeNode(char data, TreeNode lchild, TreeNode rchild) {
        super();
        this.data = data;
        Lchild = lchild;
        Rchild = rchild;
    }

    public char getData() {
        return data;
    }

    public void setData(char data) {
        this.data = data;
    }

    public TreeNode getLchild() {
        return Lchild;
    }

    public void setLchild(TreeNode lchild) {
        Lchild = lchild;
    }

    public TreeNode getRchild() {
        return Rchild;
    }

    public void setRchild(TreeNode rchild) {
        Rchild = rchild;
    }


}