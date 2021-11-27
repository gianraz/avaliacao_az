package az;

import java.util.Scanner;



public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        int i = 0, n, r, aux2 = 0; // n = total mergulhadores; r = mergulhadores que retornaram
        int mergs[];
         

        while(true) {
            try {
            
            n = sc.nextInt();
            r = sc.nextInt();
            
        
            mergs = new int[n];


            for(i = 1; i <= r; i++){
                mergs[i] = sc.nextInt();
                
                if(n == r){ // Caso todos os mergulhadores voltem, retorna *
                    System.out.println("*");
                    aux2 = 2; // auxiliar que serve para não entrar no segundo for
                    break;
                }
            }

        
            mergs = ordena(mergs, n); // chamada do método ordena, para organizar os mergulhadores em suas devidas casas do vetor.
             

            for(i = 0; i < n; i++){ 
                if(mergs[i] == 0 && aux2 != 2){ // Apos a ordenaçao, caso a posição do vetor esteja vazia, ou seja, 0, irá apresentar o número daquele mergulhador.
                    System.out.print((i+1) + " ");      // R.I.P :(

                }
            }

    
            }catch(Exception e){ // encerra quando atinge o EOF
                break;
            }
     }
                 
    }


    public static int[] ordena(int[] mergs, int n){ 
        int i, j, auxiliar;
        int mergs2[];
        mergs2 = new int[n];

        for(i = 0; i < n; i++){
            mergs2[i] = mergs[i];
        }

        for(i = 0; i < n; i++){ // Método de ordenação crescente
            for (i = 0; i < n; i++) { 
                for (j = 0; j < n; j++) {
                    if(i+1 == mergs2[j]){
                        auxiliar = mergs2[i];
                        mergs2[i] = mergs2[j];
                        mergs2[j] = auxiliar;
                    }
                }
            }
        }

        return mergs2;

    }



}
        
        
        
        
        
    
        

