/*
    Informatikunterricht 31/03/22
        Details zu Paritätsbit Aufg. 2

    CC Daniel Kazimierczuk 
    github.com/daniel-k-05
*/

public class checkParity {
    public static void main(String[] args) {

        //input parameter
        String Zeichenkette = "01100011";
        boolean odd = false;

        int count = 0;
        
        if(Zeichenkette.length() != 8) {
            System.out.println("Error :: Input String incorrect length");
        }
        else {
            //"temp" berechnen
            for(int i=0; i<8; i++) {
                if(Zeichenkette.charAt(i) == '1') {
                    count++;
                }
            }
            System.out.println("Debug :: " + count); 

            //Kontrolle
            if(count % 2 == 0) {
                if(odd == false) { System.out.println("wahr"); } 
            }
            else {
                if(odd == false) { System.out.println("falsch"); }
            }
        }
    } 
}