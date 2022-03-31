/*
    Informatikunterricht 31/03/22
        Details zu Paritätsbit Aufg. 1, 3

    CC Daniel Kazimierczuk 2022
    github.com/daniel-k-05
*/

public class addParity {
    public static void main(String[] args) {

        //input parameter
        String Zeichenkette = "0110001";
        boolean odd = false;

        int count = 0;

        if(Zeichenkette.length() != 7) {
            System.out.println("Error :: Input String incorrect length");
        }
        else {
            //"temp" berechnen
            for(int i=0; i<7; i++) {
                if(Zeichenkette.charAt(i) == '1') {
                    count++;
                }
            }
            System.out.println("Debug :: " + count); 

            //Paritätsbit anhängen
            if(odd == false) { //(even-parity)
                if(count % 2 == 0) {
                    System.out.println("gerade");
                    Zeichenkette = Zeichenkette	+ "0";
                }
                else {
                    System.out.println("un-gerade");
                    Zeichenkette = Zeichenkette	+ "1";
                }
            }
            else {
                if(count % 2 == 0) {
                    System.out.println("gerade");
                    Zeichenkette = Zeichenkette	+ "0";
                }
                else {
                    System.out.println("un-gerade");
                    Zeichenkette = Zeichenkette	+ "1";
                }
            }

            //String mit neuem parity-bit ausgeben
            System.out.println(Zeichenkette);
        }
    } 
}  