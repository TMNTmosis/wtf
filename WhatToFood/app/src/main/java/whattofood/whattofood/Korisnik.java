package whattofood.whattofood;

public class Korisnik
{
    protected String Ime;
    protected String Prezime;
    protected String KorisnickoIme;
    protected String Lozinka;
    protected String Mail;
    protected String Pol;

    public Korisnik(String Ime,String Prezime,String KorisnickoIme,String Lozinka,String Mail,String Pol)
    {
        this.Ime = Ime;
        this.Prezime = Prezime;
        this.KorisnickoIme = KorisnickoIme;
        this.Lozinka = Lozinka;
        this.Mail = Mail;
        this.Pol = Pol;
    }

    public String GetIme () { return  Ime; }
    public void SetIme (String Ime) {this.Ime = Ime;}

    public String GetPrezime () { return  Prezime; }
    public void SetPrezime (String Prezime) {this.Prezime = Prezime;}

    public String GetKorisnickoIme () { return  KorisnickoIme; }
    //public void SetKorisnickoIme (String KorisnickoIme) {this.KorisnickoIme = KorisnickoIme;}

    public String GetLozinka () { return  Lozinka; }
    public void SetLozinka (String Lozinka) {this.Lozinka = Lozinka;}

    public String GetMail () { return  Mail; }
    public void SetMail (String Mail) {this.Mail = Mail;}

    public String GetPol () { return  Pol; }
    public void SetPol (String Pol) {this.Pol = Pol;}
}
