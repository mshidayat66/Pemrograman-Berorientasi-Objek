
import java.util.ArrayList;


public class Dosen extends Person{
    private int jumlahmatkul;
    private ArrayList<String> matkuList;

    public Dosen(String name, String address){
        super(name, address);
        jumlahmatkul = 0;
        matkuList = new ArrayList<>();
    }

    public boolean addCourse(String course){
        //Jika Di dalam Arraylist Ada Yang Sama Maka Matkul Sudah Ada
        if(matkuList.contains(course)){
            System.out.println("Matkul Sudah Ada");
            return false;
        }
        //Menambahkan
        jumlahmatkul++;
        matkuList.add(course);
        return true;
    }

    public boolean removeCourse(String course){
        //Jika Dalam Arraylist Tidak Ada Course Maka Tidak Bisa Menghapus Matkul
        if(!matkuList.contains(course)){
            System.out.println("Matkul Yang Akan Dihapus Tidak Ada");
            return false;
        }
        //Jika Ada Hapus
        jumlahmatkul--;
        matkuList.remove(course);
        return true;
        
    }

    public int getjumlahmatkul() {
        return jumlahmatkul;
    }

    public String toString(){
        return 
        super.toString() + 
        "\n Jumlah Mata Kuliah Yang Diampu : " + getjumlahmatkul();
    }


}
