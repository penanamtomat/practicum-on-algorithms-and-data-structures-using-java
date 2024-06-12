/*
 * pada file ini terdapat class utama yang digunakan untuk
 * menjalankan code program
 */

//file berada di package jurnalno1
package jurnalno1;

//membuat class utama
public class utama {
    //membuat method main untuk menjalankan program
    public static void main(String[] args) {

        // Membuat objek graph dengan parameter ukuran 29
        graph newGraph = new graph(29);

        // Menambahkan vertex perjalanan pada graph
        newGraph.addVertex("ampenan", 0);
        newGraph.addVertex("bima", 1);
        newGraph.addVertex("cakra", 2);
        newGraph.addVertex("dasan cermen", 3);
        newGraph.addVertex("gelogor", 4);
        newGraph.addVertex("gersik", 5);
        newGraph.addVertex("gomong", 6);
        newGraph.addVertex("gerung", 7);
        newGraph.addVertex("jempong", 8);
        newGraph.addVertex("karang bedil", 9);
        newGraph.addVertex("karang pule", 10);
        newGraph.addVertex("kediri", 11);
        newGraph.addVertex("kekalik", 12);
        newGraph.addVertex("kupang", 13);
        newGraph.addVertex("mandalika", 14);
        newGraph.addVertex("monjok", 15);
        newGraph.addVertex("narmada", 16);
        newGraph.addVertex("pagutan", 17);
        newGraph.addVertex("parampuan", 18);
        newGraph.addVertex("peraya", 19);
        newGraph.addVertex("peringgerate", 20);
        newGraph.addVertex("pemenang", 21);
        newGraph.addVertex("rumak", 22);
        newGraph.addVertex("sedayu", 23);
        newGraph.addVertex("senggigi", 24);
        newGraph.addVertex("sesela", 25);
        newGraph.addVertex("sumbawa", 26);
        newGraph.addVertex("suranadi", 27);
        newGraph.addVertex("sekotong", 28);

        //menambahkan rute perjalan ke dalam graph
        newGraph.addEdge(0, 6, 6);
        newGraph.addEdge(0, 7, 7);
        newGraph.addEdge(0, 18, 1);
        newGraph.addEdge(0, 14, 8);
        
        newGraph.addEdge(1, 23, 8);
        newGraph.addEdge(1, 6, 7);
        newGraph.addEdge(1, 11, 2);
        newGraph.addEdge(1, 9, 6);
        newGraph.addEdge(1, 12, 9);
        newGraph.addEdge(1, 20, 8);
        newGraph.addEdge(1, 26, 4);
        
        newGraph.addEdge(2, 19, 10);
        newGraph.addEdge(2, 7, 2);
        newGraph.addEdge(2, 13, 4);
        newGraph.addEdge(2, 22, 1);
        newGraph.addEdge(2, 5, 10);
        newGraph.addEdge(2, 24, 8);
        
        newGraph.addEdge(3, 18, 2);
        newGraph.addEdge(3, 10, 10);
        newGraph.addEdge(3, 22, 5);
        
        newGraph.addEdge(4, 22, 2);
        newGraph.addEdge(4, 5, 2);
        
        newGraph.addEdge(5, 4, 2);
        newGraph.addEdge(5, 24, 4);
        newGraph.addEdge(5, 2, 10);
        newGraph.addEdge(5, 22, 1);
        
        newGraph.addEdge(6, 23, 3);
        newGraph.addEdge(6, 0, 6);
        newGraph.addEdge(6, 7, 10);
        newGraph.addEdge(6, 11, 2);
        newGraph.addEdge(6, 1, 7);
        
        newGraph.addEdge(7, 6, 10);
        newGraph.addEdge(7, 0, 7);
        newGraph.addEdge(7, 14, 1);
        newGraph.addEdge(7, 13, 3);
        newGraph.addEdge(7, 2, 2);
        newGraph.addEdge(7, 19, 6);
        newGraph.addEdge(7, 11, 5);

        newGraph.addEdge(8, 27, 5);
        newGraph.addEdge(8, 20, 3);
        newGraph.addEdge(8, 12, 6);
        newGraph.addEdge(8, 17, 7);

        newGraph.addEdge(9, 1, 6);
        newGraph.addEdge(9, 19, 4);
        newGraph.addEdge(9, 25, 7);
        newGraph.addEdge(9, 28, 10);
        newGraph.addEdge(9, 12, 2);
        newGraph.addEdge(9, 11, 7);

        newGraph.addEdge(10, 13, 10);
        newGraph.addEdge(10, 3, 10);
        newGraph.addEdge(10, 22, 7); 
        newGraph.addEdge(10, 14, 7);
        newGraph.addEdge(10, 18, 3);

        newGraph.addEdge(11, 6, 2);
        newGraph.addEdge(11, 7, 5);
        newGraph.addEdge(11, 19, 1);
        newGraph.addEdge(11, 9, 7);
        newGraph.addEdge(11, 2, 1);
        newGraph.addEdge(12, 20, 7);
        newGraph.addEdge(12, 1, 9);
        newGraph.addEdge(12, 9, 2);
        newGraph.addEdge(12, 28, 5);
        newGraph.addEdge(12, 17, 7);
        newGraph.addEdge(12, 8, 6);
        newGraph.addEdge(13, 10, 10);
        newGraph.addEdge(13, 2, 4);
        newGraph.addEdge(13, 7, 3);
        newGraph.addEdge(13, 10, 10);
        newGraph.addEdge(13, 14, 10);

        newGraph.addEdge(14, 0, 5);
        newGraph.addEdge(14, 18, 4);
        newGraph.addEdge(14, 10, 7);
        newGraph.addEdge(14, 13, 10);
        newGraph.addEdge(14, 1, 7);
        
        newGraph.addEdge(15, 21, 10);
        newGraph.addEdge(15, 26, 10);
        newGraph.addEdge(15, 23, 9);

        newGraph.addEdge(16, 21, 6);
        newGraph.addEdge(16, 20, 3);
        newGraph.addEdge(16, 27, 1);

        newGraph.addEdge(17, 28, 2);
        newGraph.addEdge(17, 12, 7);
        newGraph.addEdge(17, 8, 7);

        newGraph.addEdge(18, 0, 1);
        newGraph.addEdge(18, 3, 2);
        newGraph.addEdge(18, 10, 3);
        newGraph.addEdge(18, 14, 4);

        newGraph.addEdge(19, 11, 1);
        newGraph.addEdge(19, 7, 6);
        newGraph.addEdge(19, 2, 10);
        newGraph.addEdge(19, 24, 10);
        newGraph.addEdge(19, 25, 10);
        newGraph.addEdge(19, 9, 4);

        newGraph.addEdge(20, 16, 3);
        newGraph.addEdge(20, 21, 2);
        newGraph.addEdge(20, 26, 10);
        newGraph.addEdge(20, 1, 8);
        newGraph.addEdge(20, 12, 7);
        newGraph.addEdge(20, 8, 3);
        newGraph.addEdge(20, 27, 5);

        newGraph.addEdge(21, 15, 10);
        newGraph.addEdge(21, 26, 6);
        newGraph.addEdge(21, 20, 2);
        newGraph.addEdge(21, 16, 6);

        newGraph.addEdge(22, 3, 5);
        newGraph.addEdge(22, 4, 2);
        newGraph.addEdge(22, 5, 1);
        newGraph.addEdge(22, 10, 7);

        newGraph.addEdge(23, 15, 9);
        newGraph.addEdge(23, 6, 3);
        newGraph.addEdge(23, 1, 8);
        newGraph.addEdge(23, 26, 1);

        newGraph.addEdge(24, 25, 3);
        newGraph.addEdge(24, 19, 10);
        newGraph.addEdge(24, 2, 8);
        newGraph.addEdge(24, 5, 4);

        newGraph.addEdge(25, 28, 8);
        newGraph.addEdge(25, 9, 7);
        newGraph.addEdge(25, 19, 10);
        newGraph.addEdge(25, 24, 3);

        newGraph.addEdge(26, 21, 6);
        newGraph.addEdge(26, 15, 10);
        newGraph.addEdge(26, 23, 1);
        newGraph.addEdge(26,1 , 4);
        newGraph.addEdge(26, 20, 10);

        newGraph.addEdge(27, 16, 1);
        newGraph.addEdge(27, 20, 5);
        newGraph.addEdge(27, 8, 5);

        newGraph.addEdge(28, 17, 2);
        newGraph.addEdge(28, 12, 5);
        newGraph.addEdge(28, 9, 10);
        newGraph.addEdge(28, 25, 8);
        
        // Menampilkan  rute perjalanan kiky
        System.out.println("Hasil Perjalanan Kiky");
        newGraph.depthFirstSearchKecil("karang pule");

        //menampilkan rute perjalanan kaky
        System.out.println("Hasil Perjalanan Kaky");
        newGraph.depthFirstSearchBesar("monjok");
    }
}