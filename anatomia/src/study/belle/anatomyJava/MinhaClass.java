package study.belle.anatomyJava;
public class MinhaClass {

    public static void main(String [] args) {
        String firstName = "Isabelle";
        String lastName = "Santiago";

        String completeName = completeName(firstName, lastName);
        System.out.println(completeName);
}

        public static String completeName (String firstName, String lastName){
            return "methods result: " + firstName.concat(" ").concat(lastName);

}

}