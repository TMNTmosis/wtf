package whattofood.whattofood;

public class Ocena
{
    public long Id;
    public int Broj;

    public Korisnik PripadaKorisniku;
    public Recept PripadaReceptu;

    public Ocena (long Id,int Broj)
    {
        this.Id = Id;
        this.Broj = Broj;
    }

    public long GetId () {return Id;}

    public int GetBroj () {return Broj;}
    public void SetBroj (int Broj) {this.Broj = Broj;}

    public Korisnik GetKorisnik () {return PripadaKorisniku;}
    public void SetKorisnik (Korisnik PripadaKorisniku) {this.PripadaKorisniku = PripadaKorisniku;}

    public Recept GetRecept () {return PripadaReceptu;}
    public void SetRecept (Recept PripadaReceptu) {this.PripadaReceptu = PripadaReceptu;}
}
