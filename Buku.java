/**
 * kampus
 */
public class Buku{
    private String judul;
    private String kategori;
    private String penulis;
    
    public void setJudul(String j){
        judul = j;
    }
    public void setKategori(String k){
        kategori = k;
    }
    public void setPenulis(String p){
        penulis = p;
    }
    
    public String getJudul() {
        return judul;
    }
    public String getKategori() {
        return kategori;
    }
    public String getPenulis() {
        return penulis;
    }

    public void displayMessage(){
        System.out.println("Judul " + judul);
        System.out.println("Kategoti "+ kategori);
        System.out.println("Penulis "+ penulis);
     }
    
}