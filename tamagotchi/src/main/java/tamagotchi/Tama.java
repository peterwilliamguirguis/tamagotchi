package tamagotchi;

public class Tama {
	protected String nome;// attributo del nome
	protected double gradoSazieta;// attrubuto del grado di sazieta
	protected double gradoSoddisfazione;// attrubuto del grado di soddisfazione
	

	
	
	
	public String getNome() {
		return nome;
	}// il getter dell'attributo
	public void setNome(String nome) {
		this.nome = nome;
	}//il setter dell'attributo
	public double getGradoSazieta() {
		return gradoSazieta;
	}// il getter dell'attributo
	public void setGradoSazieta(double gradoSazieta) {
		this.gradoSazieta = gradoSazieta;
	}//il setter dell'attributo
	public double getGradoSoddisfazione() {
		return gradoSoddisfazione;
	}// il getter dell'attributo
	public void setGradoSoddisfazione(double gradoSoddisfazione) {
		this.gradoSoddisfazione = gradoSoddisfazione;
	}//il setter dell'attributo
	public Tama(String nome, double gradoSazieta, double gradoSoddisfazione) {
		this.nome = nome;
		this.gradoSazieta = gradoSazieta;
		this.gradoSoddisfazione = gradoSoddisfazione;
	}
	public void riceviBiscotti(double biscotti,Tama tama_) {
	
}
	public void visualizzazione(Tama  tama_)
	{ 
		
		
	}
	public void riceviCarezze(double carezze,Tama tama_) {
		
	}
	public boolean sonoMorto(Tama tama_) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean sonoTriste(Tama tama_)
	{ return true;



	}
	
}
