
public class SimulasiMotorSonic {
    boolean nyala = false;
    int perseneling = 0;
    int kecepatan = 0;

    public void dinyalakan(){
        if(nyala == true){
            System.out.println("Motor Sudah Dinyalakan");
        }
        else{
            System.out.println("Motor Berhasil Dinyalakan");
            nyala = true;
        }
    }
    
    public void dimatikan(){
        if(nyala == false){
            System.out.println("Motor Sudah Mati");
        }
        else{
            System.out.println("Motor Berhasil Dimatikan");
            nyala = false;
        }
    }
    
    public void tambah_perseneling(){
        if(perseneling <6){
            perseneling++;
            System.out.println("Gigi : " + perseneling);
        }
        else if(perseneling >=6){
            perseneling = 0;
            System.out.println("Gigi : " + perseneling);
        }
    }
    
    public void kurang_perseneling(){
        if(perseneling >0){
            perseneling--;
            System.out.println("Gigi : " + perseneling);
        }
        else if(perseneling <=0){
            perseneling=0;
            System.out.println("Gigi : " + perseneling);
        }
    }
    
    public void tambah_kecepatan(int jumlah_kecepatan){
        if(nyala=true){
            if(perseneling == 0){
                System.out.println("Perseneling dalam keadaan netral");
            }
            else if(perseneling == 1){
                if(kecepatan + jumlah_kecepatan > 10){
                    System.out.println("Kecepatan anda akan melebihan batas maksimal kecepatan gigi 1");
                }
                else{
                    kecepatan += jumlah_kecepatan;
                }
                System.out.println("Kecepatan : " + kecepatan);
            }
            else if(perseneling == 2){
                if(kecepatan + jumlah_kecepatan > 25){
                    System.out.println("Kecepatan anda akan melebihan batas maksimal kecepatan gigi 2");
                }
                else{
                    kecepatan += jumlah_kecepatan;
                }
                System.out.println("Kecepatan : " + kecepatan);
            }
            else if(perseneling == 3){
                if(kecepatan + jumlah_kecepatan > 50){
                    System.out.println("Kecepatan anda akan melebihan batas maksimal kecepatan gigi 3");
                }
                else{
                    kecepatan += jumlah_kecepatan;
                }
                System.out.println("Kecepatan : " + kecepatan);
            }
            else if(perseneling == 4){
                if(kecepatan + jumlah_kecepatan > 75){
                    System.out.println("Kecepatan anda akan melebihan batas maksimal kecepatan gigi 4");
                }
                else{
                    kecepatan += jumlah_kecepatan;
                }
                System.out.println("Kecepatan : " + kecepatan);
            }
            else if(perseneling == 5){
                if(kecepatan + jumlah_kecepatan > 100){
                    System.out.println("Kecepatan anda akan melebihan batas maksimal kecepatan gigi 5");
                }
                else{
                    kecepatan += jumlah_kecepatan;
                }
                System.out.println("Kecepatan : " + kecepatan);
            }
            else if(perseneling == 6){
                if(kecepatan + jumlah_kecepatan > 150){
                    System.out.println("Kecepatan anda akan melebihan batas maksimal kecepatan gigi 6");
                }
                else{
                    kecepatan += jumlah_kecepatan;
                }
                System.out.println("Kecepatan : " + kecepatan);
            }
        }
        else{
            System.out.println("Motor Belum Menyala");
        }
    }
    
    public void kurang_kecepatan(int jumlah_kecepatan){
        if(nyala=true){
            kecepatan -= jumlah_kecepatan;
            System.out.println("Kecepatan dikurangi " + jumlah_kecepatan);
            System.out.println("kecepatan : " + kecepatan);
            if(kecepatan <=0){
                System.out.println("Tidak Bisa Dikurangi");
        }
        }
    }
    
    public void InfoMotor(){
        if(kecepatan >=0 && kecepatan <=50){
            System.out.println("Kecepatan Rendah");
        }
        else if(kecepatan >=51 && kecepatan <=75){
            System.out.println("Kecepatan Sedang");
        }
        else if(kecepatan >75){
            System.out.println("Kecepatan Tinggi");
        }
    }
    
    public static void main(String[] args) {
        SimulasiMotorSonic MotorA = new SimulasiMotorSonic();
        
        MotorA.dinyalakan();
        MotorA.dimatikan();
        MotorA.dimatikan();
        MotorA.dinyalakan();
        MotorA.dinyalakan();
        MotorA.tambah_perseneling();
        MotorA.tambah_perseneling();
        MotorA.tambah_perseneling();
        MotorA.kurang_perseneling();
        MotorA.tambah_kecepatan(5);
        MotorA.tambah_kecepatan(20);
        MotorA.kurang_kecepatan(0);
        MotorA.kurang_kecepatan(0);
        MotorA.InfoMotor();
    }
}
