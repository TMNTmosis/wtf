package whattofood.whattofood;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Korisnici
{
    private static Korisnici korisnici;
    private ArrayList<Korisnik> lista;

    private Korisnici() {
        lista = new ArrayList<Korisnik>();
    }

    public static Korisnici GetKorisnici() {
        if (korisnici == null)
            korisnici = new Korisnici();
        return korisnici;
    }

    public ArrayList<Korisnik> GetListu() {
        return lista;
    }

    public void Add(Korisnik k) {
        lista.add(k);
    }

    public void Remove(Korisnik k) {
        lista.remove(k);
    }

    public void Update(Korisnik k) {
        for (int i = 0; i < lista.size(); i++)
            if (lista.get(i).KorisnickoIme == k.KorisnickoIme)
                lista.set(i, k);
    }
}