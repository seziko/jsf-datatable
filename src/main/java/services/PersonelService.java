package services;

import entity.Personel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonelService implements IPersonelservices{

    private List<Personel> personelList=new ArrayList<Personel>();
    private Long idGenerator=1L;
    private static PersonelService instance;



    /**
     * PerseonelService nesnesinin birkere new anahtar sözcüğü ile oluşturulması için
     * Singleton Design patter uygulayacak
     * Nesnenin birkere oluşmasından sorumlu tasarım desenidir.
     *
     */

    public static PersonelService getInstance() {
       if(instance==null){
           instance=new PersonelService();
       }
       return instance;
    }





    public void kaydet(Personel personel) {

        if (personel!=null){

            Personel yeniPersonel=new Personel();

            yeniPersonel.setId(idGenerator);
            yeniPersonel.setDepartman(personel.getDepartman());
            yeniPersonel.setIseGirisTarih(personel.getIseGirisTarih());
            yeniPersonel.setMaas(personel.getMaas());
            yeniPersonel.setSicilNo(personel.getSicilNo());
            yeniPersonel.setUnvan(personel.getUnvan());
            yeniPersonel.setOlusturanKisi("Developer");
            yeniPersonel.setOlusturulmaTarihi(new Date());
            yeniPersonel.setGuncellemeTarihi(null);
            yeniPersonel.setAd(personel.getAd());
            yeniPersonel.setSoyad(personel.getSoyad());
            yeniPersonel.setDogumTarihi(personel.getDogumTarihi());
            yeniPersonel.setTcNo(personel.getTcNo());
            yeniPersonel.setTelNo(personel.getTelNo());

            idGenerator++;

            personelList.add(yeniPersonel);


        }


    }

    public List<Personel> personelListesiGetir() {
        return personelList;
    }
}
