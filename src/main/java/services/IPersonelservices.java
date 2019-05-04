package services;

import entity.Personel;

import java.util.List;

public interface IPersonelservices {
    void kaydet(Personel personel);

    List<Personel> personelListesiGetir();

}

