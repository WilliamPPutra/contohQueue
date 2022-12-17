public class Main {

    public static void main(String[] args){
        Antrian antrian = new Antrian(10);
        antrian.masuk(13);
        antrian.lihat();
        antrian.masuk(32);
        antrian.lihat();
        antrian.masuk(45);
        antrian.lihat();
        System.out.println("yang diambil dari antrian = " + antrian.keluar());
        antrian.lihat();
        System.out.println("yang diambil dari antrian = " + antrian.keluar());
        antrian.lihat();
    }
}