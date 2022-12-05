public class Wheel implements Skate {

    public int wheelsize;
    public String brand;
    
    public Wheel(int wheelsize, String brand){
        this.wheelsize=wheelsize;
        this.brand=brand;
    }
    
    
   


    @Override
    public void add(Skate skate) {
        
    }


    @Override
    public void getinfo() {
        System.out.println("Wheels");
        System.out.println("brand:"+" "+brand);
        System.out.println("wheelsize:"+" "+wheelsize);
        
    }


  
    
    
    
}
