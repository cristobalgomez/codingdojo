public class StringManipulator {
    public String trimAndConcat(String cadenaA, String cadenaB) {
        return cadenaA.trim().concat(cadenaB.trim());
    }

    public int getIndexOrNull(String cadena, char letra) {
        return cadena.indexOf(letra);
    }

    public int getIndexOrNull(String cadenaA, String cadenaB) {
        return cadenaA.indexOf(cadenaB);
    }

    public String concatSubstring(String cadenaA, int inicio, int fin, String cadenaB) {
        return cadenaA.substring(inicio, fin).concat(cadenaB);
    }
}
