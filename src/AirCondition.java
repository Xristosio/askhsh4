public class AirCondition
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
    private int thorivos;
    private int apodoshpsukshs;
    private int apodoshthermanshs;
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
    public void Setthorivos(int thorivos){this.thorivos = thorivos ;}
    public void Setapodoshpsukshs(int apodoshpsukshs){this. apodoshpsukshs = apodoshpsukshs;}
    public void Setapodoshthermanshs(int apodoshthermanshs){this.apodoshthermanshs =apodoshthermanshs ;}
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
    public int Getthorivos(){return thorivos;}
    public int Getapodoshpsukshs(){return apodoshpsukshs;}
    public int Getapodoshthermanshs(){return apodoshthermanshs;}
    static int AirCounter = 0;
    /** epistrefoume to plhthos twn suskeuwn */
    public int AirCounter()
    {
        System.out.printf("AirConditions: ");
        return AirCounter;
    }
    AirCondition(int mhkos,int upsos,int vathos,int katanalwsh,int timh,int thorivos,int apodoshpsukshs,int apodoshthermanshs,String xrwma,String tupos,String onomakataskeuasth,String onomasuskeuhs)
    {
        try
        {
            Setmhkos(mhkos);
            Setupsos(upsos);
            Setvathos(vathos);
            Setkatanalwsh(katanalwsh);
            Settimh(timh);
            Setthorivos(thorivos);
            Setapodoshpsukshs(apodoshpsukshs);
            Setapodoshthermanshs(apodoshthermanshs);
            Settupos(tupos);
            Setxrwma(xrwma);
            Setonomakataskeuasth(onomakataskeuasth);
            Setonomasuskeuhs(onomasuskeuhs);
        }
        catch (Exception e)
        {
            System.out.println("error");
        }
        AirCounter = AirCounter + 1;
        Display();
    }
    public void Display()
    {
        System.out.printf("Tupos: %s\n",Gettupos());
        System.out.printf("Kataskeuasths: %s\n" , Getonomakataskeuasth());
        System.out.printf("%s - upsos:%dcm, mhkos:%dcm, vathos:%dcm\nKatanalwsh(ethsia): %dkW/h Timh: %d€\n",Getonomasuskeuhs(),Getupsos(),Getmhkos(),Getvathos(),Getkatanalwsh(),Gettimh());
        System.out.printf("Apodosh psukshs: %dW/W, Apodosh thermanshs: %dW/W\nXrwma: %s Thorivos: %ddb\n\n",Getapodoshpsukshs(),Getapodoshthermanshs(),Getxrwma(),Getthorivos());
    }
    private void periodicMantainance(){}
}