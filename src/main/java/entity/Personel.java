package entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Personel")
public class Personel extends Kisi{

    @Column(name = "maas")
    private Double maas;

    @Temporal(TemporalType.DATE)
    @Column(name = "ise_giris_tarihi")
    private Date iseGirisTarih;

    @Column(name = "sicil_no")
    private String sicilNo;

    @Column(name = "departman")
    private String departman;

    @Column(name = "unvan")
    private String unvan;

    @Column(name = "kullanici_adi")
    private String kullaniciAdi;


    public Personel(){

    }

    public Personel(String ad, String soyad, Date dogumTarihi, String tcNo, String telNo, Double maas, Date iseGirisTarih, String sicilNo, String departman, String unvan) {
        super(ad, soyad, dogumTarihi, tcNo, telNo);
        this.maas = maas;
        this.iseGirisTarih = iseGirisTarih;
        this.sicilNo = sicilNo;
        this.departman = departman;
        this.unvan = unvan;
        this.kullaniciAdi = kullaniciAdi;
    }

    public Double getMaas() {
        return maas;
    }

    public void setMaas(Double maas) {
        this.maas = maas;
    }

    public Date getIseGirisTarih() {
        return iseGirisTarih;
    }

    public void setIseGirisTarih(Date iseGirisTarih) {
        this.iseGirisTarih = iseGirisTarih;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi (String kullaniciAdi) {this.kullaniciAdi = kullaniciAdi;}



}