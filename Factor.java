import java.util.*;

public class Factor{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); //Scanner for taking inputs from the keyboard
    System.out.println("Enter a value for N: ");
    int n;
    n = sc.nextInt();
    sc.close();
    System.out.print("Factors are :-");
    for(int i=1; i<=n; i++)
    {
        if(n%i==0)
            System.out.print(i+" ");
    }

    
}
}
// i/p 10
//o/p Factors are 1 2 5
