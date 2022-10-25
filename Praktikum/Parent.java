
public class Parent {
    
}

class Child extends Parent{
    int x;
    public Child(){
        x = 5;
    }
    
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.x);
    }
}
