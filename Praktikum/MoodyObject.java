
public class MoodyObject {
    
    protected String getMood(){
        return "moody";
    }
    public void speak(){
        System.out.println("I am "+getMood());
    }
    void laugh() {}
    void cry() {}
}

class SadObject extends MoodyObject{
    protected String getMood(){
        return "sad";
    }
    public void cry(){
        System.out.println("Hoo hoo");
    }
}

class HappyObject extends MoodyObject{
    protected String getMood(){
        return"happy";
    }
    public void laugh(){
    System.out.println("Hahaha");
    }
}

class MoodyTest{
    public static void main(String[] args) {
        
        MoodyObject m = new MoodyObject();
        
        //test parent class
        m.speak();
        
        //test inheritance class
        m = new HappyObject();
        m.speak();
        m.laugh();
        
        //test inheritance class
        m=new SadObject();
        m.speak();
        m.cry();
    }
}
