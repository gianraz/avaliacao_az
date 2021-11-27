package az;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, N; // N = quantidade de casos
        

        N = Integer.parseInt(sc.nextLine());

        for(i = 0; i < N; i++){
            int troca = 1, contador = 0;
            String diamante = "";
            diamante = sc.nextLine(); // leitura dos diamantes




            diamante = diamante.replaceAll("[.]",""); // 'extração' da areia


            while(troca==1){
                if(diamante.indexOf("<>") != -1){ // caso for diferente, significa que há um diamante ali
                    contador += 1; // adiciona um diamante
                    diamante = diamante.replaceFirst("<>", ""); // retirada de diamantes da string
                }
                else{
                    troca = 0;
                }
            }

            System.out.println(contador);
        }

        sc.close();
        

        


    }
        
}
