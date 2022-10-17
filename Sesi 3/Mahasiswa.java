
public class Mahasiswa {
    String nama, nim, grade;
    int nilai;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getNilai() {
        return nilai;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }
    
    Mahasiswa(String nama, String nim, int nilai){
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
        setGrade();
    }
    
    public void setGrade(){
        if(getNilai() >= 80 && getNilai() <= 100){
            setGrade("A");
        }
        
        else if(getNilai() >= 70 && getNilai() < 80){
            setGrade("B");
        }
        
        else if(getNilai() >= 60 && getNilai() < 70){
            setGrade("C");
        }
        
        else if(getNilai() >= 50 && getNilai() < 60){
            setGrade("D");
        }
        
        else if(getNilai() < 50){
            setGrade("E");
        }
        
        else{
            setGrade("Input Nilai Anda Salah");
        }
    }
    
    public void InfoMahasiswa(){
        System.out.println("NIM     : " + getNim());
        System.out.println("Nama    : " + getNama());
        System.out.println("Nilai   : " + getNilai());
        System.out.println("GRADE   : " + getGrade());
        System.out.println("========================================");
    }
}
