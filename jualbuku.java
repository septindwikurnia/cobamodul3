class buku{
    public String kode;
    public int hari;
    public double harga;

    public buku(String kode, int hari, double harga){
        this.kode = kode;
        this.hari = hari;
        this.harga = harga;
    }

    public void tampil(){
        System.out.println("Kode Buku: " + kode);
        System.out.println("Pinjam berapa hari: " + hari);
        System.out.println("Harga(/hari): " + harga);
        System.out.println("Total Pembayaran: " + hari*harga);
    }
}

public class jualbuku {
    public static void main(String[] args) {
        buku obj = new buku("A01", 2,5000);
        obj.tampil();
    }
}