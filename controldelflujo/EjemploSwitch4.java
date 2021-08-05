public class EjemploSwitch4{
    public static void main (String[] args){
        int[] niveles = {1, 2, 3, 0};
 
    System.out.println("\nEjecucion Switch sin Breaks (con logica que podria ser correcta): ");
        for (int i=0; i < niveles.length; i++)
        {
            System.out.println("Nivel: " + niveles[i]);
            switch (niveles[i])
            {
              case 3: System.out.println("\tNivel Avanzado.");
 
              case 2: System.out.println("\tNivel Intermedio.");
 
              case 1: System.out.println("\tNivel Basico.");
                      break;
 
              default: System.out.println("\tNivel no informado.");
            }
        }
    }
}