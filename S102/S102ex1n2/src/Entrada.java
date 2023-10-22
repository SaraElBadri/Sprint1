import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdueix la dada que vulguis");
        //llegirByte(scanner);
        //llegirInt(scanner);
        //llegirFloat(scanner);
        //llegirDouble(scanner);
        //llegirChar(scanner);
        llegirString(scanner);

    }

    public static byte llegirByte(Scanner scanner) {
        byte edat = 0;
        boolean isValid = false;
        while (!isValid) {
            try {
                edat = scanner.nextByte();
                isValid = true;
                System.out.println("La teva edat es: "+ edat);
            } catch (InputMismatchException e) {
                System.out.println("Invalid. Introdueix la teva edat: ");
                scanner.nextLine();
                System.out.println("Introdueix la teva edat:");
            }
        }
        return edat;
    }

    public static int llegirInt(Scanner scanner) {
        int saldo = 0;
        boolean isValid = false;
        while (!isValid) {
            try {
                saldo = scanner.nextInt();
                isValid = true;
                System.out.println("El teu saldo del banc és: "+ saldo + "€");
            } catch (InputMismatchException e) {
                System.out.println("Invalid. Introdueix el saldo que t'agradaria tenir al teu compte bancari: ");
                scanner.nextLine();
                System.out.println("Introdueix el teu saldo:");
            }
        }
        return saldo;
    }


    public static float llegirFloat(Scanner scanner) {
        float premi = 0;
        boolean isValid = false;
        while (!isValid) {
            try {
                premi = scanner.nextFloat();
                isValid = true;
                System.out.println("Quantitat d'euros guanyada: "+ premi);
            } catch (InputMismatchException e) {
                System.out.println("Invalid. Introdueix un premi existent. ");
                scanner.nextLine();
                System.out.println("Introdueix el premi que vols guanyar:");
            }
        }
        return premi;
    }

    public static double llegirDouble(Scanner scanner) {
        double preu = 0;
        boolean isValid = false;
        while (!isValid) {
            try {
                preu = scanner.nextDouble();
                isValid = true;
                System.out.println("Se t'ha cobrat: "+ preu + "€");
            } catch (InputMismatchException e) {
                System.out.println("Invalid. Introdueix un preu valid: ");
                scanner.nextLine();
                System.out.println("Introdueix el preu de la compra desitjada:");
            }
        }
        return preu;
    }

    public static char llegirChar(Scanner scanner) {
        char fav = ' ';
        boolean isValid = false;
        while (!isValid) {
            try {
                fav = scanner.next(".").charAt(0);
                isValid = true;
                System.out.println("El teu carácter favorit és: "+ fav);
            } catch (InputMismatchException e) {
                System.out.println("Invalid. Introdueix un cáracter valid: ");
                scanner.nextLine();
                System.out.println("Introdueix el teu carácter favorit:");
            }
        }
        return fav;
    }

    public static String llegirString(Scanner scanner) {
        String fave = "";
        boolean isValid = false;
        while (!isValid) {
            try {
                fave = scanner.next();
                isValid = true;
                System.out.println("Has introduit: "+ fave);
            } catch (InputMismatchException e) {
                System.out.println("Invalid. Introdueix una altre opció: ");
                scanner.nextLine();
                System.out.println("Introdueix un altre cop:");
            }
        }
        return fave;
    }
}
