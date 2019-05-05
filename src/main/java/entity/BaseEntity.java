package entity;

import java.util.Date;

abstract class BaseEntity {

    private Long id;
    private Date olusturulmaTarihi;
    private Date guncellemeTarihi;
    private String olusturanKisi;
    private String kullaniciAdi;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getOlusturulmaTarihi() {
        return olusturulmaTarihi;
    }

    public void setOlusturulmaTarihi(Date olusturulmaTarihi) {
        this.olusturulmaTarihi = olusturulmaTarihi;
    }

    public Date getGuncellemeTarihi() {
        return guncellemeTarihi;
    }

    public void setGuncellemeTarihi(Date guncellemeTarihi) {
        this.guncellemeTarihi = guncellemeTarihi;
    }

    public String getOlusturanKisi() {
        return olusturanKisi;
    }

    public void setOlusturanKisi(String olusturanKisi) {
        this.olusturanKisi = olusturanKisi;
    }

    public void setKullaniciAdi (String kullaniciAdi){
        this.kullaniciAdi = kullaniciAdi;
    }
}

