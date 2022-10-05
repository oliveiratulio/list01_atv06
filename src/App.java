import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        double raio;
        double area;
        

        System.out.println("Escreva o valor do raio");
        raio = scan.nextFloat();
        area = Math.PI * Math.pow(raio, 2);
        scan.close();
        
        System.out.printf("O valor da area é %.2f " , area);
        
        

    }
}
