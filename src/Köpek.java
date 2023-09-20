public class Köpek {
    private String isim;
    private String cins;
    private int yas;

    public  Köpek(String isim,String cins,int yas){
        this.isim = isim;
        this.cins = cins;
        this.yas= yas;

    }

    public String getIsim(){
        return  this.isim;
    }
    public String getCins(){
        return  this.cins;
    }
    public int getYas(){
        return  this.yas;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setCins(String cins) {
        this.cins = cins;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}
