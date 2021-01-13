public class WashMachine
{
    private int mhkos;
    private int upsos;
    private int vathos;
    private String onomakataskeuasth;
    private String onomasuskeuhs;
    private String tupos;
    private int katanalwsh;
    private String xrwma;
    private int timh;
    private int strofes;
    private int programmata;
    private int xwrhtikothta;
    /** me th xrhsh set thetoume tis parapanw times */
    public void Setmhkos(int mhkos){this.mhkos = mhkos;}
    public void Setupsos(int upsos){this.upsos = upsos;}
    public void Setvathos(int vathos){this.vathos = vathos;}
    public void Setonomakataskeuasth(String onomakataskeuasth){this.onomakataskeuasth = onomakataskeuasth;}
    public void Setonomasuskeuhs(String onomasuskeuhs){this.onomasuskeuhs = onomasuskeuhs;}
    public void Settupos(String tupos){this.tupos = tupos;}
    public void Setkatanalwsh(int katanalwsh){this.katanalwsh = katanalwsh;}
    public void Setxrwma(String xrwma){this.xrwma = xrwma;}
    public void Settimh(int timh){this.timh = timh;}
    public void Setstrofes(int strofes){this.strofes = strofes;}
    public void Setprogrammata(int programmata){this.programmata = programmata;}
    public void Setxwrhtikothta(int xwrhtikothta){this.xwrhtikothta = xwrhtikothta;}
    /** me to get tha epistrefoume autes tis times */
    public int Getmhkos(){return mhkos;}
    public int Getupsos(){return upsos;}
    public int Getvathos(){return vathos;}
    public String Getonomakataskeuasth(){return onomakataskeuasth;}
    public String Getonomasuskeuhs(){return onomasuskeuhs;}
    public String Gettupos(){return tupos;}
    public int Getkatanalwsh(){return katanalwsh;}
    public String Getxrwma(){return xrwma;}
    public int Gettimh(){return timh;}
    public int Getstrofes(){return strofes;}
    public int Getprogrammata(){return programmata;}
    public int Getxwrhtikothta(){return xwrhtikothta;}
    static int MachineCounter = 0;
    /** epistrefoume to plhthos twn suskeuwn */
    public int MachineCounter()
    {
        System.out.printf("WashineMashines: ");
        return MachineCounter;
    }
    WashMachine(int mhkos,int upsos,int vathos,int katanalwsh,int timh,int strofes,int programmata,int xwrhtikothta,String xrwma,String tupos,String onomakataskeuasth,String onomasuskeuhs)
    {
        try
        {
            Setmhkos(mhkos);
            Setupsos(upsos);
            Setvathos(vathos);
            Setkatanalwsh(katanalwsh);
            Settimh(timh);
            Setstrofes(strofes);
            Setprogrammata(programmata);
            Setxwrhtikothta(xwrhtikothta);
            Settupos(tupos);
            Setxrwma(xrwma);
            Setonomakataskeuasth(onomakataskeuasth);
            Setonomasuskeuhs(onomasuskeuhs);
        }
        catch (Exception e)
        {
            System.out.println("error");
        }
        MachineCounter = MachineCounter + 1;
        Display();
    }
    public void Display()
    {
        System.out.printf("Tupos: %s\n",Gettupos());
        System.out.printf("Kataskeuasths: %s\n" , Getonomakataskeuasth());
        System.out.printf("%s - upsos:%dcm, mhkos:%dcm, vathos:%dcm\nKatanalwsh(ethsia): %dkW/h Timh: %d€\n",Getonomasuskeuhs(),Getupsos(),Getmhkos(),Getvathos(),Getkatanalwsh(),Gettimh());
        System.out.printf("Strofes: %d/Min, Programmata: %d\nXrwma: %s Xwrhtikothta: %dkg\n\n",Getstrofes(),Getprogrammata(),Getxrwma(),Getxwrhtikothta());
    }
    private void periodicMantainance(){}
}