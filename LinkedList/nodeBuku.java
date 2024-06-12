/*
 * pada file ini terapat class nodeBuku yang digunakan untuk menginisialisasi
 * tiap elemen buku
 */

//file berada pada package RevisiJurnal
package RevisiJurnal;

//membuat class nodeBuku
public class nodeBuku {
    /*
     * di dalam class, terdapat variabel Buku newBook. Variabel ini merupakan variabel yang
     * mengarah ke constructor Buku yang akan digunakan pada linked list sehingga seluruh
     * data pada variabel buku disimpan dalam newBook
     */
    Buku newBook;

    /*
     * selain itu terdapat variabel nodeBuku next dan prev. Variabel ini digunakan untuk
     * inisialisasi nilai next dan previous dalam menjalankan node
     */
    nodeBuku next, prev;

    /*
     * membuat constructor dengan parameter newBook yang menandakan bahwa
     * variabel tersebut harus diisi dengan data yang sesuai
     */
    public nodeBuku(Buku newBook) {
        /*
         * terdapat variabel yang menunjuk pada masing-masing objek kecuali next dan prev.
         * hal ini dikarenakan nilai awal dari untuk node previous dan next haruslah null
         */
        this.newBook = newBook;
        this.next = null;
        this.prev = null;
    }
}