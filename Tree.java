/**
 * Created by Kevin Brown on 4/29/2017.
 */
import java.util.Scanner;
public class Tree {

    private static Node root;
    private static int size;

    public Tree() {
        root = null;
        size =0;
    }

    public Node getRoot(){
        return root;
    }

    /*public static Node search(String find){
        System.out.println("found");
        return node;
    }*/


    //Method to delete a Node from a tree
    public static void delete(){
        System.out.println("deleted");
    }
    //Turn a string into a node, if node is not on the list ask for another input
    public static Node sToNode(String find) {
        Scanner keyboard = new Scanner(System.in);
        Node temp = root;
        Node lTemp = temp.getLeft();
        Node rTemp = temp.getRight();
        String next;

        try {
            while (temp != null) {
                if (find.toUpperCase().compareTo(temp.getData()) == 0) {
                    return temp;
                } else {
                    temp = lTemp;
                    lTemp = lTemp.getLeft();
                }
            }
            //If user inputs a value not on the list then catch the error and prompt them again
            return null;
        } catch (Exception e) {
            System.out.println("That node is not on the list, try again:");
            next = keyboard.nextLine();
        }
        return sToNode(next.toUpperCase());
    }

    //Method to insert into a tree

    public static void insert(Node temp, String data)
    {
        Node newNode = new Node(data, null, null);
        if (temp == null) {
            temp = newNode;
            return;
        }
        if (data.compareTo(temp.getData()) <=0) {
            if (temp.getLeft() != null) {
                insert(temp.getLeft(), data);
            } else {
                temp.setLeft(newNode);
            }
        } else if (data.compareTo(temp.getData()) >0) {
            if (temp.getRight() != null) {
                insert(temp.getRight(), data);
            } else {
                temp.setRight(newNode);
            }
        }
        size++;
    }

    //method to print the tree from left to right
    public void print(){
            print(root);
        }
        private void print(Node r)
        {
            if(r != null){
                print(r.getLeft());
                System.out.print(r.getData());
                print(r.getRight());
            }
        }

    //Method to return size of list
    public int getSize(){
        return size;
    }

}
