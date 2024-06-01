import java.util.LinkedHashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new LinkedHashMap<>();
        mahasiswaMap.put("24060122130076", "Azzam Saefudin Rosyidi");
        mahasiswaMap.put("24060122130150", "Bambang Pamungkas");
        mahasiswaMap.put("24060122140195", "Cici");
        mahasiswaMap.put("24060122120300", "Didi");

        mahasiswaMap.forEach((nim, nama) -> {
            System.out.println("NIM: " + nim + ", Nama: " + nama);
        });
    }
}
