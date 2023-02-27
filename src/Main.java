import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena 3 caracteres :");
        String input= teclado.nextLine();
        boolean Secuencia = true;
        for (int i = 0; i < input.length() - 1; i++) {
            int cadena1 = (int)input.charAt(i);
            int cadena2 =(int)input.charAt(i+1);
            if (cadena2-cadena1 !=1){
                Secuencia = false;
            }
        }
        System.out.println("la secuencia es : " + Secuencia);
    }
}
