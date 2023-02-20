import java.util.Scanner; 
import java.util.HashSet; 
public class assignTwoTaskThree
{ 
    static class Node
    { 
        int data; 
        Node next; 
        Node(int data)
        { 
            this.data = data; 
            next = null; 
        } 
    } 
    public static void display(Node N1)
    { 
        Node n = N1; 
        while (n.next != null) 
        { 
            System.out.print(n.data + " -> "); 
            n = n.next; 
        } 
        System.out.println(n.data); 
    } 
    public static void main(String args[])
    { 
        Scanner sc = new Scanner(System.in); 
        HashSet<Integer> hs = new HashSet<>();
        System.out.println("Enter the number of elements you want: "); 
        int num = sc.nextInt(); 
        Node N1 = null;
        System.out.println("Enter "+num+" elements"); 
        for (int i = 0; i < num; i++)
        { 
            int value = sc.nextInt(); 
            Node newnode = new Node(value); 
            if (N1 == null)
            { 
                N1 = newnode; 
            }
            else 
            { 
                Node n = N1; 
                while (n.next != null)
                { 
                    n = n.next; 
                } 
                n.next = newnode; 
            } 
        } 
        Node start = null; 
        Node n = N1; 
        while (n != null) 
        { 
            int value = n.data; 
            if (hs.contains(value) == false) 
            { 
                hs.add(value); 
                Node newnode = new Node(value); 
                if (start == null)
                { 
                    start = newnode; 
                }
                else
                { 
                    Node traverse = start; 
                    while (traverse.next != null)
                    { 
                        traverse = traverse.next; 
                    } 
                    traverse.next = newnode; 
                } 
            } 
            n = n.next; 
        } 
        System.out.println("The Elements after Removing Duplicates : "); 
        display(start); 
        sc.close(); 
    } 
}