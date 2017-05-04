/**
 * Created by Brownie on 5/3/2017.
 */
public class Node {
    private String data;
    private Node left, right;
    /*Constructor method */
    public Node(){
        data = "";
        left = null;
        right = null;

    }
    /*  Constructor with parameters*/
    public Node(String data,Node left, Node right) {

        this.data = data;
        this.left = left;
        this.right = right;
    }

    /* Get left node method*/
    public Node getLeft() {
        return left;
    }

    /* Set left node method*/
    public void setLeft(Node left)
    {
        this.left = left;
    }

    /* Method to return previous node */
    public Node getRight(){
        return right;
    }

    /*Method to set previous node */
    public void setRight(Node right){
        this.right = right;
    }

    /*method to return the node in String */
    public String getData() {
        return data;
    }

    /*Method to set the data of node */
    public void setData(String data) {
        this.data = data;
    }

    /*To string method to return the data of node */
    public String toString() {
        return " Name : "+this.data;
    }

}
