package baptiste.test;

public class SwitchTest {
    public static void main(String[] args) {

        switchOn(1);
        switchOn(100);

    }

    private static void switchOn(Integer i){
        switch (i) {
            case 1,2,3,4,5,6,7,8,9 -> System.out.println("Je suis entre 1 et 10");
            default -> System.out.println("Je suis ailleurs");
        }
    }
}
