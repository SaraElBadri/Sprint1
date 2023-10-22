import java.io.*;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        /*File file = new File("C:\\Users\\sarae\\Documents\\IT\\Sprint1\\Sprint1\\S103\\S103n1\\S103n1ex3\\countries.txt");
        //System.out.println(file);
        BufferedReader br = new BufferedReader(new FileReader(file));
        //System.out.println(br.readLine());*/

        HashMap<String, String> paisosMap= new HashMap<>();

        //llegir fitxer y guardar la data al hashmap
        try{
            File file = new File("C:\\Users\\sarae\\Documents\\IT\\Sprint1\\Sprint1\\S103\\S103n1\\S103n1ex3\\countries.txt");
            //System.out.println(file);
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String data = scanner.nextLine();
                String[] pais = data.split(" ");
                if (pais.length == 2) {
                    paisosMap.put(pais[0], pais[1]);
                } else {
                    System.out.println("Línia amb format incorrecte: " + data);
                }
            }
            scanner.close();
        } catch(FileNotFoundException e){
            System.out.println("Fitxer no trobat. Cambia la ruta a la linea 16 si has mogut el fitxer.");

        }
        //data uduari terminal
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix al teu usuari: ");
        String usuari = sc.nextLine();
        int resultat = 0;

        //joc 10 vegades
        for (int i = 0; i < 10; i++) {
            //random
            Object[] paisArr = paisosMap.keySet().toArray();
            Random random = new Random();
            Object randomPais = paisArr[random.nextInt(paisArr.length)];
            String capital = paisosMap.get(randomPais);

            //Pregunta
            System.out.println("Quina és la capital de " + randomPais + "?");
            String resposta = sc.nextLine();

            //comprovar
            if (resposta.equalsIgnoreCase(capital)) {
                System.out.println("Resposta correcta: +1 punt!");
                resultat++;
            }else{
                System.out.println("Resposta incorrecta. La resposta correcta és " + capital);
                System.out.println("La teva puntuació ha estat: " + resultat + " punts.");
            }
        }
        System.out.println("Molt bé. La teva puntuació ha estat: " + resultat+ " punts.");
        sc.close();

        // Guardar  l'usuari i  puntuació en  fitxer
        try {
            FileWriter writer = new FileWriter("C:\\Users\\sarae\\Documents\\IT\\Sprint1\\Sprint1\\S103\\S103n1\\S103n1ex3\\classificacio.txt");
            writer.write("Nom de l'usuari: " + usuari + "\n");
            writer.write("Puntuació: " + resultat + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("S'ha produït un error en guardar la puntuació.");
        }





    }
}