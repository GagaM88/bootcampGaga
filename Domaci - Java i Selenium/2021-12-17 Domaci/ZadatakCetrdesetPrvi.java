package ZadaciStrahinjaVezbanje;
//Napisati funkciju koja racuna prosecnu vrednost double[] niza.


public class ZadatakCetrdesetPrvi {
    public static void main(String[] args) {


            double[] nizBrojeva = {2.8, 7.5, 24.5, 91.10, 8.31, 63.22, 15.77};

            System.out.println("Prosecna vrednost niza je jednaka broju " + prosecnaVrednost(nizBrojeva) + ".");


        }
        public static double prosecnaVrednost(double nizBrojeva[]){

            double suma = 0;
            double prosecnavrednost;

            for (int i = 0; i < nizBrojeva.length; i++) {

                suma = suma + nizBrojeva[i];
            }
            prosecnavrednost = suma / nizBrojeva.length;
            return prosecnavrednost;

        }
    }
