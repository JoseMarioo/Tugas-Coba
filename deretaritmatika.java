
public class deretaritmatika {
    public static void main(String[] args) {
        int a=5;
        int b=5;
        int u=a;
        int s=a;
        System.out.println("deret aritmatikanya adalah");
        for (int i = 0; i <5; i++) {
            for (int j = 0; j  <5-i; j++) {
                System.out.print(u+"\t");
                u=u+b;
                s=s+u;
            }
            System.out.println();
        }
    s=s-u;
        System.out.println("jumlah deret aritmatikanya adalah "+s);
    }
    
}
