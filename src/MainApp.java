public class MainApp {
    public static void main(String[] args) throws Exception {
        
        TransportasiAir transportasiair = new TransportasiAir(20,50000);

    transportasiair.informasi();
    transportasiair.berlayar();
    transportasiair.berlabuh();
    System.out.println("");


    Sampan sampan = new Sampan(10,20000,2);

    sampan.informasi();
    sampan.berlayar();
    sampan.berlabuh();
    sampan.berlabuh(5)
    System.out.println("");


    Kapal kapal = new Kapal(100,70000, solar);
    kapal.informasi();
    kapal.berlayar();
    kapal.berlayar(50);
    kapal.berlabuh();




    }
}


//super itu untuk apa? 
