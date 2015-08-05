import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by ronakvimadalal on 19/07/15.
 */
public class Stack1 {
    LinkedList<String> ll;

    Stack1()
    {
        ll= new LinkedList<String>();
        System.out.println(ll);
    }
    void push(String item)
    {
        ll.push(item);
    }
    String pop()
    {
       return ll.pop();
    }
    public static void main(String args[])
    {

        Stack1 stack1=new Stack1();
        Scanner scanner=new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter 1 to push 2 to pop 3 to print an exit");
            int a = scanner.nextInt();
            scanner.nextLine();
            switch (a){
                case 1:
                    System.out.println("Enter string to add");
                    String b = scanner.nextLine();
                    stack1.ll.push(b);
                    break;
                case 2:
                    stack1.ll.pop();
                    break;
                case 3:
                    System.out.println(stack1.ll);
                    break;
                default:continue;

            }

        }


    }

}
