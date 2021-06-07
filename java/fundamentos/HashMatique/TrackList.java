import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TrackList {
    public static void main(String[] args) {
        Map<String, String> trackList = new HashMap<>();
        trackList.put("La voz de los '80", "Algo grande esta naciendo/En la decada de los ochenta/Ya se siente la atmosfera/Saturada de aburrimiento/Los hippies y los punk tuvieron la ocasion");
        trackList.put("El Baile De Los Que Sobran","Es otra noche mas/De caminar/Es otro fin de mes/Sin novedad");
        trackList.put("Tren Al Sur","Siete y media en la manana /Mi asiento toca la ventana /Estacion central, segundo carro/ Del ferrocarril que me llevara al sur");
        trackList.put("Por Que No Se Van","Si suenas con Nueva York y con Europa /Te quejas de nuestra gente y de su ropa/ Vives amando el cine arte del normandi");

        String trenAlSur = trackList.get("Tren Al Sur");
        System.out.println(trenAlSur);

        Set<String> trackTitles = trackList.keySet();

        for(String title : trackTitles) {
            System.out.println(title + ": " + trackList.get(title));
        }
    }
}
