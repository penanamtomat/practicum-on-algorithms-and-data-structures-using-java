/*
 * pada file ini terdapat class list untuk mengatur senjata perang
 * dan method untuk mengurutkan senjata dengan algoritma bubblesort
 * serta method untuk mencari senjata berdasarkan stok dengan algoritma linear search
 */

 //file berada dalam package bubbleSort
package bubbleSort;

//membuat class senjataPerang
public class senjataPerang {
    /*inisialisasi head dan tail dengan variabel Node
     * tujuannya adalah untuk mengatur posisi head dan tail
     * pada list
     */
    Node head, tail;

    //membuat constructor untuk head dan tail
    public senjataPerang() {
        head = null;
        tail = null;
    }

    /*
     * method add digunakan untuk menambahkan data baru
     * pada list dengan parameter nama, stok dan harga
     */
    public void add(String nama, int stok, int harga) {
        /*di dalam method, variabel newNode dibuat untuk objek dengan
        parameter yang disediakan*/
        Node newNode = new Node(nama, stok, harga);

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

    /*Cuplikan kode ini mengimplementasikan algoritma bubblesort 
    untuk mengurutkan daftar di dalam node*/
    public void bubbleSort() {
        //membuat variabel swapped
        boolean swapped;

        //melakukan perulangan do while
        do {
            /*pertama yang dilakukan adalah mengatur swapped dengan nilai false
            dengan tujuan untuk mengatur batasan pada list*/
            swapped = false;
            //inisialisasi variabel current sama dengan head
            Node current = head;
            //inisialisasi variabel previous sama dengan null
            Node previous = null;
            
            /*melakukan perulangan while untuk mencari semua data yang ingin diurutkan
            dengan kondisi pertama data current tidak null dan data selanjutnya juga
            tidak null*/
            while (current != null && current.next != null) {
                //jika data current lebih besar dari data selanjutnya
                if (current.stok > current.next.stok) {
                    //maka data current disimpan dalam variabel bantu temp
                    Node temp = current.next;
                    //data selanjutnya disimpan dalam variabel bantu current
                    current.next = temp.next;
                    //data sebelumnya disimpan dalam variabel current untuk ditukar
                    temp.prev = current.prev;
                    //menukar data sebelumnya dengan temp
                    current.prev = temp;
                    //data temp menjadi data saat ini
                    temp.next = current;
                    
                    //dilakukan pengecekan pada data
                    //jika data sebelumnya bernilai null
                    if (previous == null) {
                        //maka data temp menjadi head
                        head = temp;
                    } else {
                        //jika tidak, data temp menjadi data sebelumnya
                        previous.next = temp;
                    }
                    
                    /*variabel swap bernilai true, jika bernilai true, maka perulangan
                    akan tetap dilakukan sampai swapped bernilai false*/
                    swapped = true;
                }
                //data sebelumnya ditukar menjadi data saat ini
                previous = current;
                //data saat ini menjadi di link dengan data selanjutnya
                current = current.next;
            }
        } while (swapped);
    }

    //method untuk mencari senjata berdasarkan stok dengan algoritma linear search
    //dengan parameter kunci
    public int linierSearch(int kunci){
        //inisialisasi variabel position dengan nilai 0 sebagai nilai awalan
        int position = 0;
        //inisiaslisasi curr sama dengan head
        Node curr = head;

        //melakukan perulangan while untuk melakukan pencarian data
        //dengan kondisi curr tidak null
        while (curr != null) {
            //jika curr stok sama dengan kunci
            if (curr.stok == kunci) {
                //maka return position untuk mengembalikan nilai posisi
                return position; 
            }
            //data selanjutnya diupdate untuk mencari data yang diinginkan
            curr = curr.next;
            //variabel position ditambah 1 untuk menggeser data
            position++;
        }
        //jika tidak ditemukan, maka mengembalikan nilai dengan -1
        return -1; 
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
            System.out.println("id = " + current);
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
        //inisialisasi objek senjataPerang
        senjataPerang list = new senjataPerang();
        
        //proses menambahkan data pada node list dengan value data senjata
        //dengan parameter nama, stok, dan harga
        list.add("Demon Hunter Sword", 8, 2180);
        list.add("Sea halber", 6, 2200);
        list.add("Melfic Roar", 3, 2060);
        list.add("Haas's Claws", 19, 1810);
        list.add("Berserker's Fury", 3, 2350);
        list.add("Endless Battle", 4, 2470);
        list.add("Windtalker", 12, 1870);
        list.add("Scarlet Phantom", 16, 2020);
        list.add("Blade of Despair", 23, 3010);
        list.add("Hunter Strike", 15, 2010);
        list.add("Bloodlust Axe", 9, 1970);
        list.add("Rose Gold Meteor", 17, 2270);
        list.add("Golden Staff", 27, 2100);
        list.add("Wind of Nature", 25, 1910);

        //melakukan proses print sebelum data disorting
        System.out.println("Sebelum Sorting");
        //garis pembatas
        System.out.println("===============");
        //memanggil method print untuk menampilkan data sebelum disortir
        list.print();
        
        //memberikan jarak
        System.out.println();

        //melakukan proses sorting pada data yang telah ditambahkan
        list.bubbleSort();

        //melakukan proses print setelah data disorting
        System.out.println("Setelah Sorting");
        //garis pembatas
        System.out.println("===============");
        //memanggil method print untuk menampilkan data setelah disortir
        list.print();

        //melakukan proses pencarian dengan algoritma linear search
        //inisialisasi variabel kunci dengan nilai 17 (sesuai jurnal)
        int kunci = 17;
        /*memanggil method linierSearch untuk mencari data
        list.linierSearch(kunci);*/
        int value = list.linierSearch(kunci);

        //lakukan proses pencarian selama value tidak bernilai -1
        if (value != -1) {
            //maka data ditampilkan dengan keterangan berupa stok yang dicari
            System.out.println("Stok yang ingin dicari : " + kunci);
            //menampilkan posisi data yang dicari
            System.out.println("Senjata dengan stok" + kunci + "ditemukan pada posisi ke - " + (value + 1));
            //men-set posisi data (curr) menjadi head
            Node curr = list.head;
            //lakukan perulangan sebanyak value yang ingin dicari
            for (int i = 0; i < value; i++) {
                //curr ditunjuk menuju list selanjutnya (proses pengecekan)
                curr = curr.next;
            }
            //menampilkan data yang ditemukan berupa nama
            System.out.println("Nama : " + curr.nama);
            //menampilkan data yang ditemukan berupa stok
            System.out.println("Stok : " + curr.stok);
            //menampilkan data yang ditemukan berupa harga
            System.out.println("Harga : " + curr.harga);
        } else {
            //jika value tidak bernilai -1, maka data tidak ditemukan 
            System.out.println("Stok yang ingin dicari : " + kunci);
            //menampilkan keterangan data tidak dengan dengan stok yang dicari
            System.out.println("Senjata dengan stok" + kunci + "tidak ditemukan");
        }
    }
}