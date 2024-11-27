package Lagu;
public class Fans {
    private String name;
    
    public Fans(){
        this.name = "No name :";
    }
    
    public Fans( String name){
        this.name = name;
    }
    
    public void showName(){
        System.out.print(name);
    }
    
    public void watchingPerformances(){
        System.out.print(name + " : Melihat idolanya dari youtube.");
    }
    
    public void watchingPerformances(Musician musician){
        System.out.println();
        System.out.print(name+" : ");
        System.out.print("Melihat idolanya ");
        musician.perform();
    }
    
}
