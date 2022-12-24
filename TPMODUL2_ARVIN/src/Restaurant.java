public class Restaurant implements Runnable {

    private boolean waitingForPickup = false;
    private static final Object lock = new Object();
    private static int foodNumber = 1;

    @Override
    public void run() {
        while(true){
            makeFood();
            try {
                Thread.sleep(30000);
            }catch(InterruptedException e ){
                e.printStackTrace();
            }
        }

    }
    public void setWaitingForPickup(boolean waitingForPickup){
        this.waitingForPickup = waitingForPickup;
    }
    public static int getFoodNumber(){
        return foodNumber;
    }
    public static Object getLock(){
        return lock;
    }
    public void makeFood(){
        synchronized(Restaurant.lock){
            if(this.waitingForPickup){
                try{
                    System.out.println("Menunggu pelayanan untuk mengantarkan makanan");
                    Restaurant.lock.wait();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }

            waitingForPickup = true;
            System.out.println("Restoran : Membuat makanan nomor "+foodNumber++);
            Restaurant.lock.notifyAll();
            System.out.println("Memberi tahu pelayan untuk mengantarkan makanan \n");

        }
    }





}