package RandomStringOfUpperCaseAndLowerCase;

public class RandomStringOfUpperCaseAndLowerCaseNAMEANDLastname {
    public static void main(String[] args) {






        String randonLastName ="";
        String randonName ="";
        for (int i = 0 ; i < 5  ; i++){
            int y = (int) (Math.random() * 2);

            if (y == 0) {
                randonName += ((char) (65 + (int) (Math.random() * 26)));
                randonLastName += ((char) (97 + (int) (Math.random() * 26)));
            } else {
                randonName += ((char) (97 + (int) (Math.random() * 26)));
                randonLastName += ((char) (65 + (int) (Math.random() * 26)));
            }        }

        System.out.println(randonName);
        System.out.println(randonLastName);
        System.out.println(randonName + " " + randonLastName);
}}
