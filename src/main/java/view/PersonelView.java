package view;

import entity.Personel;
import org.primefaces.event.SelectEvent;
import services.PersonelService;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ManagedBean
public class PersonelView {

    private Personel personel;
    private PersonelService personelServices;
    private List<Personel> personelList;
    private List<String> departmanList;
    private Map<Integer,String> unvanMap;
    private String unvanKey;


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

     unvanMap = new HashMap<>();
     unvanMap.put(1,"Uzman");
     unvanMap.put(2,"Yönetici");
     unvanMap.put(3,"Kıdemli");
     unvanMap.put(4,"Asistan");
     unvanMap.put(5,"Stajyer");
     unvanMap.put(6,"Proje Yöneticisi");

     for (Map.Entry<Integer,String> entry:unvanMap.entrySet()){
         entry.getKey();
         entry.getValue();
     }

    }

    /**
     * Kaydet butonuna tıklandığında çağırılacak method
     * ActionListener ile asyn (asenkron) olarak çağırılıyor.
     */
    public void onKaydet() {

        if (personel.getAd()!=null){
            personelServices.kaydet(personel);

            personelList=personelServices.personelListesiGetir();
            FacesContext.getCurrentInstance()
                    .addMessage(null,new FacesMessage("Kayıt işlemi başarılı..",null));
        }else {
            FacesContext.getCurrentInstance()
                    .addMessage(null,new FacesMessage("Kayıt işlemi başarısız.. Zorunlu alanları kontrol ediniz..",null));
        }
    }

    public void onUnvanSelected(SelectEvent selectEvent){

        unvanKey= (String) selectEvent.getObject();

        System.out.println(unvanKey);

        String tempUnvan=unvanMap.get(unvanKey);

        switch (tempUnvan){
            case "Stajyer":
                personel.setMaas(1000.0);
                break;
            case "Proje Yöneticisi":
                personel.setMaas(5000.0);
                break;
                default:
                    personel.setMaas(2200.00);
                    break;

        }

        FacesContext.getCurrentInstance().addMessage(null,new FacesMessage("Ünvan Seçildi"));


    }

    public void departmanSelected(SelectEvent selectEvent){
        String tempDepartman= (String) selectEvent.getObject();
        switch (tempDepartman){
            case "Arge":
                unvanMap.clear();
                unvanMap.put(3,"Kıdemli");
                unvanMap.put(6,"Proje Yöneticisi");
                break;
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

    public Map<Integer, String> getUnvanMap() {
        return unvanMap;
    }

    public void setUnvanMap(Map<Integer, String> unvanMap) {
        this.unvanMap = unvanMap;
    }

    public String getUnvanKey() {
        return unvanKey;
    }

    public void setUnvanKey(String unvanKey) {
        this.unvanKey = unvanKey;
    }
}
