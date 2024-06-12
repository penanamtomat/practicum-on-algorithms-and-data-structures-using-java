/*
 * pada file ini terapat class Main yang digunakan untuk mengisi data dari rak buku
 * dan seluruh buku yang tedapat dalam narasi soal jurnal
 */

//file berada pada package RevisiJurnal
package RevisiJurnal;

//membuat class Main
public class Main {
    //membuat method main untuk menjalankan program
    public static void main(String[] args) {
        //membuat objek listRak
        listRak rakBuku = new listRak();

        /*membuat objek listBuku dengan variabel bukuSF. Fungsinya untuk menambahkan
        buku pada kategori science & fiction*/
        listBuku bukuSF = new listBuku();
        //lakukan pengisian data
        Buku buku1 = new NewBuku("The Machine Stops", "E.M. Forster", "Inggris", 36, (double) 3.6, "Science & Fiction");
        bukuSF.addLast(buku1);
        Buku buku2 = new NewBuku("Anthem", "Ayn Rand", "Inggris", 70, (double) 4.0, "Science & Fiction");
        bukuSF.addLast(buku2); 
        Buku buku3 = new NewBuku("At the Earth's Core", "Edgar Rice Burroughs", "Inggris", 131, (double) 4.5, "Science & Fiction");
        bukuSF.addLast(buku3);
        
        //lakukan pengisian data untuk kategori rak buku
        rakBuku.addTerakhir("Science & Fiction",bukuSF);
        //mencetak hasil dari data buku dan rak buku
        rakBuku.display();
        
        listBuku bukuBio = new listBuku();
        Buku buku4 = new NewBuku("Adventures in Friendship", "David Greyson", "Inggris", 140, 4.0, "Biographies");
        bukuBio.addLast(buku4);
        Buku buku5 = new NewBuku("Abraham Lincoln", "Carlo Collodi", "Indonesia", 136, 4.2, "Biographies");
        bukuBio.addLast(buku5);
        Buku buku6 = new NewBuku("My Life and Work", "Henry Ford", "Inggris", 233, 4.5, "Biographies");
        bukuBio.addLast(buku6);
        Buku buku7 = new NewBuku("Alexander The Great", "Jacob Abbott", "Indonesia", 231, 5.0, "Biographies");
        bukuBio.addLast(buku7);
        Buku buku8 = new NewBuku("Walden", "Henry David Thoreau", "Indonesia", 244, 4.0, "Biographies");
        bukuBio.addLast(buku8);

        rakBuku.addTerakhir("Biographies", bukuBio);
        rakBuku.display();

        listBuku bukuFan = new listBuku();
        Buku buku9 = new NewBuku("Time Machine", "H.G Wells", "Indonesia", 78, 4.0, "Fantasy");
        bukuBio.addLast(buku9);
        Buku buku10 = new NewBuku("Adventures of Huckleberry Finn", "Mark Twain", "Indonesia", 305, 5.0, "Action & Adventure");
        bukuBio.addLast(buku10);
        Buku buku11 = new NewBuku("All the Way to Fairyland", "Evelyn Sharp", "Inggris", 125, 3.0, "Fantasy");
        bukuBio.addLast(buku11);
        Buku buku12 = new NewBuku("The Return of Tarzan", "Edgar Rice Burroughs", "Inggris", 240, 4.8, "Fantasy");
        bukuBio.addLast(buku12);
        Buku buku13 = new NewBuku("The Book of Wonder", "Lord Dunsay", "Indonesia", 58, 3.5, "Fantasy");
        bukuBio.addLast(buku13);
        Buku buku14 = new NewBuku("Adventures of Pinocchio", "Carlo Collodi", "Indonesia", 136, 4.2, "Fantasy");
        bukuBio.addLast(buku14);

        rakBuku.addTerakhir("Fantasy", bukuFan);
        rakBuku.display();

        listBuku bukuAct = new listBuku();
        Buku buku15 = new NewBuku("Fast as the wind", "Nat Gould", "Indonesia", 172, 3.0, "Action & Adventure");
        bukuBio.addLast(buku15);
        Buku buku16 = new NewBuku("Around The World", "Jules Verne", "Indonesia", 198, 4.5, "Action & Adventure");
        bukuBio.addLast(buku16);
        Buku buku17 = new NewBuku("A Tale of Two Cities", "Charles Dickens’", "Inggris", 355, 4.3, "Action & Adventure");
        bukuBio.addLast(buku17);
        Buku buku18 = new NewBuku("Adventures of Huckleberry Finn", "Mark Twain", "Indonesia", 305, 5.0, "Action & Adventure");
        bukuBio.addLast(buku18);
        Buku buku19 = new NewBuku("Robin Crusoe", "Daniel Defoe", "Indonesia", 143, 4.0, "Action & Adventure");
        bukuBio.addLast(buku19);

        rakBuku.addTerakhir("Action & Adventure", bukuAct);
        rakBuku.display();
    }
    
}

