/*
 * pada file ini terapat class NewBuku yang berisi variabel constructor dari
 * data buku yang telah diinisialisasi sebelumnya pada file Buku.java
 */

//file berada pada package RevisiJurnal
package RevisiJurnal;

//membuat class NewBuku dengan extend dari class Buku
public class NewBuku extends Buku {
    //membuat variabel constructor NewBuku dengan parameter data dari class Buku
    public NewBuku(String judul, String penulis, String bahasa, int hlm, double rating, String kategori) {
        /*
         * terdapat variabel yang menunjuk pada masing-masing objek, dimulai dari judul,
         * penulis, bahasa, halaman, rating, dan kategori dari buku.
         */
        this.judul = judul;
        this.penulis = penulis;
        this.bahasa = bahasa;
        this.hlm = hlm;
        this.rating = rating;
        this.kategori = kategori;
    }
}
