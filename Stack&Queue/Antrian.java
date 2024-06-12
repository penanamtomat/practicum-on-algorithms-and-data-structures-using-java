/*
 * pada file ini, dibuat class Pesanan yang digunakan untuk membuat
 * list Queue untuk menyimpan pesanan dan berisi method-method untuk 
 * menambah, menghapus, dan mendisplay data antrian
 */

//file berada di package JurnalNo2
package JurnalNo2;

//membuat class Pesanan
public class Antrian {
    /*inisialisasi variabel front dan rear dengan tipe data nodeQueue*/
    nodeQueue front, rear;
    /**/
    Antrian next, prev;
    /*inisialisasi variabel selesai dengan tipe data Antrian sebagai variabel
    bantu untuk menandakan perulangan telah selesai*/
    Antrian selesai;

    public Antrian() {
        front = null;
        rear = null;
    }

    /*methode enqueue ini digunakan untuk menambahkan elemen baru ke struktur data antrian.*/
    public void enqueue(String namaAntrian, Pesanan daftarPesanan) {
        /* Metode ini mengambil dua parameter: namaAntrian (string) dan daftarPesanan (objek bertipe Pesanan). 
        Metode ini membuat node orderAntri baru dengan parameter yang disediakan.*/
        nodeQueue orderAntri = new nodeQueue(namaAntrian, daftarPesanan);

        /*Jika antrian kosong (depan adalah null), */
        if(front == null) {
            /*maka antrian tersebut akan menugaskan bagian depan dan belakang ke node baru. */
            front = rear = orderAntri;
        }
        else {
            /*Jika tidak, ia menghubungkan node belakang saat ini ke node baru dan kemudian memperbarui node belakang ke node baru. */
            rear.rear = orderAntri;
            rear = orderAntri;
        }
    }

    /*Method dequeue(), digunakan untuk menghapus dan mengembalikan 
    elemen pertama dari struktur data dalam antrian.*/
    public nodeQueue dequeue() {
        /*node depan saat ini ke variabel saat ini*/
        nodeQueue curr = front;
        /*Jika saat ini tidak null*/
        if(curr != null){
            /*ia menetapkan simpul depan ke simpul berikutnya dalam antrian (jika ada), 
            dan membatalkan referensi dari simpul depan sebelumnya ke simpul belakangnya.*/
            front = front.rear;
            curr.rear = null;
        }
        /* Jika nama node yang di-dequeued bukan "Rashford"*/
        if(!curr.namaAntrian.equals("Rashford")){
            /*maka nama node dan daftar pesanan akan dimasukkan ke dalam antrian berbeda yang disebut selesai. */
            selesai.enqueue(curr.namaAntrian, curr.daftarPesanan);
        }
        /*ia mengembalikan node yang di-dequeued.*/
        return curr;
    }

    /*Method display2 mencetak nama item dalam antrian (nodeQueue) dan rincian pesanan terkait (Pesanan).*/
    public void display2() {
        /*Dimulai dari antrian paling depan dan berlanjut hingga mencapai akhir antrian.*/
        nodeQueue current = front;
        
        /*Untuk setiap item, ia mencetak nama item*/
        while (current != null) {
            /* memanggil metode display() pada urutan terkait, dan kemudian berpindah 
            ke item berikutnya dalam antrian.*/
            System.out.print(current.namaAntrian + " ");
            Pesanan pesanan = current.daftarPesanan;
            pesanan.display();
            // System.out.println(); 
            current = current.rear;
        }
    }
}