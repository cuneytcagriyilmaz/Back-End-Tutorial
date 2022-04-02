package Applications.KitapSiralayici;

public class Book {
    private String name;
    private int sayfaSayisi;
    private String yazarAdi;
    private String yayinTarihi;

    public Book(String name, int sayfaSayisi, String yazarAdi, String yayinTarihi){
        this.name=name;
        this.sayfaSayisi=sayfaSayisi;
        this.yazarAdi=yazarAdi;
        this.yayinTarihi=yayinTarihi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(int sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi;
    }

    public String getYayinTarihi() {
        return yayinTarihi;
    }

    public void setYayinTarihi(String yayinTarihi) {
        this.yayinTarihi = yayinTarihi;
    }
}
