
class Bapak {
    int a;
    int b;
    
    void show_variabel(){
        System.out.println("NIlai a="+ a);
        System.out.println("NIlai b="+ b);
    }
}

class Anak extends Bapak{
    int c;
    int a;
    int b;
    void show_variabel(){
        System.out.println("NIlai a="+ super.a);
        System.out.println("NIlai b="+ super.b);
        System.out.println("NIlai c="+ c);
    }
}

class InheritExample{
    
    public static void main(String[] args) {
        
        Bapak objectBapak = new Bapak();
        Anak objectAnak = new Anak();
        
        objectBapak.a=1;
        objectBapak.b=1;
        System.out.println("Object Bapak (Superclass):");
        
        objectBapak.show_variabel();
        objectAnak.c=5;
        System.out.println("Object Anak (Superclass dari Bapak):");
        objectAnak.show_variabel();
    }
}
