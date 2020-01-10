package dispositivos;

public class DispositivoS extends Dispositivo implements Escaner, Impressora{

	public DispositivoS(String numeroSerial) {
		super(numeroSerial);
	}

	@Override
	public void impressao(String doc) {
		System.out.println("Combo impressao");
	}

	@Override
	public String escaner() {
		return "Combo Escaber";
	}

	@Override
	public void processoDoDocumento(String doc) {
		System.out.println("combo processo");
	}
	
	
}