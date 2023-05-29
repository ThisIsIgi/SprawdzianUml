import java.util.List;

public class Pracownia{
    private List Map;

    public void dodajKomputerDoUcznia(Uczen uczen, Komputer komputer){
        Map.add(uczen);
        Map.add(komputer);
    }

    public void wyswietlPracownie(){
        System.out.println(Map);
    }
}
