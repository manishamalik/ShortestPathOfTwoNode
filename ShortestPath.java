package BinarySearchTreePackage;


import BSTPackage.BSTNode;

public class ShortestPath {
    public int FindShortestPath(BSTNode root, int x, int y){
        int data= root.getData();
        BSTNode lca= findLCA(root, x,y);
        return (getDistance(root,x)+getDistance(root,y)-2*getDistance(root,lca.getData()));
    }
    public int getDistance(BSTNode root, int x){
        int data= root.getData();
        if(data==x){
            return 0;
        }
        else if(data>x){
            return 1+ getDistance(root.getLeft(),x);
        }
        else {
            return 1+ getDistance(root.getRight(),x);
        }
    }
    public BSTNode findLCA(BSTNode root, int x, int y){
        int val= root.getData();
        BSTNode left, right;
        if(root==null){
            return root;
        }
        else if(val<x && val<y){
            return findLCA(root.getRight(),x,y);
        }
        else if(val>x &&val>y){
            return findLCA(root.getLeft(),x,y);
        }
            return root;
    }
}
