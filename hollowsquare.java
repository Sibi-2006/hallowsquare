import java.util.Scanner;

public class hollowsquare {
    public static void main(String[] args) {
        int i,j,n;
        Scanner sc =new Scanner(System.in);
        System.out.print("enter a num :");
        n= sc.nextInt();

        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if (i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
