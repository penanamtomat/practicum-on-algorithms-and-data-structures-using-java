/*
 * pada file ini terdapat class main yang digunakan untuk merepresentasikan
 * simpul dan node dalam tree
 */

//file berada di package soalno2
package soalno2;

//membuat class Node2
public class Node2 {
    // Variabel nama menyimpan informasi nama simpul.
    String nama;
    // Variabel list adalah objek dari kelas List (Linked List) yang digunakan untuk menyimpan data terkait node.
    LL list;

    // Variabel left, right, dan parent adalah pointer ke simpul kiri, kanan, dan induk dalam struktur tree.
    Node2 left, right, parent;

    // membuat constructor Node digunakan untuk membuat objek Node dengan nama dan objek LL yang diberikan.
    public Node2 (String nama, LL list){
        this.nama = nama;
        this.list = list;
    }
}