package ifsc;

public class Onibus extends Veiculo{
	
	private int assentos;
	private String placa;
	private int ano;
	
	Onibus(String placa, int ano, int assentos){
		this.placa = placa;
		this.ano = ano;
		this.assentos = assentos;
	}
	
	Onibus(){
		
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

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}
	
	@Override
	public String toString() {
			
		return "Placa: " + this.getPlaca()+ "\nAno: " + this.getAno() + "\nQuantidade de Assentos: "+ this.getAssentos();
	}
	
}
