
import java.util.ArrayList;


public class MahasiswaSesi5 extends Person {
    private int jumlahmatkul;
    private ArrayList<String> matakuliah;
    private ArrayList<Integer> nilailList;

    public MahasiswaSesi5 (String name, String address){
        super(name, address);
        matakuliah = new ArrayList<>();
        nilailList = new ArrayList<>();
    }

    public void addmatakuliahGrade(String matakuliah, int grade){
        this.matakuliah.add(matakuliah);
        this.nilailList.add(grade);
        jumlahmatkul++;
    }

    public void printnilailList(){
        for(int i = 0; i < jumlahmatkul; i++){
            System.out.println("Mata Kuliah: " + matakuliah.get(i) + " " + "Grade: " + nilailList.get(i));
        }
    }

    public double getAverageGrade(){
        int jumlah = 0;
        for (int i = 0; i < jumlahmatkul; i++) {
            jumlah += nilailList.get(i);
        }
        return jumlah / jumlahmatkul;
    }

    public String toString(){
        return
        super.toString() + 
        "Jumlah Matkul Yang Diambil : " + this.jumlahmatkul + 
        "\nRata-Rata Nilai : " + getAverageGrade();
    }
}
