package az;


public class Questao1 {
    
    public static void main(String[] args) {
        int i;
        
        for(i = 1; i <= 100; i++){
            if(i % 3 == 0){
                System.out.println("A");
            }
            else if(i % 5 == 0){
                System.out.println("Z");
            }
            else{
                System.out.println(i);
            }
        }
            
    }
        
}
    

