/*
 * pada file ini terdapat class Node yang berfungsi untuk inisialisasi
 * node pada list data
 */

 //file berada di dalalm package bubbleSort
package bubbleSort;

//membuat class node
public class Node {
    /*di dalam class terdapat inisialisasi variabel dan constructor*/

    //variabel nama dengan tipe data String
    String nama;
    //variabel stok dengan tipe data int
    int stok;
    //variabel harga dengan tipe data int
    int harga;
    //variabel next dengan tipe data Node
    Node next;
    //variabel prev dengan tipe data Node
    Node prev;

    //membuat constructor dengan parameter nama, stok dan harga
    public Node(String nama, int stok, int harga) {
        /*mengatur variabel dengan parameter yang disediakan*/
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
        this.next = null;
        this.prev = null;
    }
}