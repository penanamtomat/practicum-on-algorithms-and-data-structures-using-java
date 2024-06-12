/*
 * pada file ini terapat class nodeRak yang digunakan untuk menginisialisasi
 * variabel linkedlist untuk buku dan nama untuk kategori rak buku
 */

//file berada pada package RevisiJurnal
package RevisiJurnal;

//membuat class nodeRak
public class nodeRak {
    /*
     * di dalam class, terdapat variabel listBuku buku. Variabel ini merupakan variabel yang
     * menginisialisasi objek listBuku yang akan digunakan pada linked list sehingga seluruh
     * data pada list buku dapat diakses dengan memberikan link langsung ke dalam objek rak
     */
    listBuku buku;

    /*
     * selain itu terdapat variabel nodeRak next dan prev. Variabel ini digunakan untuk
     * inisialisasi nilai next dan previous dalam menjalankan node
     */
    nodeRak next, prev;

    /*
     * terakhir ada variabel kategoriRak dengan tipe data String. variabel ini digunakan
     * untuk inisialisasi objek yang disimpan yaitu nama rak buku berdasarkan kategorinya
     */
    String kategoriRak;

    /*
     * membuat constructor dengan parameter kategoriRak dan buku yang menandakan bahwa
     * variabel kategoriRak dan buku harus diisi dengan data yang sesuai
     */
    public nodeRak(String kategoriRak, listBuku buku) {
        /*
         * terdapat variabel yang menunjuk pada masing-masing objek kecuali next dan prev.
         * hal ini dikarenakan nilai awal dari untuk node previous dan next haruslah null
         */
        this.kategoriRak = kategoriRak;
        this.buku = buku;
        this.next = null;
        this.prev = null;
    }
}
