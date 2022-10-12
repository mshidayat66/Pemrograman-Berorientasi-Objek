
public class HandPhone {
    String jenis_hp;
    int tahun_pembuatan;
    
    //String public setDataHP(String jenis_hp, int tahun_pembuatan){
    public void setDataHP(String jenis_hp, int tahun_pembuatan){ //Hapus String dan tambahkan void
        //jenis_hp = jenis_hp;
        this.jenis_hp = jenis_hp; //Tambahkan This di depan agar program tidak bingung
        //tahun_pembuatan = tahun_pembuatan;
        this.tahun_pembuatan = tahun_pembuatan; //Tambahkan This di depan agar program tidak bingung
    }
    
    String getJenisHP(){
        return jenis_hp; //Tambahkan return value, karena getter method memerlukan return value
    }
    
    //String getTahunPembuatan(){
    int getTahunPembuatan(){ //Ganti menjadi int karena harus sesuai dengan atribut global
        return tahun_pembuatan; //Tambahkan return value, karena getter method memerlukan return value
    }
    
    //public static main void(String args[]){
    public static void main(String[] args){ //Pindahkan main setelah void dan pindahkan "[]" setelah String
        HandPhone hp = new HandPhone();
        //hp.setDataHP(jenis_hp, tahun_pembuatan);
        hp.setDataHP("Xiaomi", 2022); //Isi jenis dan tahun HP
        //hp.getJenisHP()
        System.out.println("Jenis HP : " + hp.getJenisHP());
        //hp.getTahunPembuatan()
        System.out.println("Jenis HP : " + hp.getTahunPembuatan());
    }
}
