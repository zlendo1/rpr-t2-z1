package ba.unsa.etf.rpr;

public class Main {
    public static void main(String[] args) {
        if (args[0].compareTo("sin") == 0) {
            System.out.println(Matematika.sinus(Double.parseDouble(args[1])));
        } else {
            System.out.println(Matematika.faktorijel(Integer.parseInt(args[1])));
        }
    }
}