public class Laptop extends Perangkat{
    protected boolean webcam;

    public Laptop(String drive,int ram, float processor, boolean webcam){
        super(drive, ram, processor);
        this.webcam = webcam;
    }

    @Override

    public void informasi(){
        if(this.webcam == true){
            System.out.printf("Laptop ini memiliki drive tipe %s dengan ram sebesar %d GB dan processor secepat %.2f Ghz. Selain itu, laptop ini juga memiliki Webcam",drive,ram,processor);
        }else{
            System.out.printf("Laptop ini memiliki drive tipe %s dengan ram sebesar %d GB dan processor secepat %.$.2f Ghz. Selain itu, laptop tidak memiliki Webcam",drive,ram,processor);
        }

    }
    public void bukaGame(String nama_game){
        System.out.printf("Laptop berhasil membuka game %s %n",nama_game);

    }
    public void kirimEmail(String email){
        System.out.printf("Laptop berhasil mengirim email ke %s %n",email);
    }

    public void kirimEmail(String email1,String email2){
        System.out.printf("Laptop berhasil mengirim email ke %s dan %s %n",email1,email2);

    }





    
}
