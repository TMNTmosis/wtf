package whattofood.whattofood;

public class Sastojak
{
    public long Id;
    public String Ime;
    public String Kolicina;

    public Recept PripadaReceptu;

    public Sastojak(long Id,String Ime,String Kolicina)
    {
        this.Id = Id;
        this.Ime = Ime;
        this.Kolicina = Kolicina;
    }

    public long GetId () {return Id;}

    public String GetIme () {return Ime;}
    public void SetIme (String Ime) {this.Ime = Ime;}

    public String GetKolicina () {return Kolicina;}
    public void SetKolicina (String Kolicina) {this.Kolicina = Kolicina;}

    public Recept GetRecept () {return PripadaReceptu;}
    public void SetRecept (Recept PripadaReceptu) {this.PripadaReceptu = PripadaReceptu;}
}
