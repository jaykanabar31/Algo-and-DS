package TreeDS;

public class Solution {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(10);
        tree.insert(3);
        tree.insert(11);
        tree.insert(2);
        tree.insert(1);
        tree.insert(17);
        tree.insert(9);

        System.out.println(tree.getHeight());
    }

}
