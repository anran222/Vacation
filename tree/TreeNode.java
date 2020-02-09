package tree;

public class TreeNode{
    public int value;
    public TreeNode leftChild;
    public TreeNode rightChild;
    public TreeNode() {
    }

    public TreeNode(int value) {
        this.value = value;
    }

    public TreeNode(int value, TreeNode leftChild, TreeNode rightChild) {
        super();
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }


}
