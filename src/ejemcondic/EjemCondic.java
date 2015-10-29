package ejemcondic;

public class EjemCondic {

    public static void main(String[] args) {
        int numero1, numero2;
        Compara obx=new Compara();
        numero1= obx.pedirNumEnt();
        numero2= obx.pedirNumEnt();
        obx.comparar(numero1, numero2);
    }
        
    
}
