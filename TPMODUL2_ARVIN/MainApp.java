public class MainApp {
    public static void main(String[] args) throws Exception {
        
        Perangkat p = new Perangkat("Kingston",16, 3.4f);
        p.informasi();
        System.out.println();

        Laptop l = new Laptop("Sandisk",16,2.4f,true);

        l.informasi();
        l.bukaGame("NBA 2K22");
        l.kirimEmail("arvinz4real");
        l.kirimEmail("arvinz4real","arvinznotreal");   
        System.out.println();

        Handphone h = new Handphone("Sandisk Ultra",3, 1.8f, true);

        h.informasi();
        h.telfon(62813456);
        h.kirimSMS(6234598);
        h.kirimSMS(623804956,62894921);
        System.out.println();




    }





}
