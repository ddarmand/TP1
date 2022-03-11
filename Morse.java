public class Morse {

    public static String  morseCode(char c){

          switch (c){

              case 'E':
                  return ".";
              case 'O':
                  return "---";
              case 'S':
                  return "...";
              case 'T':
                  return "-";
              case 'W':
                  return ".--";
          }
       return "?";
    }

    public static void morseMatch(String letter){

        for(int i=0; i<letter.length();i++){
            System.out.print(morseCode(letter.charAt(i)));

        }

    }

    public static void main(String[] args){
        morseMatch("SOS");
        System.out.println();
        morseMatch("TWEET");
        System.out.println();
        morseMatch("TWITTER");
        System.out.println();
        morseMatch("WEST");
    }
}
