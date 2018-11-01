package BinarySearchTreePackage;

import BSTPackage.BSTInsert;
import BSTPackage.BSTNode;
import BSTPackage.ShortestPath;

public class BSTMain {
    public static void main(String arg[]){
        BSTInsert insert =new BSTInsert();
        BSTNode root = new BSTNode(9);
        insert.insertElement(root,4);
        insert.insertElement(root,12);
        insert.insertElement(root,3);
        insert.insertElement(root,10);
        insert.insertElement(root,2);
        insert.insertElement(root,10);
        BSTNode node= insert.insertElement(root,5);
        ShortestPath shortestPath =new ShortestPath();
        int x=shortestPath.FindShortestPath(root,2,10);
        System.out.println(x);


    }


}
