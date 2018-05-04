package whattofood.whattofood;

import java.util.ArrayList;

public class Recept
{
    public long Id;
    public String Naziv;
    public byte[] Slika;
    public String Opis;
    public String Tip;
    public String Vreme;

    public Korisnik PripadaKorisniku;
    public ArrayList<Sastojak> Sastojci;
    public ArrayList<Komentar> Komentari;
    public ArrayList<Ocena> Ocene;

    public Recept (long id, String Naziv, byte[] Slika,String Opis,String Tip,String Vreme)
    {
        this.Id = Id;
        this.Naziv = Naziv;
        this. Slika = Slika;
        this.Opis = Opis;
        this.Tip = Tip;
        this.Vreme = Vreme;
    }

    public long GetId() {return Id;}

    public String GetNaziv() {return Naziv;}
    public void SetNaziv(String Naziv) {this.Naziv = Naziv;}

    public byte[] GetSlika() {return Slika;}
    public void SetSlika(byte[] Slika) {this.Slika = Slika;}

    public String GetOpis() {return Opis;}
    public void SetOpis(String Opis) {this.Opis = Opis;}

    public String GetTip() {return Tip;}
    public void SetTip (String Opis) {this.Tip = Tip;}

    public String GetVreme() {return Vreme;}
    public void SetVreme(String Vreme) {this.Vreme = Vreme;}

    public Korisnik GetKorisnik () {return PripadaKorisniku;}
    public void SetKorisnik (Korisnik PripadaKorisniku) {this.PripadaKorisniku = PripadaKorisniku;}

    public ArrayList<Sastojak> GetSastojci () {return  Sastojci;}
    public void SetSastojci (ArrayList<Sastojak> Sastojci) {this.Sastojci = Sastojci;}
    public void AddSastojak (Sastojak sastojak) {Sastojci.add(sastojak);}
    public void RemoveSastojak (Sastojak sastojak){Sastojci.remove(sastojak);}
    public void UpdateSastojak (Sastojak sastojak)
    {
        for (int i=0;i<Sastojci.size();i++)
            if (sastojak.GetId() == Sastojci.get(i).GetId())
                Sastojci.set(i,sastojak);
    }

    public ArrayList<Komentar> GetKomenatri () {return  Komentari;}
    public void SetKomentari (ArrayList<Komentar> Komenatri) {this.Komentari= Komentari;}
    public void AddKomentar (Komentar komentar) {Komentari.add(komentar);}
    public void RemoveKomentar (Komentar komentar){Komentari.remove(komentar);}
    public void UpdateKomentar (Komentar komentar)
    {
        for (int i=0;i<Komentari.size();i++)
            if (komentar.GetId() == Komentari.get(i).GetId())
                Komentari.set(i,komentar);
    }

    public ArrayList<Ocena> GetOcene () {return  Ocene;}
    public void SetOcene (ArrayList<Ocena> Ocene) {this.Ocene = Ocene;}
    public void AddOcene (Ocena ocena) {Ocene.add(ocena);}
    public void RemoveOcene (Ocena ocena){Ocene.remove(ocena);}
    public void UpdateOcene (Ocena ocena)
    {
        for (int i=0;i<Ocene.size();i++)
            if (ocena.GetId() == Ocene.get(i).GetId())
                Ocene.set(i,ocena);
    }
}
