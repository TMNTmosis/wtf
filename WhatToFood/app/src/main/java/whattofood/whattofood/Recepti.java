package whattofood.whattofood;

import java.util.ArrayList;

public class Recepti
{
    private static Recepti recepti;
    private ArrayList<Recept> lista;

    private Recepti() {
        lista = new ArrayList<Recept>();
    }

    public static Recepti GetRecepti() {
        if (recepti == null)
            recepti = new Recepti();
        return recepti;
    }

    public ArrayList<Recept> GetListu() {
        return lista;
    }

    public void Add(Recept r) {
        lista.add(r);
    }

    public void Remove(Recept r) {
        lista.remove(r);
    }

    public void Update(Recept r) {
        for (int i = 0; i < lista.size(); i++)
            if (lista.get(i).Id == r.Id)
                lista.set(i, r);
    }
}
