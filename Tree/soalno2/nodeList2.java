/*
 * pada file ini terdapat class nodeList yang digunakan untuk merepresentasikan
 * node (node) dalam linked list dan method yang digunakan untuk menghubungkan
 * list dengan list
 */

//file berada di package soalno2
package soalno2;

//membuat class nodeList
public class nodeList2 {
    // Variabel nama menyimpan informasi nama node.
    String nama;
    // Variabel bobot menyimpan informasi bobot yang terkait dengan node ini.
    int bobot;
    // Variabel next dan prev adalah pointer ke node berikutnya dan sebelumnya dalam linked list.
    nodeList2 next, prev;

    // Konstruktor NodeLL digunakan untuk membuat objek NodeLL dengan nama dan bobot yang diberikan.
    public nodeList2(String nama, int bobot) {
        this.nama = nama;
        this.bobot = bobot;
        // Inisialisasi pointer next dan prev ke null.
        this.next = this.prev = null;
    }

    // Metode getNext() digunakan untuk mencari atau mendapatkan node berikutnya dalam linked list.
    public nodeList2 getNext() {
        return next;
    }

    // Metode setNext(NodeLL next) digunakan untuk mengatur node berikutnya dalam linked list.
    public void setNext(nodeList2 next) {
        this.next = next;
    }

    // Metode getPrev() digunakan untuk mencari atau mendapatkan node sebelumnya dalam linked list.
    public nodeList2 getPrev() {
        return prev;
    }

    // Metode setPrev(NodeLL prev) digunakan untuk mengatur node sebelumnya dalam linked list.
    public void setPrev(nodeList2 prev) {
        this.prev = prev;
    }
}