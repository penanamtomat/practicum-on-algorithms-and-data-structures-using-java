/*
 * pada file ini terapat class Main yang digunakan untuk mengisi data dari antrian dan
 * tumpukan pesanan berdasarkan soal jurnal dan memanggil setiap methodnya
 */

//file berada di package JurnalNo2
package JurnalNo2;

//membuat class Main
public class Main {
    //membuat method main untuk menjalankan program
    public static void main(String[] args) {
        //membuat objek antrian
        Antrian antrian = new Antrian();
        //membuat objek selesai
        antrian.selesai = new Antrian();
        

        //membuat objek pesanan untuk pesanan pertama
        Pesanan pesanan1 = new Pesanan();
        //menambahkan pesanan pertama
        pesanan1.push("[Nasi Goreng, Air Mineral, Kentang]");

        //membuat objek pesanan untuk pesanan kedua
        Pesanan pesanan2 = new Pesanan();
        //menambahkan pesanan kedua
        pesanan2.push("[Mie Goreng, Teh Manis, Sosis, Air Mineral]");

        //membuat objek pesanan untuk pesanan ketiga
        Pesanan pesanan3 = new Pesanan();
        //menambahkan pesanan ketiga
        pesanan3.push("[Nasi Campur, Air Mineral]");

        //membuat objek pesanan untuk pesanan keempat
        Pesanan pesanan4 = new Pesanan();
        //menambahkan pesanan keempat
        pesanan4.push("[Nasi Goreng, Teh Manis, Sosis, Air mineral]");

        //menambahkan data nama ke antrian
        antrian.enqueue("Rashford", pesanan1);
        antrian.enqueue("Jimin", pesanan2);
        antrian.enqueue("Marquez", pesanan3);
        antrian.enqueue("Ayanokoji", pesanan4);

        //mencetak antrian pesanan
        System.out.println("> Antrian pesanan:");
        antrian.display2();
        System.out.println("-----------------------------");

        //mencetak pesanan yang diproses
        System.out.println("> Pesanan diproses");
        antrian.dequeue();
        antrian.display2();
        System.out.println("-----------------------------");
        
        //mencetak pesanan ketika kiky datang
        System.out.println("> Kiky datang untuk pesan");
        // System.out.println();
        antrian.enqueue("Ordered by : Jimin", pesanan2);
        antrian.dequeue();
        Pesanan pesanan5 = new Pesanan();
        antrian.enqueue("Kiky", pesanan5);
        pesanan5.push("[Nasi Kuning, Es Teh]");
        antrian.display2();
        System.out.println("-----------------------------");
        
        //mencetak pesanan ketika marquez membatalkan pesanan
        System.out.println("> Marquez membatalkan pesanan");
        antrian.enqueue("Ordered by : Ayanokoji", pesanan4);

        antrian.dequeue();
        antrian.dequeue();
        antrian.dequeue();
        antrian.dequeue();

        antrian.enqueue("Ordered by : Kiky", pesanan5);

        antrian.display2();

        antrian.dequeue();
        antrian.dequeue();
        System.out.println("-----------------------------");

        //mencetak pesanan selesai
        System.out.println("> Pesanan selesai");
        antrian.enqueue("Rashford", pesanan1);
        antrian.enqueue("Jimin", pesanan2);
        antrian.enqueue("Ayanokoji", pesanan4);
        antrian.enqueue("Kiky", pesanan5);
        antrian.display2();
        System.out.println("-----------------------------");
    }
}