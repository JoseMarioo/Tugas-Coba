
public class game {
    public static void main(String[] args) {
       
        //membuat objek petani
        player petani = new player();
        
        //memanggil variabel dari clas player
        petani.nama = "Petani kode";
        petani.speed = 78;
        petani.hp = 100;
        
        petani.run();
        
        if(petani.isdead()){
            System.out.println("Game Over");
            
        }
        
    }
}
