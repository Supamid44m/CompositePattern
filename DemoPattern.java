public class DemoPattern {
    public static void main(String[] args) {
        Skate deck1 = new Deck(8,"preduce");
        Skate whee1 = new Wheel(52,"spritfire");
        Skate truck1 = new Truck(155,"indy");

        Skate completeset1 = new CompleteSkateSet(1);

        completeset1.add(deck1);
        completeset1.add(whee1);
        completeset1.add(truck1);


        completeset1.getinfo();
        
        
        
    }
    
}
