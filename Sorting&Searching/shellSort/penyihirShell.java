/*
 * pada file ini terdapat class list untuk mengatur senjata penyihir
 * dan method untuk mengurutkan senjata dengan algoritma shell sort
 */

//file berada di dalam package shellSort
package shellSort;

import java.util.Random;

public class penyihirShell {
     /*inisialisasi head dan tail dengan variabel Node
     * tujuannya adalah untuk mengatur posisi head dan tail
     * pada list
     */
    Node head, tail;

    //membuat constructor untuk head dan tail
    public penyihirShell() {
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

    // Metode untuk mendapatkan jumlah node dalam linked list
    private int getCount() {
        // Inisialisasi variabel untuk menghitung jumlah node
        int count = 0;

        // Mulai dari head dan terus ke node berikutnya hingga akhir linked list
        Node current = head;
        while (current != null) {
            // Menambahkan 1 ke jumlah node
            count++;
            // Pindah ke node berikutnya
            current = current.next;
        }

        // Mengembalikan jumlah total node
        return count;
    }

    // Method untuk mendapatkan node pada indeks tertentu dalam linked list
    private Node getNodeAtIndex(int index) {
        // Cek apakah linked list kosong atau indeks kurang dari 0
        if (head == null || index < 0) {
            return null;
        }

        // Inisialisasi variabel current sebagai node pertama dalam linked list
        Node current = head;

        //melakukan iterasi melalui list untuk mencari node pada indeks tertentu
        for (int i = 0; i < index && current != null; i++) {
            current = current.next;
        }

        // Mengembalikan node pada indeks tertentu atau null jika indeks melebihi panjang linked list
        return current;
    }

    // Method untuk mengurutkan data menggunakan algoritma shell sort
    public void shellSort() {
        // Cek jika linked list kosong atau hanya memiliki satu elemen
        if (head == null || head.next == null) {
            return;
        }

        // Mendapatkan jumlah node dalam linked list
        int n = getCount();

        // Menginisialisasi gap untuk pengurutan
        int gap = n / 2;

        // Mulai iterasi shell sort
        while (gap > 0) {
            // Iterasi melalui elemen dari gap hingga akhir linked list
            for (int i = gap; i < n; i++) {
                // Mendapatkan node pada indeks i
                Node temp = getNodeAtIndex(i);

                // Inisialisasi variabel j untuk perbandingan dan pertukaran
                int j = i;
                // Iterasi mundur dan pertukaran node jika diperlukan
                while (j >= gap && getNodeAtIndex(j - gap).harga > temp.harga) {
                    swapNode(getNodeAtIndex(j - gap), getNodeAtIndex(j));
                    j -= gap;
                }
            }

            // Mengurangi gap untuk iterasi selanjutnya
            gap /= 2;
        }
    }

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
            System.out.println("id = " + current);
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
        penyihirShell list = new penyihirShell();
        
        //proses menambahkan data pada node list dengan value data senjata
        //dengan parameter nama, stok, dan harga
        list.add("Divine Glaive", 11, 1970);
        list.add("Genius Wand", 6, 2000);
        list.add("Winter Truncheon", 14, 1910);
        list.add("Feather of Heaven", 14, 2030);
        list.add("Holy Crystal", 0, 2180);
        list.add("Enchanted Talisman", 9, 1870);
        list.add("Ice Queen Wand", 18, 2240);   
        list.add("Necklace of Durance", 10, 2110);
        list.add("Clock of Destiny", 19, 1950);
        list.add("Blood Wings", 20, 3000);
        list.add("Glowing Wand", 16, 2120);
        list.add("Concentrated Energy", 12, 2020);
        list.add("Fleeting Time", 21, 2050);
        list.add("Calamity Reaper", 15, 1950);
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
        

        //melakukan proses print setelah data disorting
        System.out.println("Setelah Sorting");
        //garis pembatas
        System.out.println("===============");
        //memanggil method print untuk menampilkan data setelah disortir
        list.print();
    }
}
