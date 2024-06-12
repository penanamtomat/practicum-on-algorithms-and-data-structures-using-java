/*
 * pada file ini terdapat class Run yang digunakan untuk mencetak semua data
 * yang ditambahkan sesuai dengan soal jurnal
 */

//file berada di package soalno2
package soalno2;

//import class binaryTree dari soal no1 untuk memanggil objek binaryTree
import soalno1.binaryTree;

//membuat class Run
public class Run {
    //membuat method main
    public static void main(String[] args) {
        // Membuat objek LL untuk masing-masing "Earth" dengan nomor versi yang berbeda.
        LL earth616 = new LL();
        LL earth1610 = new LL();
        LL earth295 = new LL();
        LL earth18119 = new LL();
        LL earth1228 = new LL();
        LL earth65 = new LL();
        LL earth199999 = new LL();
        LL earth2149 = new LL();
        LL earth807128 = new LL();
        LL earth311 = new LL();
        LL earth801 = new LL();
        LL earth982 = new LL();
        LL earth6311 = new LL();
        LL earth1611 = new LL();
        LL earth5631 = new LL();

        // menanmbahkan hero-hero ke earth616
        earth616.add("Spider-Man", 85);
        earth616.add("Iron Man", 92);
        earth616.add("Captain America", 88);
        earth616.add("Thor", 95);
        earth616.add("Hulk", 97);
        earth616.add("Black Widow", 82);
        earth616.add("Hawkeye", 80);
        earth616.add("Mr. fantastic", 90);

        // menanmbahkan hero-hero ke earth1610
        earth1610.add("Spider-Milles", 87);
        earth1610.add("Wolverine", 92);
        earth1610.add("Iron Man", 89);
        
        // menanmbahkan hero-hero ke earth295
        earth295.add("Cyclops", 89);
        earth295.add("Wolverine", 92);

        // menanmbahkan hero-hero ke earth8119
        earth18119.add("Spider-Miles", 88);
        earth18119.add("Spider-B.Parker", 86);
        earth18119.add("Spder-Gwen", 81);
        earth18119.add("Spider-Ham", 80);

        // menanmbahkan hero-hero ke earth1228
        earth1228.add("Mr.Fantastic", 91);
        earth1228.add("Invisible Woman", 84);
        earth1228.add("Human Torch", 87);
        earth1228.add("The Thing", 89);

        // menanmbahkan hero-hero ke earth 65
        earth65.add("Spider-Gwen", 86);
        earth65.add("Spider-Woman", 85);

        // menanmbahkan hero-hero ke earth199999
        earth199999.add("Iron Man", 89);
        earth199999.add("Captain America", 87);
        earth199999.add("Thor", 91);
        earth199999.add("Hulk", 96);
        earth199999.add("Scarlet Witch", 99);

        // menanmbahkan hero-hero ke earth2149
        earth2149.add("Scarlet Witch", 98);
        earth2149.add("Captain America", 91);
        earth2149.add("Iron Man", 84);

        // menanmbahkan hero-hero ke earth807128
        earth807128.add("Wolverine", 95);
        earth807128.add("Hawkeye", 89);

        // menanmbahkan hero-hero ke earth311
        earth311.add("Spider Man", 92);
        earth311.add("Captain America", 89);
        earth311.add("Black Widow", 82);

        // menanmbahkan hero-hero ke earth801
        earth801.add("Iron Man", 85);
        earth801.add("Captain America", 88);
        earth801.add("Doctor Strange", 83);

        // menanmbahkan hero-hero ke earth982
        earth982.add("Spider Girl", 79);

        // menanmbahkan hero-hero ke earth6311
        earth6311.add("Iron Man", 87);
        earth6311.add("Daredevil", 83);

        // menanmbahkan hero-hero ke earth1611
        earth1611.add("Iron Man", 87);
        earth1611.add("Captain America", 90);
        earth1611.add("Thor", 94);
        earth1611.add("Hulk", 98);

        // menanmbahkan hero-hero ke earth5631
        earth5631.add("Black Panther", 88);
        earth5631.add("Scarlet Witch", 90);

        System.out.println("Highest Power Hero In All Unniverse :");
        //inisialisasi objek binaryTree
        binaryTree tree = new binaryTree();
        // Untuk Melakukan pencarian untuk mendapatkan hero power tertinggi dari masing-masing earth
        tree.searchHighestPower("Earth-616");
        tree.searchHighestPower("Earth-1610");
        tree.searchHighestPower("Earth-295");
        tree.searchHighestPower("Earth-18119");
        tree.searchHighestPower("Earth-1228");
        tree.searchHighestPower("Earth-65");
        tree.searchHighestPower("Earth-199999");
        tree.searchHighestPower("Earth-2149");
        tree.searchHighestPower("Earth-807128");
        tree.searchHighestPower("Earth-311");
        tree.searchHighestPower("Earth-801");
        tree.searchHighestPower("Earth-982");
        tree.searchHighestPower("Earth-6311");
        tree.searchHighestPower("Earth-1611");
        tree.searchHighestPower("Earth-5631");

    }
}