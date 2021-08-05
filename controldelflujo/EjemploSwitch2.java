public class EjemploSwitch2{
    public static void main (String[] args){
        int[] niveles = {1, 2, 3, 0};
    System.out.println("\nEjecucion Switch con Breaks Default enmedio sin break: " );
        for (int i=0; i < niveles.length; i++)       {
            System.out.println("Nivel: " + niveles[i]);
            switch (niveles[i]){
            case 1:   System.out.println("\tNivel Basico.");
                      break;
 
            default:  System.out.println("\tNivel no informado.");
 
            case 2:   System.out.println("\tNivel Intermedio.");
                      break;
 
            case 3:   System.out.println("\tNivel Avanzado.");
                      break;
 
            }
        }
    }
}