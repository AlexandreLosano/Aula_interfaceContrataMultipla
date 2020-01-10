package aplicacao;

import dispositivos.DispositivoS;
import dispositivos.EscanerConcreto;
import dispositivos.ImpressoraConcreta;

public class Programa {

	public static void main(String[] args) {
		
		ImpressoraConcreta i = new ImpressoraConcreta("1080");
		i.processoDoDocumento("TESTE");
		i.impressao("TESTE");

		EscanerConcreto e = new EscanerConcreto("2080");
		e.processoDoDocumento("Olá");
		System.out.println(e.escaner());

		DispositivoS d = new DispositivoS("20165");
		d.processoDoDocumento("apok");
		d.impressao("agda");
		System.out.println(d.escaner());
		
	}

}
