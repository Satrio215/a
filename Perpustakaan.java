import java.util.ArrayList;
import java.util.List;

class Penulis {
    private String nama;

    public Penulis(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

class Buku {
    private String judul;
    private String kategori;
    private List<Penulis> penulisList;

    public Buku(String judul, String kategori) {
        this.judul = judul;
        this.kategori = kategori;
        this.penulisList = new ArrayList<>();
    }

    public void tambahPenulis(Penulis penulis) {
        penulisList.add(penulis);
    }

    public String getJudul() {
        return judul;
    }

    public String getKategori() {
        return kategori;
    }

    public List<Penulis> getPenulisList() {
        return penulisList;
    }
}

public class Perpustakaan {
    public static void main(String[] args) {
        // Membuat penulis
        Penulis penulis1 = new Penulis("Penulis 1");
        Penulis penulis2 = new Penulis("Penulis 2");
        Penulis penulis3 = new Penulis("Penulis 3");

        // Membuat buku-buku
        Buku buku1 = new Buku("Buku Teknologi 1", "Teknologi");
        buku1.tambahPenulis(penulis1);
        Buku buku2 = new Buku("Buku Teknologi 2", "Teknologi");
        buku2.tambahPenulis(penulis2);
        Buku buku3 = new Buku("Buku Teknologi 3", "Teknologi");
        buku3.tambahPenulis(penulis3);
        Buku buku4 = new Buku("Buku Teknologi 4", "Teknologi");
        buku4.tambahPenulis(penulis1);
        Buku buku5 = new Buku("Buku Teknologi 5", "Teknologi");
        buku5.tambahPenulis(penulis2);

        // Menampilkan informasi buku-buku
        System.out.println("Daftar buku kategori Teknologi:");
        tampilkanInfoBuku(buku1);
        tampilkanInfoBuku(buku2);
        tampilkanInfoBuku(buku3);
        tampilkanInfoBuku(buku4);
        tampilkanInfoBuku(buku5);
    }

    public static void tampilkanInfoBuku(Buku buku) {
        System.out.println("Judul: " + buku.getJudul());
        System.out.println("Kategori: " + buku.getKategori());
        System.out.println("Penulis:");
        for (Penulis penulis : buku.getPenulisList()) {
            System.out.println("- " + penulis.getNama());
        }
        System.out.println();
    }
}
