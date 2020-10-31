import java.util.*;

public class Fibanocci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Scanner for taking inputs from the keyboard
        System.out.println("Enter a Number: ");
        int n,sum=0,first=0,second=1;
        n = sc.nextInt();
        sc.close();
        System.out.print("First " + n + " terms: ");
        for(int i=1; i<=n; i++)
        {
            System.out.print(first+" ");
            sum=first+second;
            first=second;
            second=sum;    
        }

        
    }
}
//i/p 5
//0/p First 5 terms 0+1+1+2+3
