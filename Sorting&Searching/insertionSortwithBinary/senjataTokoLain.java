/*
 * pada file ini terdapat class list untuk mengatur senjata penyihir
 * dan method untuk mengurutkan senjata dengan algoritma insertion sort
 * serta method untuk mencari senjata berdasarkan stok dengan algoritma
 * binary search
 */

 //file berada di dalam package insertionSortwithBinary
package insertionSortwithBinary;
//mengimport java.util.random untuk mengacak string ID
import java.util.Random;

//membuat class list senjataTokoLain
public class senjataTokoLain {
    /*inisialisasi head dan tail dengan variabel Node
     * tujuannya adalah untuk mengatur posisi head dan tail
     * pada list
     */
    Node head, tail;

    //membuat constructor untuk head dan tail
    public senjataTokoLain() {
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
    public void add(String nama, int stok, int harga) {
        //membuat variabel id untuk menghasilkan ID baru
        String id = generateRandomId();
        /*di dalam method, variabel newNode dibuat untuk objek dengan
        parameter yang disediakan*/
        Node newNode = new Node(id, nama, stok, harga);

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

    // Method untuk memasukkan node ke dalam data yang sudah terurut
    private Node insert(Node sorted, Node newNode) {
        // Jika data kosong atau node baru memiliki harga lebih besar dari atau sama dengan sorted, letakkan node baru di depan sorted
        if (sorted == null || sorted.harga <= newNode.harga) {
            newNode.next = sorted;
            newNode.prev = null;

            // Jika sorted bukan null, atur prev dari sorted menjadi newNode
            if (sorted != null) {
                sorted.prev = newNode;
            }

            // Kembalikan newNode sebagai head dari data yang sudah diurutkan
            return newNode;
        }

        // Inisialisasi node current untuk iterasi melalui data yang sudah diurutkan
        Node current = sorted;

        // Iterasi hingga menemukan posisi yang benar untuk node baru
        while (current.next != null && current.next.harga > newNode.harga) {
            current = current.next;
        }

        // Sisipkan node baru di antara current dan current.next
        newNode.next = current.next;
        newNode.prev = current;

        // Jika current.next tidak null, atur prev dari current.next menjadi newNode
        if (current.next != null) {
            current.next.prev = newNode;
        }

        // Atur next dari current menjadi newNode
        current.next = newNode;

        // Kembalikan head dari data yang sudah diurutkan
        return sorted;
    }

    // Metode untuk mengurutkan data menggunakan algoritma insertion sort
    public void insertionSort() {
        // Cek apakah data kosong atau hanya memiliki satu elemen
        if (head == null || head.next == null) {
            return;
        }
        // Inisialisasi data yang sudah terurut
        Node sorted = null; 
        // Mulai dari awal data
        Node current = head;
        while (current != null) {
            // Simpan node selanjutnya sebelum diubah
            Node next = current.next;   
            // Sisipkan node saat ini ke dalam data yang sudah terurut
            sorted = insert(sorted, current);
            // Pindah ke node selanjutnya dalam iterasi
            current = next;
        }
        // Atur head data ke data yang sudah terurut
        head = sorted;
    }

    // Method untuk melakukan binary search pada data
    private Node binarySearchRecursif(Node startNode, int targetHarga) {
        // Cek apakah startNode null atau merupakan leaf node (tidak memiliki child)
        if (startNode == null || (startNode.prev == null && startNode.next == null)) {
            return null;
        }

        // Ambil nilai harga tengah (midHarga) dari startNode
        int midHarga = startNode.harga;

        // Jika midHarga sama dengan targetHarga, kembalikan startNode
        if (midHarga == targetHarga) {
            return startNode;
        }

        // Jika midHarga lebih besar dari targetHarga, cari di subtree kanan (startNode.next)
        if (midHarga > targetHarga) {
            return binarySearchRecursif(startNode.next, targetHarga);
        }

        // Jika midHarga kurang dari targetHarga, cari di subtree kiri (startNode.prev)
        return binarySearchRecursif(startNode.prev, targetHarga);
    }

    //Method untuk melakukan pencarian biner pada data
    public void binarySearch(int target) {
        // Cek apakah data kosong
        if (head == null) {
            System.out.println("Senjata tidak ditemukan. data kosong.");
            return;
        }

        // Mencari node dengan harga tertentu secara rekursif
        Node result = binarySearchRecursif(head, target);

        // Menampilkan hasil pencarian
        if (result != null) {
            System.out.println("Senjata dengan harga " + target + " ditemukan pada posisi ke - : ");
            // printWeaponDetails(result);
            System.out.println("Terletak setelah");
            // printWeaponDetails(result.prev);
            System.out.println("Terletak sebelum:");
            // printWeaponDetails(result.next);s
        } else {
            System.out.println("Senjata dengan harga " + target + " tidak ditemukan.");
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
            //menampilkan data harga
            System.out.println("Harga = " + current.harga);
            //memberikan celah spasi antar data
            System.out.println();
            //data saat ini ditunjuk menuju list selanjutnya selama melakukan perulangan
            //sampai data habis
            current = current.next;
        }
    }

    //class main untuk menjalankan method di atas
    public static void main(String[] args) {
        //inisialisasi objek senjataTokoLain
        senjataTokoLain list = new senjataTokoLain();
        
        //proses menambahkan data pada node list dengan value data senjata
        //dengan parameter nama, stok, dan harga
        list.add("Enchanted Talisman", 9, 1870);
        list.add("Divine Glaive", 11, 1970);
        list.add("Winter Truncheon", 14, 1910);
        list.add("Feather of Heaven", 14, 2030);
        list.add("Holy Crystal", 0, 2180);
        list.add("Genius Wand", 6, 2000);
        list.add("Necklace of Durance", 10, 2110);
        list.add("Concentrated Energy", 12, 2020);
        list.add("Ice Queen Wand", 18, 2240);
        list.add("Glowing Wand", 16, 2120);
        list.add("Calamity Reaper", 15, 1950);
        list.add("Clock of Destiny", 19, 1950);
        list.add("Blood Wings", 20, 3000);
        list.add("Fleeting Time", 21, 2050);
        list.add("Lightning Turncheon", 17, 2250);

        //melakukan proses print sebelum data disorting
        System.out.println("Sebelum Sorting");
        //garis pembatas
        System.out.println("===============");
        //memanggil method print untuk menampilkan data sebelum disortir
        list.print();
        
        //memberikan jarak
        System.out.println();

        //melakukan proses sorting pada data yang telah ditambahkan
        list.insertionSort();;

        //melakukan proses print setelah data disorting
        System.out.println("Setelah Sorting");
        //garis pembatas
        System.out.println("===============");
        //memanggil method print untuk menampilkan data setelah disortir
        list.print();

        //melakukan proses pencarian dengan algoritma binary search
        list.binarySearch(2020);
    }
}
