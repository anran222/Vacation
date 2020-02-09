package tree;

import java.util.Scanner;
import java.util.Stack;

public class Tree {


    public static boolean preOrderTree(TreeNode tree, Function function) {

        if (function == null) {
            return false;
        }
        if (tree != null) {
            if (function.visit(tree)) {
                if (preOrderTree(tree.leftChild, function)) {
                    if (preOrderTree(tree.rightChild, function)) {
                        return true;
                    }
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean inOrderTree(TreeNode tree, Function function) {
        if (function == null) {
            return false;
        }
        // 检查结点是否为空
        if (tree != null) {
            // 中序遍历左子树
            if (inOrderTree(tree.leftChild, function)) {
                // 打印根节点
                if (function.visit(tree)) {
                    // 中序遍历右子树
                    if (inOrderTree(tree.rightChild, function)) {
                        return true;
                    } else {
                        function.visit(tree);
                    }
                }
            } else {
                function.visit(tree);
                return false;
            }
        }
        return true;
    }

    public static boolean postOrderTree(TreeNode treeRoot, Function function) {
        if (function == null) {
            return false;
        }

        // 检查结点是否为空
        if (treeRoot != null) {
            // 后续遍历左子树
            if (postOrderTree(treeRoot.leftChild, function)) {
                //后续遍历右子树
                if (postOrderTree(treeRoot.rightChild, function)) {
                    if (function.visit(treeRoot)) {
                        return true;
                    }
                }else{
                    function.visit(treeRoot);
                    return true;
                }

            } else {
                function.visit(treeRoot);
                return false;
            }
        }
        return true;

    }

    public static boolean inOrderNoRecursion(TreeNode root,Function function){

        if(root==null || function == null){
            return false;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            //向左走到尽头
            while(stack.peek()!=null ){
                stack.push(root.leftChild);
                root = root.leftChild;
            }
            //空指针退栈
            root = stack.pop();
            if(!stack.isEmpty()){
                root = stack.pop();
                if(!function.visit(root)){
                    return false;
                }
                root = root.rightChild;
                stack.push(root.rightChild);
            }
        }
        return true;
    }

    public static TreeNode createTreeByPre() {
        TreeNode node;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入节点值");
        String dataStr = scanner.next();
        if (dataStr.equals("$")) {
            node = null;
        } else {
            node = new TreeNode();
            int data = Integer.valueOf(dataStr);
            node.value = data;
            node.leftChild = createTreeByPre();
            node.rightChild = createTreeByPre();
        }

        return node;

    }

    public interface Function {
        public boolean visit(TreeNode treeNode);
    }

}
