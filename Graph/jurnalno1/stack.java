/*
 * pada file ini, dibuat class stack yang digunakan untuk membuat
 * list Stack untuk menyimpan data dan berisi method-method untuk 
 * menambah, menghapus, dan mengambil data
 */

 //file berada di package jurnalno1
package jurnalno1;

//membuat class stack
public class stack {
    //inisialisasi variabel atas dengan tipe data nodeStack, berfungsi untuk
    //mengarahkan node tumpukan berada di paling atas
    graphNode atas;

    //membuat constructor nodeStack
    public stack() {
        atas = null;
    }

    /*Method isEmpty ini berfungsi untuk mengecek apakah tumpukan kosong atau
    tidak*/
    public boolean isEmpty() {
        return (atas == null);
    }
    
    /*method push ini berfungsi menambahkan node baru ke bagian atas tumpukan.*/
    public void push(String departure) {
        /*Data node baru adalah string pesanan yang diteruskan sebagai argumen.*/
        graphNode newNode = new graphNode(departure, 0, null);
        /*Node baru kemudian ditautkan ke node teratas sebelumnya (atas)*/
        newNode.next = atas;
        atas = newNode;
    }

    /*Method pop ini dirancang untuk menghapus elemen dari atas tumpukan*/
    public String pop() {
        /*Jika tumpukan tidak kosong, elemen teratas akan disetel ke elemen berikutnya 
        dalam baris.*/
        if (atas != null) {
            String departure = atas.departure;
            atas = atas.next;
            return departure;
            
        } else {
            return null;    
        }
    }
    
    /*Method peek digunakan untuk mengambil elemen pertama dari
     struktur stack*/
    public String peek(){
        //melakukan pengecekan apakah tumpukan kosong atau tidak
        if(atas!=null){
            //jika iya return nilai departure sebagai nilai top
            return atas.departure;
        }
        else{
            //jika tidak, return null
            return null;
        }
    }
}