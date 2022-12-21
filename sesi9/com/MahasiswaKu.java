
package sesi9.com;
        
public class MahasiswaKu {
    public static void main(String[] args) {
        Mahasiswa <String,String,Integer> m = new Mahasiswa<>();
        m.setNim("1102020");
        m.setName("Ferdi");
        m.setClass(21);
        
        System.out.println(m.getNim());
        System.out.println(m.getName());
        System.out.println(m.getClas());
    }
}

class Mahasiswa <NI,NA,CL>{
    
    private NI Nim;
    private NA Name;
    private CL Class;
    
    public NI getNim(){
        return Nim;
    }
    
    public void setNim(NI Nim){
        this.Nim = Nim;
    }
    
    public NA getName(){
        return Name;
    }
    
    public void setName(NA Name){
        this.Name = Name;
    }
    
    public CL getClas(){
        return Class;
    }
    
    public void setClass(CL Class){
        this.Class = Class;
    }
}