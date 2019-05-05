package entity;

import javax.persistence.*;
import java.util.Date;


//    Entitiyler herzaman için baseEntitiy sınıfını extend edeceğinden dolayı super sınıf olarak işratlendi.
//    Buradaki tablo oluşutulma stratejisi alt sınıflarına yansıtılacak..

@MappedSuperclass
abstract class BaseEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "olusturulma_tarihi")
    private Date olusturulmaTarihi;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "guncelleme_tarihi")
    private Date guncellemeTarihi;

    @Column(name = "olusturan_kisi")
    private String olusturanKisi;

    @Column(name = "kullanici_adi")
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

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }
}

