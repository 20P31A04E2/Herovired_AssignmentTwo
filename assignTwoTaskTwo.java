import java.util.*; 
public class assignTwoTaskTwo
{ 
    static class Node
    { 
        int data; 
        Node next; 
        public Node(int data)
        { 
            this.data = data; 
            next = null; 
        } 
    } 
    public static final Scanner sc = new Scanner(System.in); 
    public static Node merge(Node N1, Node N2)
    { 
        Node n = N1; 
        while (n.next != null)
        { 
            n = n.next; 
        } 
        n.next = N2; 
        return N1; 
    } 
    public static Node sortList(Node head)
    { 
        Node n = head; 
        ArrayList<Integer> arrList = new ArrayList<>(); 
        while (n != null)
        { 
            arrList.add(n.data); 
            n = n.next; 
        } 
        Collections.sort(arrList); 
        Node newnode = new Node(arrList.get(0)); 
        head = newnode; 
        n = head; 
        for (int i = 1; i < arrList.size(); i++)
        { 
            newnode = new Node(arrList.get(i)); 
            n.next = newnode; 
            n = n.next; 
        } 
        return head; 
    } 
    public static void display(Node head)
    { 
        Node n = head; 
        while (n.next != null) 
        { 
            System.out.print(n.data + " -> "); 
            n = n.next; 
        } 
        System.out.println(n.data); 
    } 
    public static void main(String[] args) 
    { 
        System.out.println("Enter List One size: "); 
        int ListOne = sc.nextInt(); 
        Node headListOne = null; 
        System.out.println("Enter List One elements: "); 
        for (int i = 0; i < ListOne; i++) 
        { 
            int value = sc.nextInt(); 
            Node newnode = new Node(value); 
            if (headListOne == null) 
            { 
                headListOne = newnode; 
            }
            else 
            { 
                Node n = headListOne; 
                while (n.next != null)
                { 
                    n = n.next; 
                } 
               n.next = newnode; 
            } 
        } 
        System.out.println("Enter List Two size: "); 
        int  ListTwo= sc.nextInt(); 
        Node headListTwo = null; 
        System.out.println("Enter List Two elements: "); 
        for (int i = 0; i < ListTwo; i++)
        { 
            int val = sc.nextInt(); 
            Node newnode = new Node(val); 
            if (headListTwo == null) 
            { 
                headListTwo = newnode; 
            } 
            else 
            { 
                Node n = headListTwo; 
                while (n.next != null) 
                { 
                    n = n.next; 
                } 
                n.next = newnode; 
            } 
        }  
        Node head = merge(headListOne, headListTwo);  
        head = sortList(head); 
        System.out.println("Elements after Sorting: "); 
        display(head); 
     } 
} 

