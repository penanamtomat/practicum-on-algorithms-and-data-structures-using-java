/*
 * pada file ini terdapat class main yang digunakan untuk merepresentasikan
 * simpul dan node dalam tree
 */

//file berada di package soalno1
package soalno1;

//membuat class node
public class Node {
    //inisialisasi variabel nama menyimpan informasi nama simpul.
    String nama;
    /*inisialisasi variabel list dengan tipe data objek dari kelas linkedList 
    yang digunakan untuk menyimpan data terkait node.*/
    linkedList list;

    // inisialisasi variabel left, right, dan parent adalah pointer ke simpul kiri, kanan, dan induk dalam struktur tree.
    Node kiri, kanan, parent;

    // membuat constructor Node digunakan untuk membuat objek Node dengan nama dan objek list yang diberikan.
    public Node (String nama, linkedList list){
        this.nama = nama;
        this.list = list;
    }
}