package dispositivos;

public class EscanerConcreto extends Dispositivo implements Escaner{

	public EscanerConcreto(String numeroSerial) {
		super(numeroSerial);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processoDoDocumento(String doc) {
		System.out.println("Processo a ser Escaneado " + doc);
	}

	@Override
	public String escaner() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
