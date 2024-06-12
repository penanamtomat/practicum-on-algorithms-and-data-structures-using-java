/*
 * pada file ini terdapat class Main yang digunakan untuk mencetak semua data
 * yang ditambahkan sesuai dengan soal jurnal
 */

//file berada di package soalno1
package soalno1;

//membuat class Main
public class Main {
    //membuat method main
    public static void main(String[] args) {
        //membuat objek linkedList untuk masing-masing "Earth" dengan nomor versi yang berbeda.
        linkedList earth616 = new linkedList();
        linkedList earth1610 = new linkedList();
        linkedList earth295 = new linkedList();
        linkedList earth18119 = new linkedList();
        linkedList earth1228 = new linkedList();
        linkedList earth65 = new linkedList();
        linkedList earth199999 = new linkedList();
        linkedList earth2149 = new linkedList();
        linkedList earth807128 = new linkedList();
        linkedList earth311 = new linkedList();
        linkedList earth801 = new linkedList();
        linkedList earth982 = new linkedList();
        linkedList earth6311 = new linkedList();
        linkedList earth1611 = new linkedList();
        linkedList earth5631 = new linkedList();

        //mencetak semua data sesuai dengan soal
        System.out.println("All Universes (Pre Order)");
        System.out.println("-------------------------");

        //inisialisasi objek binaryTree
        binaryTree pohon = new binaryTree();

        //LEVEL 0: Menambahkan root "Earth-616"
        pohon.addRoot("Earth-616", earth616);
        
        //LEVEL 1: Menambahkan node sebelah kiri "Earth-1610" dan node sebelah kanan "Earth-1228".
        pohon.addKiri(pohon.root, "Earth-1610", earth1610);
        pohon.addKanan(pohon.root, "Earth-1228", earth1228);

        //LEVEL 1: Menambahkan node sebelah kiri "Earth-65" dan node sebelah kanan "Earth-199999".
        //Menambahkan node sebelah kiri "Earth-295" dan node sebelah kanan "Earth-6311".
        pohon.addKiri(pohon.root.kiri, "Earth-65", earth65);
        pohon.addKanan(pohon.root.kiri, "Earth-199999", earth199999);
        pohon.addKiri(pohon.root.kanan, "Earth-295", earth295);
        pohon.addKanan(pohon.root.kanan, "Earth-6311", earth6311);

        //LEVEL 2: Menambahkan node sebelah kiri "Earth-311" dan node sebelah kanan "Earth-982".
        //Menambahkan node sebelah kiri "Earth-18119" dan node sebelah kanan "Earth-2149".
        pohon.addKiri(pohon.root.kiri.kanan, "Earth-311", earth311);
        pohon.addKanan(pohon.root.kiri.kanan, "Earth-982", earth982);
        pohon.addKiri(pohon.root.kanan.kiri, "Earth-18119", earth18119);
        pohon.addKanan(pohon.root.kanan.kiri, "Earth-2149", earth2149);

        //LEVEL 3: Menambahkan node sebelah kiri "Earth-801".
        //Menambahkan node sebelah kiri "Earth-1611".
        //Menambahkan node sebelah kiri "Earth-807128" dan node sebelah kanan "Earth-5631".
        pohon.addKiri(pohon.root.kiri.kanan.kiri, "Earth-801", earth801);
        pohon.addKiri(pohon.root.kanan.kiri.kiri, "Earth-1611", earth1611);
        pohon.addKiri(pohon.root.kanan.kiri.kanan, "Earth-807128", earth807128);
        pohon.addKanan(pohon.root.kanan.kiri.kanan, "Earth-5631", earth5631);

        // Melakukan traversal pre-order pada pohon dan mencetak informasi setiap node.
        pohon.preOrder(pohon.root);
    }
}