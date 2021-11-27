package az;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, z, n, auxiliar, frequencia = 0, k; // n = quantidade de perguntas; k = qntd para ser considerada frequente
        int p[], vaux[]; // p = perguntas; vaux = vetor auxiliar
        
        do{
            n = sc.nextInt();
            k = sc.nextInt();

           
            
            p = new int[n];
            vaux = new int[n];

            for (i = 0; i < n; i++){ 
                p[i] = sc.nextInt(); // leitura das perguntas e armazenamento em um vetor
                vaux[i] = p[i]; // cópia do vetor original para um auxiliar
            }
           


            for (i = 0; i < n; i++){
                auxiliar = 0;

                for(j = 0; j < n; j++){
                    if(p[i] == vaux[j]){ // fixa o vetor original como pivô e percorre o auxiliar utilizando a variavel j
                        vaux[j] = 0; //  Ao encontrar sua ocorrencia, zera a posição para não a contagem não se repetir
                        auxiliar += 1; 
                    }   

                }
                
                if(auxiliar == k && auxiliar != n){ // Verdadeira se a ocorrencia da variavel auxiliar atingir o requisito K e sua ocorrencia nao for igual a seu tamanho
                    frequencia += 1;
                    
                    for(z = j + 1; z < n; z++){
                        if(p[i] == vaux[z]){
                            vaux[k] = 0;
                        }
                    }
                }
                
                else{ // Caso a ocorrencia for igual a seu tamanho, entra nesse if.
                    if(auxiliar >= k){ // Além de ter que satisfazer a condição acima, a variavel precisa cumprir a frequencia de k
                        frequencia = 1; // frequencia unitária
                    }
                    
                }

                vaux[i] = 0;

            }


            System.out.println(frequencia);
            frequencia = 0;

        }while(n != 0 && k != 0);
            

        }
  }     
   

