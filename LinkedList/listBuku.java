/*
 * pada file ini terapat class listRak yang digunakan untuk
 * mengatur list data pada buku yang berisi method-method untuk menambah,
 * menghapus, dan mendisplay data list
 */

//file berada pada package RevisiJurnal
package RevisiJurnal;

//membuat class listBuku
public class listBuku {
    /*inisialisasi variabel kepala. ekor, saatIni, dan newBook dengan tipe data nodeBuku 
    dengan tujuan seluruh data yang diinput pada linked list listBuku ini harus
    sesuai dengan variabel yang berada dalam nodeBuku*/
    nodeBuku newBook;
    nodeBuku kepala, ekor, saatIni;

    //membuat method addFirst untuk menambahkan data buku di awal dengan parameter newBook
    public void addFirst(Buku newBook) {
        /*mengatur objek yang ada di nodeBuku dari parameter newBook dengan variabel data*/
        nodeBuku data = new nodeBuku(newBook);
        //mengecek kondisi apakah kepala == null
        if(kepala == null){
            /*jika iya maka kepala dan ekor sama dengan objek data*/
            kepala = data;
            ekor = data;
        }
        else{
            //jika tidak maka variabel akan diatur untuk menambahkan data baru yang masuk
            data.next = kepala;
            kepala.prev = data;
            kepala = data;
        }
    }

   /*membuat method insertion dengan parameter newBook dan tandaMasuk. Fungsinya untuk
    menambahkan data buku di tengah indeks. variabel tandaMasuk dibuat sebagai variabel
    bantu untuk menandakan bahwa target yang akan ditambahkan itu harus sesuai dengan dengan judul dari buku*/
   public void insertion(Buku newBook, String tandaMasuk){
       /*mengatur objek yang ada di nodeBuku dari parameter newBook dengan variabel data*/
       nodeBuku data = new nodeBuku(newBook);
       //mengecek kondisi apakah kepala == null
       if(kepala == null){
           /*jika iya maka kepala dan ekor sama dengan objek data*/
           kepala = ekor = data;
       }
       else{
            //jika tidak, maka data saat ini akan diatur menuju kepala
            saatIni = kepala;
            //dilakukan perulangan untuk mengecek data saat ini apakah null atau tidak
            while(saatIni != null){
                //dilakukan pengecekan apakah judul buku pada data sesuai dengan tandaMasuk yang diinginkan
                if(saatIni.newBook.judul != tandaMasuk){
                    //jika iya, maka node bergeser dengan mengatur next data dengan data baru
                    data.next = saatIni.next;
                    saatIni.next = data;
                    return;
                }
                saatIni = saatIni.next;
            }
       }
   }

   //membuat method deleteBuku dengan parameter tandaHapus. Fungsinya untuk menghapus data buku
   public void deleteBuku(String tandaHapus){
        //inisialisasi data saatIni = kepala
       saatIni = kepala;
       //dilakukan proses perulangan untuk mengecek data saat ini sama dengan null atau tidak
       while(saatIni != null){
           //dilakukan pengecekan apakah judul buku pada data sesuai dengan tandaHapus yang diinginkan
           if(saatIni.newBook.judul == tandaHapus){
               if(saatIni.next == ekor){
                    //jika iya, maka lakukan proses penghapusan data
                    ekor = saatIni;
                    ekor.next = null;
                    saatIni.next = saatIni.next.next;
                    return;
               }
           }
           saatIni = saatIni.next;
       }
   }
   
    //membuat method addLast untuk menambahkan data buku di akhir
    public void addLast(Buku newBook) {
        /*mengatur objek yang ada di nodeBuku dari parameter newBook dengan variabel data*/
        nodeBuku data = new nodeBuku(newBook);
        //mengecek kondisi apakah kepala == null
        if(kepala == null){
            /*jika iya maka kepala dan ekor sama dengan objek data*/
            kepala = ekor = data;
        }
        else{
            //jika tidak maka variabel akan diatur untuk menambahkan data baru yang masuk
            data.prev = kepala;
            ekor.next = data;
            ekor = data;
        }
    }

    //membuat method display untuk menampilkan data buku
    public void display() {
        /*mengatur objek yang ada di nodeBuku dengan variabel curr = kepala*/
        nodeBuku curr = this.kepala;
        //mengecek kondisi apakah curr == null
        if(curr == null){
            //jika iya, maka tidak ada data yang ditampilkan
            System.out.println("Buku Kiky tidak ada");
        }
        else{
            //jika tidak, maka dilakukan proses perulangan untuk mendisplay tiap data buku
            while(curr != null){
                System.out.println("Judul Buku: " + curr.newBook.judul);
                System.out.println("Pengarang: " + curr.newBook.penulis);
                System.out.println("Bahasa: " + curr.newBook.bahasa);
                System.out.println("Halaman: " + curr.newBook.hlm);
                System.out.println("Rating: " + curr.newBook.rating);
                System.out.println("Kategori: " + curr.newBook.kategori);
                System.out.println("---------------------------------------------");
                curr = curr.next;
            }
        }
    }
}