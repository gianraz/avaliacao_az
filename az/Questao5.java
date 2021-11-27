package az;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j, pares = 0, nbota[]; // n = numero de casos; nbota = vetor de numero de botas
        char pebota[]; // pebota = vetor de char com o pé da bota


        while(true) {
            try {
                n = sc.nextInt();   
                nbota = new int[n];
                pebota = new char[n];


                for(i = 0; i < n; i++){ // leitura dos dados
                    nbota[i] = sc.nextInt();
                    pebota[i] = sc.next().charAt(0);
                }


                for(i = 0; i < n; i++){
                    for(j = 0; j < i; j++){
                        if(nbota[i] == nbota[j] && pebota[i] == pebota[j]){ // Tratamento de exceção: Caso haja duas botas do mesmo tipo (numero e pé), ela é removida de seus vetores.
                            pebota[i] = 0;
                            nbota[i] = 0;
                        }


                        if(nbota[i] == nbota[j] && i != j){
                            if((pebota[i] == 'D' && pebota[j] == 'E') || (pebota[i] == 'E' && pebota[j] == 'D')){
                                pares += 1; // Adiciona um par de bota caso as condições se satisfaçam
                                
                            }
                        }
                    }
                }
                System.out.println(pares);
                pares = 0;

    
            }catch(Exception e){ // O código se encerra aqui ao encontrar o EOF
                break;
            }
     }
        
    }
        
}
