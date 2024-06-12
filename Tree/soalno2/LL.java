/*
 * pada file ini terdapat class LL yang digunakan digunakan untuk
 * merepresentasikan struktur data linked list
 */

//file berada di package soalno2
package soalno2;

//membuat class LL
public class LL {
    //inisialisasi variabel head dan tail adalah pointer ke node pertama (head) dan terakhir (tail) dalam linked list.
    nodeList2 head, tail;
    // method add(String nama, int bobot) digunakan untuk menambahkan node baru ke linked list dengan nama dan bobot yang diberikan.
    public void add(String nama, int bobot) {
        // membuat node baru.
        nodeList2 newNode = new nodeList2(nama, bobot);
        // Jika linked list masih kosong, maka node baru menjadi head dan tail.
        if (head == null) {
            head = tail = newNode;
        } else {
            // Jika linked list tidak kosong, tambahkan node baru ke ujung (tail) linked list.
            tail.next = newNode;
            tail = newNode;
        }
    }
}