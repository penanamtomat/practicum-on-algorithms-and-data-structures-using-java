/*
 * pada file ini terdapat class linkedList yang digunakan untuk merepresentasikan
 * linked list dan berisi method untuk menambahkan list node ke dalam struktur data
 */

//file berada di package soalno1
package soalno1;

//membuat class linkedList
public class linkedList {
    //inisialisasi variabel head dan tail adalah pointer ke node pertama (head) dan terakhir (tail) dalam linked list.
    nodeList head, tail;
    //method add digunakan untuk menambahkan node baru ke linked list sesuai dengan contsructor dari class nodeList.
    public void add(String nama, int bobot) {
        //inisialisasi node baru.
        nodeList newNode = new nodeList(nama, bobot);
        //lakukan pengecekan, jika linked list masih kosong
        if (head == null) {
            //maka node baru menjadi head dan tail
            head = tail = newNode;
        } else {
            //jika tidak, tambahkan node baru ke ujung (tail) linked list.
            tail.next = newNode;
            tail = newNode;
        }
    }
}