/*
 * pada file ini, dibuat class nodeStack yang digunakan untuk
 * menyimpan node/data dari queue
 */

//file berada di package JurnalNo2
package JurnalNo2;

//membuat class nodeStack
public class nodeStack {
    /*membuat variabel order dengan tipe data String, berfuhgsi untuk
    menyimpan pesanan*/
    String order;

    /*inisialisasi variabel bawah dengan tipe data nodeStack, berfungsi untuk
    mengarahkan node tumpukan berada di paling bawah*/
    nodeStack bawah;

    /*membuat constructor nodeStack dengan parameter dari variabel order*/
    public nodeStack(String order) {
        /*terdapat variabel constructor dengan inisialisasi nilai order */
        this.order = order;
        /*terdapat variabel constructor dengan inisialisasi nilai bawah = null */
        this.bawah = null;
    }

    /*Method getOrder berfungsi mengembalikan objek String yang 
    mewakili nilai variabel instan pesanan. */
    public String getOrder() {
        return order;
    }

    /*Method getBawah berfungsi mengembalikan objek kelas nodeStack. 
    Objek yang dikembalikannya adalah variabel instance bawah dari objek saat ini. */
    public nodeStack getBawah() {
        return bawah;
    }

    /*Method setBawah digunakan untuk mengatur nilai variabel 
    instance bawah dari objek nodeStack. Metode ini mengambil 
    objek nodeStack sebagai argumen dan menugaskannya ke variabel bawah. */
    public void setBawah(nodeStack bawah) {
        this.bawah = bawah;
    }
}
