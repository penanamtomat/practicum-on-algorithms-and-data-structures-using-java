/*
 * pada file ini dibuat class graph yang digunakan untuk menambahkan
 * vertex dan rute pada graph serta beberapa method lainnya seperti
 * DFS dan mencari rute di dalam graph
 */

//file berada di package jurnalno1
package jurnalno1;

//membuat class graph
public class graph {
    //inisialisasi varibel untuk simpan ukuran vertex
    int ukuran;
    //inisialisasi array untuk menyimpan vertex
    graphNode[] nodes;

    //membuat constructor untuk graph dengan parameter ukuran
    public graph(int ukuran) {
        this.ukuran = ukuran;
        //inisialisasi contsructor graphNode dengan ukuran dari array
        this.nodes = new graphNode[ukuran];
    }

    /*membuat method untuk menambahkan vertex dengan parameter
    departure(tempat asal) dan indeks*/
    public void addVertex(String departure, int indeks) {
        // inisialisasi node baru dengan parameter departure, route, dan next
        graphNode newnNode = new graphNode(departure, 0, null);
        //menyimpan nilai node ke array sesuai indeks yg ditentukan
        nodes[indeks] = newnNode;
    }
    
    /*membuat method untuk menambahkan rute dengan parameter asal, tujuan, dan jarak*/
    public void addEdge(int asal, int tujuan, int jarak ) {
        //inisialisasi node asal dan tujuan dengan array
        graphNode nodeAsal = nodes[asal];
        graphNode nodeTujuan = nodes[tujuan];
        //membuat node baru untuk vertex tujuan dan bobot rutenya
        graphNode edge = new graphNode(nodeTujuan.departure, jarak, null);

        /*melakukan pengecekan untuk menambahkan jalur vertex asal ke vertex tujuan*/ 
        if(nodeAsal.next == null){
            //jika node asal null, maka node asal ditambah sebagai vertex baru
            nodeAsal.next = edge;
        }
        else{
            //jika tidakl, maka node yang ada diatur menuju node selanjutnya
            graphNode current = nodeAsal.next;
            while(current.next != null){
                current = current.next;
            }
            current.next = edge;
        }
    }

    //membuat method untuk menampilkan value dari graph
    public void cetakGraph() {
        //melakukan perulangan untuk setiap vertex
        for(int i = 0; i < ukuran; i++){
            //mencetak nama vertex
            System.out.print(nodes[i].departure + " -> ");
            //mencetak rute yang terhubung
            graphNode current = nodes[i].next;
            while(current != null){
                System.out.print(current.departure + "(" + current.route + ") -> ");
                current = current.next;
            }
            //mencetak null untuk menyelesaikan vertex
            System.out.println("null");
        }
    }

    //membuat method untuk mencari indeks setiap vertex
    public int cariIndeks(String departure){
         // Melakukan perulangan untuk setiap vertex
         for (int i = 0; i < ukuran; i++) {
            // melakukan pengecekan apakah nama vertex sama dengan nama node
            if (nodes[i].departure.equals(departure)) {
            // Mengembalikan indeks dari node
            return i;
            }
        }
        // Mengembalikan -1 jika tidak ditemukan
        return -1;
    }

    //membuat method untuk mencari jarak terpendek
    private graphNode cariJarakTerpendek(graphNode node, boolean[] visited) {
        //inisialisasi current, jarak vertex dan rute terpendek
        graphNode current = node.next;
        graphNode jarakVertexTerpendek = null;
        int ruteTerpendek = Integer.MAX_VALUE;

        //melakukan perulangan untuk pencarian rute terpendek
        while (current != null) {
            //melakukan pengecekan untuk membandingkan jarak dan rute
            if (!visited[cariIndeks(current.departure)] && current.route < ruteTerpendek) {
                ruteTerpendek = current.route;
                jarakVertexTerpendek = current;
            }
            current = current.next;
        }

        return jarakVertexTerpendek;
    }

    //membuat method untuk mncari vertex terkecil menggunakan DFS
    public void depthFirstSearchKecil(String mulai){
        // Membuat objek stack untuk menyimpan vertex yang akan dikunjungi
        stack stack = new stack();
        // Membuat array boolean untuk menyimpan status kunjungan vertex
        boolean[] visited = new boolean[ukuran];

        // Menginisialisasi array boolean dengan false
        for (int i = 0; i < ukuran; i++) {
            visited[i] = false;
        }

        // Menambahkan vertex awal ke dalam stack dan jalur
        stack.push(mulai);
        String jalur = mulai + " => ";
        visited[cariIndeks(mulai)] = true;

        // Melakukan perulangan selama stack tidak kosong
        while (!stack.isEmpty()) {
            // Mengambil vertex dari stack
            String departure = stack.peek();
            // Mencari node yang sesuai dengan nama vertex
            graphNode node = nodes[cariIndeks(departure)];

            // Mendapatkan node tetangga dengan weight terkecil
            graphNode jarakVertexTerpendek = cariJarakTerpendek(node, visited);
            if (jarakVertexTerpendek != null) {
                stack.push(jarakVertexTerpendek.departure);
                jalur += jarakVertexTerpendek.departure + " => ";
                visited[cariIndeks(jarakVertexTerpendek.departure)] = true;
            } else {
                stack.pop();
            }
        }

        // Menampilkan jalur
        System.out.println("Jalur Kyky : " + jalur + "Selesai");
        System.out.println();
    }

    //membuat method untuk mencari jarak terpanjang
    private graphNode cariJarakTerpanjang(graphNode node, boolean[] visited) {
        //inisialisasi current, jarak vertex dan rute terpanjang
        graphNode current = node.next;
        graphNode jarakVertexTerpanjang = null;
        int ruteTerpanjang = Integer.MIN_VALUE;

        //melakukan perulangan untuk pencarian rute terpanjang
        while (current != null) {
            //melakukan pengecekan untuk membandingkan jarak dan rute
            if (!visited[cariIndeks(current.departure)] && current.route > ruteTerpanjang) {
                ruteTerpanjang = current.route;
                jarakVertexTerpanjang = current;
            }
            current = current.next;
        }

        return jarakVertexTerpanjang;
    }

    //membuat method untuk mencari vertex terbesar menggunakan DFS
    public void depthFirstSearchBesar(String mulai){
        // Membuat objek stack untuk menyimpan vertex yang akan dikunjungi
        stack stack = new stack();
        // Membuat array boolean untuk menyimpan status kunjungan vertex
        boolean[] visited = new boolean[ukuran];

        // Menginisialisasi array boolean dengan false
        for (int i = 0; i < ukuran; i++) {
            visited[i] = false;
        }

        // Menambahkan vertex awal ke dalam stack dan jalur
        stack.push(mulai);
        String jalur = mulai + " ";
        visited[cariIndeks(mulai)] = true;

        // Melakukan perulangan selama stack tidak kosong
        while (!stack.isEmpty()) {
            // Mengambil vertex dari stack
            String departure = stack.peek();
            // Mencari node yang sesuai dengan nama vertex
            graphNode node = nodes[cariIndeks(departure)];

            // Mendapatkan node tetangga dengan weight terbesar
            graphNode jarakVertexTerpanjang = cariJarakTerpanjang(node, visited);
            if (jarakVertexTerpanjang != null) {
                stack.push(jarakVertexTerpanjang.departure);
                jalur += jarakVertexTerpanjang.departure + " => ";
                visited[cariIndeks(jarakVertexTerpanjang.departure)] = true;
            } else {
                stack.pop();
            }
        }
        
        // Menampilkan jalur
        System.out.println("Jalur Kaky : " + jalur + "Selesai");
        System.out.println();
    }
}