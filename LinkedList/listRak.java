/*
 * pada file ini terapat class listRak yang digunakan untuk
 * mengatur list data pada buku yang berisi method-method untuk menambah,
 * menghapus, dan mendisplay data list
 */

 //file berada pada package RevisiJurnal
package RevisiJurnal;

//membuat class listRak
public class listRak {
    /*inisialisasi variabel head, tail, current dengan tipe data nodeRak
     * dengan tujuan seluruh data yang diinput pada linked list listRak ini
     * harus sesuai dengan variabel yang berada dalam nodeRak
     */
    nodeRak head, tail, current;

    /*membuat method addTerakhir dengan parameter kategorirak dan buku, fungsinya
    untuk menambah rak buku dari belakang*/
    public void addTerakhir(String kategoriRak, listBuku buku) {
        /*mengatur objek yang ada di nodeRak dari parameter kategorirak dan buku dengan variabel baru */
        nodeRak baru = new nodeRak(kategoriRak, buku);
        //mengecek kondisi apakah head == null
        if(head == null){
            //jika iya maka head dan tail sama dengan objek baru
            head = tail = baru;
        }
        else{
            //jika tidak maka variabel akan diatur untuk menambahkan data baru yang masuk
            tail.next = baru;
            baru.prev = tail;
            baru.next = head;
            head.prev = baru;
            tail = baru;
        }
    }

    /*membuat method insertion dengan parameter kategorirak, buku dan tanda. Fungsinya
    untuk menambah rak buku berada di tengah indeks. variabel tanda dibuat sebagai variabel
    bantu untuk menandakan bahwa target yang akan ditambahkan itu harus sesuai dengan kategoriRak*/
    public void insertion(String kategoriRak, listBuku buku, String tanda){
        /*mengatur objek yang ada di nodeRak dari parameter kategorirak dan buku */
        nodeRak baru = new nodeRak(kategoriRak, buku);
        //mengecek kondisi apakah head == null
        if(head == null){
            //jika iya maka head dan tail sama dengan objek baru
            head = tail = baru;
        }
        else{
            //jika tidak maka variabel current diatur menuju head
            current = head;
            //sehingga dibuat perulangan untuk mencari indeks yang ingin ditambah
            while (current != null) {
                //mengecek apakah nama kategori dari rak sama dengan tanda yang dimasukkan dalam
                //variabel tanda
                if(current.kategoriRak == tanda){
                    //jika iya maka variabel baru dijadikan sebagai next dari variabel current
                    //dan seluruh data di returnkan
                    baru.next = current.next;
                    current.next = baru;
                    return;
                }
                current = current.next;
            }
        }
    }

    /*membuat method deleteRak dengan parameter tanda. Fungsinya untuk menghapus rak buku
    pada list*/
    public void deleteRak(String tanda){
        //inisialisasi current = head
        current = head;
        //sehingga dibuat perulangan untuk mencari data yang ingin dihapus
        while(current != null){
            //dengan mengecek apakah nama kategori dari rak sama dengan tanda yang dimasukkan
            if(current.kategoriRak == tanda){
                //selanjutnya mengecek kondisi jika data nextnya == tail
                if(current.next == tail){
                    //jika iya maka tail sama dengan current dan nextnya = null
                    //agar data selanjutnya tidak berisi node selanjutnya hilang
                     tail = current;
                     tail.next = null;
                     current.next = current.next.next;
                     return;
                }
            }
            current = current.next;
        }
    }

    /*membuat method display. Fungsinya untuk menampilkan data pada list*/
    public void display(){
        //inisialisasi current = head
        current = head;
        //selama data pada next != head
        while(current.next != head){
            //dicek terlebih dahulu data buku harus tidak sama dengan null
            if(current.buku != null){
                //cetak nama kategori dari rak buku yang dimasukkan datanya
                System.out.println("Kategori: " + current.kategoriRak);
                System.out.println("---------------------------------------------");
                current.buku.display();
            }
            current = current.next;
        }
    }
}
