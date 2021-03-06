package tamagotchi;

public class Tamagotchi extends Tama {
	public Tamagotchi(String nome, double gradoSazieta, double gradoSoddisfazione) {
		super(nome, gradoSazieta, gradoSoddisfazione);
		if (gradoSoddisfazione <0) {
			throw new IllegalArgumentException("grado affettivo non può essere negativo");
		}
		if (gradoSazieta <0) {
			throw new IllegalArgumentException("grado sazietà non può essere negativo");
		}
		
	}
	private final static String LA_MORTE  =" hai usciso il tamagotchi";// messaggio per l'ucisione del tama 
	private final static String LA_TRESTEZZA  =" sono triste "; // messaggio per  visualizzare che  e' triste 
	
	
	private final static int MAX_BISCOTTI  = 20;//il massimo numero di biscotti da aggiungere
	private final static int MAX_CAREZZE   = 20;//il massimo numero di carezze da aggiungere
	private final static double ABBASAMENTO=0.1;
	private final static int MIN_BISCOTTI  = 0;//il minimo numero di biscotti da aggiungere
	private final static int MIN_CAREZZE   = 0;//il minimo numero di carezze da aggiungere
	
	
	public void riceviBiscotti(double biscotti,Tama tama_) {
	if(!(tama_.sonoMorto(tama_))){do {
		tama_.gradoSoddisfazione=tama_.gradoSoddisfazione+biscotti;// la'aggiunta dei biscotti
		tama_.gradoSazieta=tama_.gradoSazieta-(tama_.gradoSazieta*ABBASAMENTO);// per aabbasre del 10% il valore di sazieta'
		if(tama_.gradoSazieta<0 )
			tama_.gradoSazieta=0;
	
	}while(biscotti > MAX_BISCOTTI&& biscotti<MIN_BISCOTTI);// controllo addizionale}


}}
	public void riceviCarezze(double carezze,Tama tama_) {
		if(!(tama_.sonoMorto(tama_))){do {
			
			
			tama_.gradoSazieta=tama_.gradoSazieta+carezze;// per l'aggiunta delle carezze 
			tama_.gradoSoddisfazione=tama_.gradoSoddisfazione-(tama_.gradoSoddisfazione*ABBASAMENTO);	// per abbassare il grado di soddisfazione
			if(tama_.gradoSoddisfazione<0 )
				tama_.gradoSoddisfazione=0;
		}while(carezze > MAX_CAREZZE&& carezze< MIN_CAREZZE);// controllo addizionale

	}
	}	
	public void visualizzazione(Tama tama_)
	{ if(!tama_.sonoMorto(tama_))
		System.out.printf("\nil tipo e' tamagotchi\nil tamagotchi %s \n\nil suo gardo di sazieta' e'%.0f \n\n"
			+ "il grado di soddisfazione e'%.0f\n\n",tama_.nome,tama_.gradoSazieta,tama_.gradoSoddisfazione );
	else
		System.out.println(" il tama"+ nome+ "e' morto :(" );
		
		
	}
	
	public boolean sonoMorto (Tama tama_)
	{
		if(tama_.gradoSazieta <=0||  tama_.gradoSazieta >=100 ||tama_.gradoSoddisfazione<=0|| tama_.gradoSoddisfazione >=100 )// i controlli in coso della sua morte
			{return true;// rende il valore di ritorno vero
		
			}
		return false;//  rende il valore di controllo falso
		
		
		
	}
public boolean sonoTriste(Tama tama_)
{ if ((tama_.gradoSazieta >=80 ||tama_.gradoSazieta <=20||tama_.gradoSoddisfazione >=80 || tama_.gradoSoddisfazione <=20))// i controlli in situazione di trestezza
{System.out.println(LA_TRESTEZZA);;// messaggio per chiarire che e' triste
return true;// rende il valore di ritorno vero

}
return false;//  rende il valore di controllo falso



}
}

