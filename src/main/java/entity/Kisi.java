package entity;

import javax.persistence.*;
import java.util.Date;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Table(name = "kisi")
public class Kisi extends BaseEntity {

    @Column(name = "ad", nullable = false, length = 30)
    private String ad;

    @Column(name = "soyad", nullable = false, length = 30)
    private String soyad;

    @Temporal(TemporalType.DATE)
    @Column(name = "dogum_tarihi", nullable = false)
    private Date dogumTarihi;

    @Column(name = "tc_no", nullable = false, length = 11)
    private String tcNo;

    @Column(name = "tel_no", length = 16)
    private String telNo;


    public Kisi() {

    }

    public Kisi(String ad, String soyad, Date dogumTarihi, String tcNo, String telNo) {
        this.ad = ad;
        this.soyad = soyad;
        this.dogumTarihi = dogumTarihi;
        this.tcNo = tcNo;
        this.telNo = telNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public Date getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(Date dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }


}
