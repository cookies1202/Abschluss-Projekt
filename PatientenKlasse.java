public class PatientenKlasse
{
    private String name;
    private String adresse;
    private int age;
    private String email;
    private int SvNummer;

    public PatientenKlasse(String name, String adresse, int age, String email, int svNummer)
    {
        this.name = name;
        this.adresse = adresse;
        this.age = age;
        this.email = email;
        SvNummer = svNummer;
    }

    public String getName()
    {
        return name;
    }

    public String getAdresse()
    {
        return adresse;
    }

    public int getAge()
    {
        return age;
    }

    public String getEmail()
    {
        return email;
    }

    public int getSvNummer()
    {
        return SvNummer;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAdresse(String adresse)
    {
        this.adresse = adresse;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setSvNummer(int svNummer)
    {
        SvNummer = svNummer;
    }
}
