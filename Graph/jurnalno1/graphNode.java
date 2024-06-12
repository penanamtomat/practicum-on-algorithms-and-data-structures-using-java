/*
 * pada file ini terdapat class graphNode yang digunakan untuk inisialisasi
 * nilai dan variabel pada vertex yang akan digunakan pada graph
 */

//file berada di package jurnalno1
package jurnalno1;

//membuat class graphNode
public class graphNode {
    //inisialisasi variabel departure dgn tipe string
    String departure;
    //inisialisasi variabel route dgn tipe integer
    int route;
    //inisialisasi variabel next dgn tipe graphNode
    graphNode next;

    //membuat constructor dengan parameter departure, route, dan next
    public graphNode(String departure, int route, graphNode next) {
        this.departure = departure;
        this.route = route;
        this.next = null;
    }
}