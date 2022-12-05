public class Truck implements Skate {


    public int trucksize;
    public String brand;
    
    public Truck(int trucksize , String brand){
        this.trucksize=trucksize;
        this.brand=brand;
    }


   
    @Override
    public void add(Skate skate) {
        
        
    }


    @Override
    public void getinfo() {
        System.out.println("Truck");
        System.out.println("brand"+" "+brand);
        System.out.println("trucksize"+" "+trucksize);
    }


    
    
}
