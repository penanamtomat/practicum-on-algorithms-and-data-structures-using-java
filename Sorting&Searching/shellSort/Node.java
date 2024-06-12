/*
 * pada file ini terdapat class Node yang berfungsi untuk inisialisasi
 * node pada list data
 */

//file berada di dalam package shellSort
package shellSort;

//membuat class node
public class Node {
    /*di dalam class terdapat inisialisasi variabel dan constructor*/

    //variabel nama dan id dengan tipe data String
    String nama, id;
    //variabel stok dengan tipe data int
    int stok, harga;
    //variabel next dengan tipe data Node
    Node next;
    //variabel prev dengan tipe data Node
    Node prev;

    //membuat constructor dengan parameter id, nama, stok dan harga
    public Node(String id, String nama, int stok, int harga) {
        /*mengatur variabel dengan parameter yang disediakan*/
        this.id = id;
        this.nama = nama;
        this.stok = stok;
        this.next = null;
        this.prev = null;
    }
}
