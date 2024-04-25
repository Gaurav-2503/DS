import java.util.Scanner;

public class Tring {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes : ");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.print(" "+i);
        }
        System.out.println(" 0");

        int ch =0;
        do{
            System.out.print("Enter the sender : ");
            int sender = sc.nextInt();

            System.out.print("Enter the receiver : ");
            int receiver = sc.nextInt();

            System.out.print("Enter the data : ");
            int data = sc.nextInt();

            int token = 0;
            System.out.println("Token Passing");
            for(int i=token;(i%n)!=sender;i++){
                System.out.print(" " + i + "->");
            }
            System.out.print(" "+sender);

            System.out.println("Sender : "+sender+" sending data : "+data);
            for(int i=sender;(i%n)!=receiver;i++){
                System.out.println("Data "+data+" forwarded by "+i);                
            }
            System.out.println("Receiver "+receiver+" received data "+data);
            token = sender;

            System.out.println("Do you want to continue, enter 0 for yes and 1 for no ");
            ch = sc.nextInt();
        }
        while(ch!=1);
    }
}