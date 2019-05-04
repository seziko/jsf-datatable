package entity;

import java.util.Date;
import java.util.Objects;

public class Personel extends Kisi{

    private Double maas;
    private Date iseGirisTarih;
    private String sicilNo;
    private String departman;
    private String unvan;


    public Personel(){

    }

    public Personel(String ad, String soyad, Date dogumTarihi, String tcNo, String telNo, Double maas, Date iseGirisTarih, String sicilNo, String departman, String unvan) {
        super(ad, soyad, dogumTarihi, tcNo, telNo);
        this.maas = maas;
        this.iseGirisTarih = iseGirisTarih;
        this.sicilNo = sicilNo;
        this.departman = departman;
        this.unvan = unvan;
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


}