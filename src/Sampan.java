Public class Sampan{
    protected int layar;

    public Sampan(int jumlahKursi, int biaya, int layar){
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
        this.layar = layar;
    }

    public void informasi(){
        System.out.println("Transportasi Air jenis Sampan dengan kursi sejumlah"+jumlahKursi+"ditetapkan dengan biaya sebesar Rp."+biaya);
    }
    public void berlayar(){
        System.out.println("Transportasi Air jenis Sampan sedang berlayar menggunakan "+layar+"layar");
    }
    public void berlabuh(){
        System.out.println("Transportasi Air jenis Sampan sedang berlabuh di pantai tanpa jangkar");
    }
    public void berlabuh(int jangkar){
        System.out.println("Transportasi Air jenis Sampan sedang berlabuh di pantai menggunakan "+jangkar+"jangkar");
    }

}