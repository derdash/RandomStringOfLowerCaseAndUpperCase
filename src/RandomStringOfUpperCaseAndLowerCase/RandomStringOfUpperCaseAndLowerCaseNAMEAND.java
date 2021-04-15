package RandomStringOfUpperCaseAndLowerCase;

public class RandomStringOfUpperCaseAndLowerCaseNAMEAND {


    public static void main(String[] args) {







        String randonName ="";
    for (int i = 0 ; i < 5  ; i++){
            int y = (int) (Math.random() * 2);

            if (y == 0) {
                randonName += ((char) (65 + (int) (Math.random() * 26)));
            } else {
                randonName += ((char) (97 + (int) (Math.random() * 26)));
            }        }
        System.out.println(randonName);
    }}
