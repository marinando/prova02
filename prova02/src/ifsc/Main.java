package ifsc;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
		Onibus onibus1 = new Onibus("EAD-4567", 1985, 45);
		Onibus onibus2 = new Onibus("FTG-1234", 1967, 56);
		Onibus onibus3 = new Onibus("GHJX-235", 2022, 34);
		
		Caminhao caminhao1 = new Caminhao("WERB-34578", 1872, 3);
		Caminhao caminhao2 = new Caminhao("LKPO-3489", 1954, 2);
		Caminhao caminhao3 = new Caminhao("BNJFG-0152", 1988, 4);
		
		ArrayList<Onibus> listaOnibus = new ArrayList<Onibus>();
		ArrayList<Caminhao> listaCaminhao = new ArrayList<Caminhao>();
		
			
		listaOnibus.add(onibus1);
		listaOnibus.add(onibus2);
		listaOnibus.add(onibus3);
		listaCaminhao.add(caminhao1);
		listaCaminhao.add(caminhao2);
		listaCaminhao.add(caminhao3);
				
		System.out.println("Lista dos Ônibus\n");
		for(Onibus item: listaOnibus) {
			System.out.println(item);
			System.out.println("_____________________________________________________________________________________\n");
		}
		
		System.out.println("Lista dos Caminhões\n");
		for(Caminhao item: listaCaminhao) {
			System.out.println(item);
			System.out.println("_____________________________________________________________________________________\n");
		}
	}

}
