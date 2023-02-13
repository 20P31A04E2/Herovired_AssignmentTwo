import java.util.Scanner;
public class assignTwoTaskOne
{
    public static void main(String[] args)
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: "); 
        int n = sc.nextInt(); 
        int arrNum[] = new int[n];
        System.out.println("Enter the elements of the array: "); 
        for (int i=0;i<n;i++) 
        { 
            arrNum[i] = sc.nextInt(); 
        } 
        for (int i=1;i<n;i++) 
        { 
            arrNum[i] = arrNum[i]+arrNum[i-1]; 
        } 
        for (int i=0;i<n;i++) 
        { 
            System.out.print(arrNum[i]+ " ");
        } 
        sc.close(); 
    }  
}
