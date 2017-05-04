/**
 * Created by Brownie on 5/3/2017.
 */
public class Main {

    public static void main(String[]args){
        Tree test = new Tree();


        test.insert("doug");
        test.insert("a");
        test.insert(test.getRoot(), "Whatever");


        test.print();
    }

}
