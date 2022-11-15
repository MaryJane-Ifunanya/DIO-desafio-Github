import java.util.Scanner;

public class Exer2 {
    public static void main(String[] args){
        try (Scanner teclado = new Scanner(System.in)) {
            int tabuada;
            System.out.println("Tabuade de: ");
            tabuada = teclado.nextInt();

            System.out.println("Tabuada de : " + tabuada);
            for(int i=1;i<=10;i++){
                System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
            }
        }
    }
}
