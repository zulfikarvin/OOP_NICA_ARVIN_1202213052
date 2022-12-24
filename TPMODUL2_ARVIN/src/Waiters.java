public class Waiters implements Runnable{

    private final int orderQty;
    private final int customerID;
    static int foodPrice = 2500;

    public Waiters(int customerID,int orderQty){
        this.customerID = customerID;
        this.orderQty = orderQty;
    }

    @Override
    public void run(){
        while(true){
            getFood();
            try{
                Thread.sleep(20000);

            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public void ordeInfo(){

    }
public void orderInfo() {
        System.out.println("==========================================================");
        System.out.println("Customer ID: " + this.customerID);
        System.out.println("Numbeer of Coffee: " + this.orderQty);
        System.out.println("Total Price: " + this.orderQty * foodPrice);
        
    }

public void getFood(){
    synchronized(Restaurant.getLock()){
        System.out.println("Pelayan : Makanan siap untuk diantarkan");
        Restaurant restaurant = new Restaurant();
        restaurant.setWaitingForPickup(false);

        if(Restaurant.getFoodNumber()== this.orderQty +1){
            orderInfo();
            System.exit(0);
        }
        Restaurant.getLock().notifyAll();
        System.out.println("Pelayan : beritahu restoran untuk membuat makanan lain");
    }
}
    
}
