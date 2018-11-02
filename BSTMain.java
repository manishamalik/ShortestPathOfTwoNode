package BinarySearchTreePackage;


public class BSTMain {
    public static void main(String arg[]){

        BSTNode root = new BSTNode(9);
        root.setLeft(new BSTNode(12));
        root.setRight(new BSTNode(12));
        root.getLeft().setLeft(new BSTNode(12));
        root.getLeft().setRight(new BSTNode(12));
        root.getRight().setLeft(new BSTNode(12));
        root.getRight().setRight(new BSTNode(12));;
        ShortestPath shortestPath =new ShortestPath();
        int x=shortestPath.FindShortestPath(root,2,10);
        System.out.println(x);


    }


}
