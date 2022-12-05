public class Deck  implements Skate{

    
    public int decksize;
    public String brand;


    public Deck(int decksize ,String brand){
        this.decksize=decksize;
        this.brand=brand;
    }
    
    
    

    @Override
    public void add(Skate skate) {
        
    }


    @Override
    public void getinfo() {
        System.out.println("Deck");
        System.out.println("brand:"+" "+brand);
        System.out.println("decksize:"+" "+decksize);
    }
    


   
}
