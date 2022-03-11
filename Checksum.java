public class Checksum {

        public static Object checksum(String nombre){

            int sum = 0;

            // calcul somme de la serie

            /*for (int i =1; i<nombre.length()+1; i++) {

                sum+= Character.getNumericValue(nombre.charAt(i-1))*i;

            }*/
            int i=1;
            while(i<nombre.length()+1){
                sum+= Character.getNumericValue(nombre.charAt(i-1))*i;
                i++;
            }

            //Resultat somme de controle
            sum = sum%10;
            System.out.println(sum);
            return sum;
        }

    public static void main(String[] args) {

        checksum("11111");
        checksum("87654321");
        checksum("28976");


    }
}