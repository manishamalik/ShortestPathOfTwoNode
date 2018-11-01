package BinarySearchTreePackage;

public class BSTNode {
    private int data;
    private BSTNode left;
    private BSTNode right;
    public BSTNode(int data){
        this.data= data;
        left=null;
        right= null;
    }
    public void setData(int data1){
        this.data=data1;
    }
    public int getData(){
        return data;
    }

    public BSTNode getLeft() {
        return left;
    }

    public void setLeft(BSTNode left) {
        this.left = left;
    }

    public BSTNode getRight() {
        return right;
    }

    public void setRight(BSTNode right) {
        this.right = right;
    }
}
