package ifsc;

public class Caminhao extends Veiculo{
	
	private int eixos;
	private String placa;
	private int ano;
	
	
	Caminhao (String placa, int ano, int eixos){
		this.placa = placa;
		this.ano = ano;
		this.eixos = eixos;
	}

	Caminhao(){
		
	}

	public int getEixos() {
		return eixos;
	}


	public void setEixos(int eixos) {
		this.eixos = eixos;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	@Override
	public String toString() {
			
		return "Placa: " + this.getPlaca()+ "\nAno: " + this.getAno() + "\nQuantidade de eixos: "+ this.getEixos();
	}
	
	
		
}
