import java.util.Scanner;
public class Laborator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContBancar cont = new ContBancar();

        
        System.out.println("Introduceti sumele pentru depunere: ");
        double depunere1 = scanner.nextDouble();
        double depunere2 = scanner.nextDouble();

        cont.depozitareSuma(depunere1);
        cont.depozitareSuma(depunere2);
        double sold = depunere1;
        double soldActualizat = depunere1 + depunere2;
        System.out.println("Soldul curent " + sold + "sold actualizat " + soldActualizat);
    }
}
