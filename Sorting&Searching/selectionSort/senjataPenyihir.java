/*
 * pada file ini terdapat class list untuk mengatur senjata penyihir
 * dan method untuk mengurutkan senjata dengan algoritma selection sort
 */

//file berada di dalam package selectionSort
package selectionSort;
//mengimport java.util.random untuk mengacak string ID
import java.util.Random;

public class senjataPenyihir {
    /*inisialisasi head dan tail dengan variabel Node
     * tujuannya adalah untuk mengatur posisi head dan tail
     * pada list
     */
    Node head, tail;

    //membuat constructor untuk head dan tail
    public senjataPenyihir() {
        head = null;
        tail = null;
    }

    //membuat fungsi untuk menghasilkan value ID yang berbeda
    public String generateRandomId() {
        // Membuat objek Random untuk menghasilkan nilai acak
        Random random = new Random();
        // String yang berisi karakter alfabet dan angka yang mungkin
        String alphabet = "abcdefghijklmnopqrstuvwxyz0123456789";
        // StringBuilder untuk menyusun ID acak, dimulai dengan awalan "Node@"
        StringBuilder randomId = new StringBuilder("Node@");
        // Loop sebanyak 8 kali untuk menambahkan karakter acak ke ID
        for (int i = 0; i < 8; i++) {
            // Menghasilkan indeks acak dari string alphabet
            int index = random.nextInt(alphabet.length());
            // Menambahkan karakter acak ke StringBuilder
            randomId.append(alphabet.charAt(index));
        }
        // Mengembalikan ID acak sebagai String
        return randomId.toString();
    }

    /*
     * method add digunakan untuk menambahkan data baru
     * pada list dengan parameter nama, stok dan harga
     */
    public void add(String nama, int stok) {
        String id = generateRandomId();
        /*di dalam method, variabel newNode dibuat untuk objek dengan
        parameter yang disediakan*/
        Node newNode = new Node(id, nama, stok);

        //jika head di dalam list bernilai null
        if (head == null) {
            //maka head dan tail diatur ke data yang baru
            head = tail = newNode;
        } else {
            /*jika tidak, maka data yang baru akan ditambahkan
            pada tail*/
            tail.next = newNode;
            //data sebelumnya diposisikan pada posisi tail
            newNode.prev = tail;
            //data yang baru dimasukkan diperbarui dengan data yang baru
            tail = newNode;
        }
    }

    //membuat fungsi swapNode untuk memindahkan node ke posisi saling terkait
    public void swapNode(Node x, Node y) {
        // Jika x dan y sama, langsung kembalikan
        if (x == y) {
            return;
        }

        // Memindahkan node y sebelum node x
        if (x.prev == y) {
            x.prev = y.prev;
            y.prev = x;
            y.next = x.next;
            x.next = y;
        } else if (y.prev == x) {
            // Memindahkan node x sebelum node y
            y.prev = x.prev;
            x.prev = y;
            x.next = y.next;
            y.next = x;
        } else {
            // Node tidak bersebelahan
            Node tempPrev = x.prev;
            Node tempNext = x.next;

            x.prev = y.prev;
            x.next = y.next;
            y.prev = tempPrev;
            y.next = tempNext;
        }

        // Memperbarui link menuju node selanjutnya
        if (x.prev != null) {
            x.prev.next = x;
        } else {
            head = x;
        }

        if (y.prev != null) {
            y.prev.next = y;
        } else {
            head = y;
        }

        if (x.next != null) {
            x.next.prev = x;
        }

        if (y.next != null) {
            y.next.prev = y;
        }
    }

    /*Cuplikan kode ini mengimplementasikan algoritma selection sort
    secara descending untuk mengurutkan daftar di dalam node*/
    public void selectionSortDescending() {
        //inisialisasi variabel current sama dengan head dengan tipe data Node
        Node current = head;
        //lakukan perulangan untuk mengecek semua node
        while (current != null) {
            //mengatur nilai maks dengan variabel current
            Node maxNode = current;
            //membuat variabel bantu temp untuk menyimpan sementara node
            Node temp = current.next;

            // Mencari node dengan nilai stok tertinggi
            //dengan kondisi variabel bantu tidak null
            while (temp != null) {
                //lakukan pengecekan nilai stok, jika stok sebelumnya
                //lebih besar dari setelahnya
                if (temp.stok > maxNode.stok) {
                    //maka nilai maks tadi diisi dengan variabel bantu
                    maxNode = temp;
                }
                //menggeser nilai dari variabel bantu
                temp = temp.next;
            }

            // Menukar posisi current dengan maxNode
            if (maxNode != current) {
                swapNode(current, maxNode);
                // Menyesuaikan posisi current setelah pertukaran
                if (current.prev == maxNode) {
                    current = maxNode.next;
                } else {
                    current = maxNode;
                }
            } else {
                current = current.next;
            }
        }
    }

    //method print untuk menampilkan semua data
    public void print() {
        //inisialisasi variabel current sama dengan head
        Node current = head;
        //jika current bernilai null
        if(current == null) {
            //maka menampilkan pesan data yang kosong
            System.out.println("Tidak Ada Senjata");
            //mengembalikan nilai
            return;
        }
        
        //melakukan perulangan while
        //dengan kondisi current tidak null
        while (current != null) {
            //menampilkan data id dengan menampilkan alamat memori current
            System.out.println("id = " + current.id);
            //menampilkan data nama senjata
            System.out.println("Nama = " + current.nama);
            //menampilkan data stok
            System.out.println("Stok = " + current.stok);
            //memberikan celah spasi antar data
            System.out.println();
            //data saat ini ditunjuk menuju list selanjutnya selama melakukan perulangan
            //sampai data habis
            current = current.next;
        }
    }

    //class main untuk menjalankan method di atas
    public static void main(String[] args) {
        //inisialisasi objek senjataPenyihir
        senjataPenyihir list = new senjataPenyihir();
        
        //proses menambahkan data pada node list dengan value data senjata
        //dengan parameter nama, stok, dan harga
        list.add("Enchanted Talisman", 9);
        list.add("Divine Glaive", 11);
        list.add("Winter Truncheon", 14);
        list.add("Feather of Heaven", 1);
        list.add("Holy Crystal", 0);
        list.add("Genius Wand", 6);
        list.add("Necklace of Durance", 10);
        list.add("Concentrated Energy", 12);
        list.add("Ice Queen Wand", 18);
        list.add("Glowing Wand", 16);
        list.add("Calamity Reaper", 15);
        list.add("Clock of Destiny", 19);
        list.add("Blood Wings", 20);
        list.add("Fleeting Time", 21);
        list.add("Lightning Turncheon", 17);

        //melakukan proses print sebelum data disorting
        System.out.println("Sebelum Sorting");
        //garis pembatas
        System.out.println("===============");
        //memanggil method print untuk menampilkan data sebelum disortir
        list.print();
        
        //memberikan jarak
        System.out.println();

        //melakukan proses sorting pada data yang telah ditambahkan
        list.selectionSortDescending();

        //melakukan proses print setelah data disorting
        System.out.println("Setelah Sorting");
        //garis pembatas
        System.out.println("===============");
        //memanggil method print untuk menampilkan data setelah disortir
        list.print();
    }
}
