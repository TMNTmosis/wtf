package whattofood.whattofood;

import java.util.Date;

public class Komentar
{
    public long Id;
    public String Tekst;
    public Date DatumIVreme;

    public Korisnik PripadaKorisniku;
    public Recept PripadaReceptu;

    public Komentar (long Id,String Tekst,Date DatumIVreme)
    {
        this.Id = Id;
        this.Tekst = Tekst;
        this.DatumIVreme = DatumIVreme;
    }

    public long GetId () {return Id;}

    public String GetTekst () {return Tekst;}
    public void SetTekst (String Tekst) {this.Tekst = Tekst;}

    public Date GetDatumIVreme () {return  DatumIVreme;}
    public void SetDatumIVreme (Date DatumIVreme) {this.DatumIVreme = DatumIVreme;}

    public Korisnik GetKorisnik () {return PripadaKorisniku;}
    public void SetKorisnik (Korisnik PripadaKorisniku) {this.PripadaKorisniku = PripadaKorisniku;}

    public Recept GetRecept () {return PripadaReceptu;}
    public void SetRecept (Recept PripadaReceptu) {this.PripadaReceptu = PripadaReceptu;}
}
