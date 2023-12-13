//
//Scrivi un programma Java che abbia un metodo che prenda due stringhe e le compari lessico-graficamente.
//
//        Il metodo dovrà restituire "Le due stringhe sono uguali" o "Le due stringhe sono differenti" basandosi sul risultato del confronto.
//        Per la creazione della stringa di risultato dovrebbe essere utilizzato StringBuilder.

public class Main {
    public static void main(String[] args) {
        String stringa1 = "Ciao";
        String stringa2 = "Mamma";
        System.out.println(comparaStringhe(stringa1, stringa2));

    }

    public static StringBuilder comparaStringhe(String stringa1, String stringa2) {
        StringBuilder stringheUnite = new StringBuilder("Le due stringhe sono ");

        if (stringa1.equalsIgnoreCase(stringa2)) {
            stringheUnite.append("uguali");
        } else {
            stringheUnite.append("differenti");
        }
        return stringheUnite;

    }
}
