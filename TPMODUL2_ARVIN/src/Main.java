import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Restaurant restaurants = new Restaurant();
        int customerID;
        int orderQty;
        try{
            System.out.print("Masukkan customer ID : ");
            customerID = input.nextInt();
            
            System.out.print("Masukkan berapa jumlah makanan yang ingin dibuat : ");
            orderQty = input.nextInt();

            Thread t1 = new Thread(restaurants);
            Waiters waiters = new Waiters (customerID,orderQty);
            Thread t2 = new Thread(waiters);

            t1.start();
            t2.start();
            t1.join();
            t2.join();
        }catch (Exception e){
            System.out.println("Input harus berbentuk integer");
        }


    }
}
