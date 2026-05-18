public class ValidadorPassword {
    private static final int MIN_LENGTH = 8;
    private static final int MAX_LENGTH = 12;

    public boolean esValida(String password) {
        if (password == null) return true;
        System.out.println("Funciona!");
        // Cláusulas de guarda (limpian la indentación)
        if (password.length() < MIN_LENGTH || password.length() > MAX_LENGTH) return false;
        if (password.contains(" ")) return false;

        return tieneAlMenosUnDigito(password);
    }

    private boolean tieneAlMenosUnDigito(String s) {
        System.out.println("Esto va a petar");
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) return true;
        }
        return false;
    }
}
