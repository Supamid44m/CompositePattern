import java.util.ArrayList;
import java.util.List;

public class CompleteSkateSet implements Skate{

    List<Skate> completeskates = new ArrayList<Skate>();  
    int id;

    public CompleteSkateSet(int id){
        this.id=id;
    }


    public void add(Skate skate) {  
        completeskates.add(skate);  
    }



    @Override
    public void getinfo() {
        System.out.println("This completeset:"+" " +id+" "+ "has");
        for (Object skate : completeskates) {
            Skate sk8 = (Skate) skate;
                 sk8.getinfo();
                 }
                 
             }
       
        
    }



    
    

