package TreeDS;


public class TreeNode {

    int data;
    TreeNode leftChild;
    TreeNode rightChild;

    //Default constructor
    public TreeNode(int data){
        this.data = data;
        leftChild = rightChild = null;
    }

    //Method to insert the data
    public void insert(int value){
        //If duplicate value
        if(value == data)
            return;

        //If the value is less than data
        if(value < data){
            if(leftChild == null)
                leftChild = new TreeNode(value);
            else
                leftChild.insert(value);
        }
        //If the value is greater than data
        else{
            if(rightChild == null)
                rightChild = new TreeNode(value);
            else
                rightChild.insert(value);
        }
    }

    public void traverseInOrder(){
        if(null != leftChild)
            leftChild.traverseInOrder();

        System.out.println(data + " ");

        if(null != rightChild)
            rightChild.traverseInOrder();
    }

    public int findValue(int value){
        if(value == data)
            return data;
        else if(value < data){
            if(leftChild != null)
                return leftChild.findValue(value);
        }
        else{
            if(rightChild != null)
                return rightChild.findValue(value);
        }

        return -1;
    }

    public int findMin(){
        if(leftChild != null)
            return leftChild.findMin();

        return data;
    }

    public int findMax(){
        if(rightChild != null)
            return rightChild.findMax();

        return data;
    }


}
