/*
 * pada file ini terdapat class binaryTree yang digunakan untuk merepresentasikan
 * struktur pohon. Di dalamnya terdapat method binary tree dan method DFS (Depth-
 * First Search) yaitu method yang digunakan untuk pencarian dalam struktur stack
 */

//file berada di package soalno1
package soalno1;

//membuat class binaryTree
public class binaryTree {
    //inisialisasi variabel root menyimpan informasi tentang node root
    Node root;
    //membuat constructor binaryTree digunakan untuk membuat objek Tree
    public binaryTree() {
        root = null;
    }
    //method addRoot yang digunakan untuk menambahkan node akar ke pohon.
    public void addRoot(String nama, linkedList list) {
        //lakukan pengecekan, jika root masih null
        if (root == null) {
            //maka buat node baru sebagai root
            root = new Node(nama, list);
        } else {
            //jika tidak, tampilkan pesan bahwa root sudah ada.
            System.out.println("Root node sudah terisi");
        }
    }
    //method addKanan yang digunakan untuk menambahkan node sebelah kanan dari suatu node parent.
    public void addKanan(Node parent, String nama, linkedList list) {
        //lakukan pengecekan, jika node sebelah kanan masih null
        if(parent.kanan == null){
            //maka buat node baru sebagai node sebelah kanan
            parent.kanan = new Node(nama, list);
            parent.kanan.parent = parent;
        } else {
            //jika tidak, tampilkan pesan bahwa node sebelah kanan sudah ada.
            System.out.println("anak kanan sudah terisi");
        }
    }

    //method addKiri digunakan untuk menambahkan node sebelah kiri dari suatu node parent.
    public void addKiri(Node parent, String nama, linkedList list) {
        //lakukan pengecekan, jika node sebelah kiri masih null
        if(parent.kiri == null){
            //maka buat node baru sebagai node sebelah kiri
            parent.kiri = new Node(nama, list);
            parent.kiri.parent = parent;
        } else {
            // Jika tidak, tampilkan pesan bahwa node sebelah kiri sudah ada.
            System.out.println("anak kiri sudah terisi");
        }
    }

    // Metode preOrder yang digunakan untuk melakukan traversal pre-order pada pohon serta mencetak informasi node.
    void preOrder(Node node) {
        //lakukan pengecekan, jika node tidak null
        if (node != null) {
            //maka cetak informasi nama node dan nama node sebelah kiri (jika ada).
            System.out.print(node.nama + " : ");
            if (node.kiri != null) {
                System.out.print(node.kiri.nama + ", ");
            } else {
                System.out.println("-");
            }
            // Cetak informasi nama node sebelah kanan (jika ada).
            if (node.kanan != null) {
                System.out.println(node.kanan.nama);
            } else{
                System.out.print("");
            }
            //melakukan rekursif untuk melanjutkan traversal pre-order pada node sebelah kiri dan sebelah kanan.
            preOrder(node.kiri);
            preOrder(node.kanan);
        }
    }

    /*method searchHighestPower yang digunakan untuk mencari dan menampilkan 
    pahlawan dengan power tertinggi di struktur tree*/
   public void searchHighestPower(String earth) {
    //inisialisasi variabel earthNode dengan objek dari findearth
    Node earthNode = findEarth(root, earth);

    //lakukan pengecekan, jika earthNode tidak null
    if (earthNode != null) {
        //maka inisialisasi variabel highestPowerHero sebagai objek baru dari findHighestPowerHero
        nodeList highestPowerHero = findHighestPowerHero(earthNode.list.head, null);
        
        //jika highestPowerHero tidak null
        if (highestPowerHero != null) {
            //maka cetak informasi pahlawan dengan power tertinggi
            System.out.println(earth + " : " + highestPowerHero.nama + " - "+ highestPowerHero.bobot);
        } 
        else {
            //jika tidak, tampilkan pesan bahwa pahlawan dengan power tertinggi tidak ditemukan
            System.out.println("Tidak ada pahlawam di " + earth);
        }
    } 
    else {
        //jika tidak, tampilkan pesan bahwa Earth tidak ditemukan
        System.out.println("Earth tidak ditemukan: " + earth);
    }
}

    //method findHighestPowerHero yang digunakan untuk mencari pahlawan dengan power tertinggi di linked list
    private nodeList findHighestPowerHero(nodeList node, nodeList currentHighestPowerHero) {
        if (node == null) {
            return currentHighestPowerHero;
        }

        //melakukan perbandingan dan pembaruan pahlawan dengan power tertinggi
        if (currentHighestPowerHero == null || node.bobot > currentHighestPowerHero.bobot) {
            currentHighestPowerHero = node;
        }

        //lakukan rekursif untuk melanjutkan pencarian ke node berikutnya.
        return findHighestPowerHero(node.getNext(), currentHighestPowerHero);
    }

    //method findEarth(Node node, String earth) digunakan untuk mencari node dengan nama Earth tertentu
    private Node findEarth(Node node, String earth) {
        if (node == null) {
            return null;
        }

        if (node.nama.equals(earth)) {
            return node;
        }

        //lakukan rekursif untuk melanjutkan pencarian di subtree kiri dan kanan.
        Node kiriResult = findEarth(node.kiri, earth);
        Node kananResult = findEarth(node.kanan, earth);

        //me-return class dengan nilai tidak sama null
        return kiriResult != null ? kiriResult : kananResult;
    }
}