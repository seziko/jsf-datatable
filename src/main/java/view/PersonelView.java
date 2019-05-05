package view;

import entity.Personel;
import services.PersonelService;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
public class PersonelView {

    private Personel personel;
    private PersonelService personelServices;
    private List<Personel> personelList;
    private List<String> departmanList;

    @PostConstruct
    public void init(){
     personel= new Personel();
     personelServices= PersonelService.getInstance();
     personelList = new ArrayList<>();
     departmanList = new ArrayList<>();

     departmanList.add("Arge");
     departmanList.add("İnsan Kaynakları");
     departmanList.add("Yönetim");
     departmanList.add("Mali İşler");
     departmanList.add("Hizmetli");

    }

    /**
     * Kaydet butonuna tıklandığında çağırılacak method
     * ActionListener ile asyn (asenkron) olarak çağırılıyor.
     */
    public void onKaydet() {

        if (personel.getAd()!=null){
            personelServices.kaydet(personel);
            personelList=personelServices.personelListesiGetir();
            FacesContext.getCurrentInstance().addMessage(null,new FacesMessage("Kayıt işlemi başarılı..",null));
        }else {
            FacesContext.getCurrentInstance().addMessage(null,new FacesMessage("Kayıt işlemi başarısız.. Zorunlu alanları kontrol ediniz..",null));
        }
    }

    public Personel getPersonel() {
        return personel;
    }

    public void setPersonel(Personel personel) {
        this.personel = personel;
    }

    public List<Personel> getPersonelList() {
        return personelList;
    }

    public void setPersonelList(List<Personel> personelList) {
        this.personelList = personelList;
    }

    public PersonelService getPersonelServices() {
        return personelServices;
    }

    public void setPersonelServices(PersonelService personelServices) {
        this.personelServices = personelServices;
    }

    public List<String> getDepartmanList() {
        return departmanList;
    }

    public void setDepartmanList(List<String> departmanList) {
        this.departmanList = departmanList;
    }


}
