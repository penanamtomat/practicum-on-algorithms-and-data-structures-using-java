/*
 * pada file ini terdapat class nodeList yang digunakan untuk merepresentasikan
 * node (node) dalam linked list dan method yang digunakan untuk menghubungkan
 * list dengan list
 */

//file berada di package soalno1
package soalno1;

//membuat class nodeList
public class nodeList {
    //inisialisasi variabel nama menyimpan informasi nama node
    String nama;
    //inisialisasi variabel bobot menyimpan informasi bobot
    int bobot;
    //inisialisasi variabel next dan prev adalah pointer ke node berikutnya dan sebelumnya dalam linked list.
    nodeList next, prev;

    //membuat constructor NodeList digunakan untuk membuat objek NodeList dengan nama dan bobot yang diberikan.
    public nodeList(String nama, int bobot) {
        //inisialisasi objek
        this.nama = nama;
        this.bobot = bobot;
        this.next = this.prev = null;
    }

    //method getNext yang digunakan untuk mencari atau mendapatkan node berikutnya
    public nodeList getNext() {
        return next;
    }

    //method setNext yang digunakan untuk mengatur node berikutnya
    public void setNext(nodeList next) {
        this.next = next;
    }

    //method getPrev yang digunakan untuk mencari atau mendapatkan node sebelumnya dalam linked list.
    public nodeList getPrev() {
        return prev;
    }

    // Metode setPrev yang digunakan untuk mengatur node sebelumnya dalam linked list.
    public void setPrev(nodeList prev) {
        this.prev = prev;
    }
}