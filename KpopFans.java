package Lagu;

public class KpopFans extends Fans {
    public KpopFans(){
        
    }
    
    public KpopFans(String name){
        super(name);
    }
    
    public void watchingPerformances(Musician musician,String expression){
        System.out.println();
        super.showName();
        System.out.print(" : "+expression);
        System.out.print("Melihat idolanya ");
        musician.perform();
    }
}










