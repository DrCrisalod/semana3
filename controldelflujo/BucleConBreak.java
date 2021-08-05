public class BucleConBreak{
    public static void main(String[] args){
        for (int i = 0; i< 6; i++){
            for (int j=0; j<5; j++){
                if (j==3){
                    break;
                }
                else{
                    System.out.println("iteracion [i,j]: " + i + ", " + j);
                }
            }
        }
    }
}