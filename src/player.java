
public class player {

    //atribut
    String nama;
    int speed;
    int hp;

    //kurung = method
    void run(){
        System.out.println(nama+" is running...");
        System.out.println("speed = "+speed);
        System.out.println("Current HP "+hp);
    }

    boolean isdead(){
        if(hp<=0) return true;
        return false;

    }
}