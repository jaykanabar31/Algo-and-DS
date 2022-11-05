package TreeDS;

public class Tree {

    TreeNode root;

    //Insert the data
    public void insert(int value){

        //If it's the first element
        if(null == root)
            root = new TreeNode(value);
        else
            root.insert(value);
    }

    public void traverseInOrder(){
        if(null != root)
            root.traverseInOrder();
    }

    public int findValue(int value){
        if(null != root)
            return root.findValue(value);

        return -1;
    }

    public int findMin() {
        if (root != null)
            return root.findMin();

        return -1;
    }

    public int findMax() {
        if (root != null)
            return root.findMax();

        return -1;
    }

    public void delete(int value){
        root = deleteNode(root, value);
    }

    public TreeNode deleteNode(TreeNode currentNode, int value){

        if(currentNode == null)
            return currentNode;

        if(value < currentNode.data)
            currentNode.leftChild = deleteNode(currentNode.leftChild, value);
        else if(value > currentNode.data)
            currentNode.rightChild = deleteNode(currentNode.rightChild, value);
        else{
            //0 or 1 child
            if(null == currentNode.leftChild)
                return currentNode.rightChild;
            else if(null == currentNode.rightChild)
                return currentNode.leftChild;

            currentNode.data = currentNode.rightChild.findMin();

            //delete the node
            currentNode.rightChild = deleteNode(currentNode.rightChild, currentNode.data);
        }

        return currentNode;
    }

    public int getHeight(){

        return height(root);
    }

    public int height(TreeNode curr){
        if(curr == null)
            return 0;
        else{
            int l = height(curr.leftChild);
            int r = height(curr.rightChild);

            if(l > r)
                return (l + 1);
            else
                return (r + 1);
        }
    }
}
