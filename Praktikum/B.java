
public class B extends A {
    B(){
        System.out.println("Konstruktor B dijalankan");
        var_a = "Var_a dari kelas B";
        var_b = "Var_a dari kelas B";
    }
    
    public static void main(String[] args) {
        
        System.out.println("Objek A dibuat");
        A aa= new A();
        System.out.println("menampilkan nama variabel objek aa");
        System.out.println(aa.var_a);
        System.out.println(aa.var_b);
        System.out.println(aa.var_c);
        System.out.println(aa.var_d);
        System.out.println("");
        
        System.out.println("Objek B dibuat");
        B bb = new B();
        System.out.println("menampilkan nama variabel objek bb");
        System.out.println(bb.var_a);
        System.out.println(bb.var_b);
        System.out.println(bb.var_c);
        System.out.println(bb.var_d);
    }
}
