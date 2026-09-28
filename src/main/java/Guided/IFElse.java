package Guided;

public class IFElse {
    public static void main(String args[]) {
        int month = 4;
        String season;
        season = switch (month) {
            case 12, 1, 2 -> "Dingin";
            case 3, 4, 5 -> "Semi";
            case 6, 7, 8 -> "Panas";
            case 9, 10, 11 -> "Gugur";
            default -> "";
        };
        System.out.println("Bulan April masuk musim " + season + ".");
    }
}