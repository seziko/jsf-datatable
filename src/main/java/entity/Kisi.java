package entity;

import java.util.Date;

public class Kisi extends BaseEntity{
    private String ad;
    private String soyad;
    private Date dogumTarihi;
    private String tcNo;
    private String telNo;


    public Kisi(){

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
