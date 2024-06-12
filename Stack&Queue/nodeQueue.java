/*
 * pada file ini, dibuat class nodeQueue yang digunakan untuk
 * menyimpan node/data dari queue
 */

//file berada di package JurnalNo2
package JurnalNo2;

//membuat class nodeQueue
public class nodeQueue {
    /*inisialisasi variabel namaAntrian dengan tipe data String. variabel
    ini digunakan untuk menyimpan nama dari antrian restoran*/
    String namaAntrian;

    /* inisialisasi variabel daftarPesanan dengan tipe data Pesanan.
    fungsinya untuk menyimpan pesanan yang ada di antrian*/
    Pesanan daftarPesanan;

    /* inisialisasi variabel rear(belakang) untuk nodeQueue, fungsinya
    untuk mengarahkan node antrian ke berada di paling belakang*/
    nodeQueue rear;

    /*membuat constructor nodeQueue dengan parameter dari variabel namaAntrian dan
    daftarPesanan*/
    public nodeQueue(String namaAntrian, Pesanan daftarPesanan) {
       /*terdapat variabel constructor dengan inisialisasi nilai namaAntrian */
        this.namaAntrian = namaAntrian;
        /*terdapat variabel constructor dengan inisialisasi nilai daftarPesanan */
        this.daftarPesanan = daftarPesanan;
        /*terdapat variabel constructor dengan inisialisasi nilai rear = null */
        this.rear = null;
    }
}