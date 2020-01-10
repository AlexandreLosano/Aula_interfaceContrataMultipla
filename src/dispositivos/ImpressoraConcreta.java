package dispositivos;

public class ImpressoraConcreta extends Dispositivo implements Impressora{

	public ImpressoraConcreta(String numeroSerial) {
		super(numeroSerial);
	}

	@Override
	public void processoDoDocumento(String doc) {
		System.out.println("Processo de Impress�o: " + doc);
	}

	@Override
	public void impressao(String doc) {
		System.out.println("Imprimindo " + doc);
	}
	
}
