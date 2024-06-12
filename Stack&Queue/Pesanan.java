/*
 * pada file ini, dibuat class Pesanan yang digunakan untuk membuat
 * list Stack untuk menyimpan pesanan dan berisi method-method untuk 
 * menambah, menghapus, dan mendisplay data pesanan
 */

//file berada di package JurnalNo2
package JurnalNo2;

//membuat class Pesanan
public class Pesanan {
    //inisialisasi variabel atas dengan tipe data nodeStack, berfungsi untuk
    //mengarahkan node tumpukan berada di paling atas
    nodeStack atas;

    //membuat constructor nodeStack
    public Pesanan() {
        atas = null;
    }
    
    /*method push ini berfungsi menambahkan node baru ke bagian atas tumpukan.*/
    public void push(String order) {
        /*Data node baru adalah string pesanan yang diteruskan sebagai argumen.*/
        nodeStack newNode = new nodeStack(order);
        /*Node baru kemudian ditautkan ke node teratas sebelumnya (atas)*/
        newNode.setBawah(atas);
        /*dan menjadi node teratas yang baru.*/
        atas = newNode;
    }

    /*Method pop ini dirancang untuk menghapus elemen dari atas tumpukan*/
    public void pop() {
        /*Jika tumpukan tidak kosong, elemen teratas akan disetel ke elemen berikutnya 
        dalam baris.*/
        if (atas != null) {
            atas = atas.getBawah();
        } else {
            /*Jika tumpukan kosong, ia akan mencetak pesan yang mengatakan demikian.*/
            System.out.println("Stack Kosong.");
        }
    }
    
    /*Method display ini melintasi struktur data seperti tumpukan 
    mulai dari atas (atas) dan mencetak urutan setiap node hingga mencapai 
    bagian bawah (null).*/
    public void display() {
        nodeStack current = atas;

        /*dilakukan perulangan untuk mengecek tiap node yang ada di dalam tumpukan*/
        while (current != null) {
            /*mencetak urutan data yang ada di dalam tumpukan*/
            System.out.println(current.getOrder());
            current = current.getBawah();
        }
    }
}
