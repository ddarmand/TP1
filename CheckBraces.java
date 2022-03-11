public class CheckBraces {

    public static boolean isValid(String braces) {
        String b = braces;

        for (int i = 0; i < braces.length() / 2; i++) {
                       b = b.replaceAll("\\{\\}", "");
            if (b.length() == 0) {
                System.out.print(true);
                return true;
            }

        }
        System.out.print(false);
        return false;
    }
    /*public static boolean isValide(String brackets) {
        while(brackets.indexOf("{}")!=-1) {
            brackets = brackets.replace("{}","");

        }
        return brackets.isEmpty();
    }*/

    public static void main(String[] args) {

        isValid("{{}}");
        System.out.println();
        isValid("{{}");




    }

}
