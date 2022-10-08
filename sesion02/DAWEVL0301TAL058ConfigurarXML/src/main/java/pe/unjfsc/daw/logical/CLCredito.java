package pe.unjfsc.daw.logical;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.entity.CECreditoProcesar;

public class CLCredito {
	private static final Logger LOG = LoggerFactory.getLogger("CLCredito");
	
	public double resultadoSoles(CECreditoProcesar poCredito) {
		double rpta=0;
		LOG.info("[DAW] Objeto credito : {}", poCredito);
		rpta = poCredito.getCreditoProcesar() + poCredito.getCreditoDisponible() + poCredito.getDisponibleRetiro();
		LOG.info("[DAW] Resultado : {}", rpta);
		return rpta;
	}

	public double resultadoNoSoles(CECreditoProcesar poCredito) {
		double rpta=0;
		LOG.info("[DAW] Objeto credito : {}", poCredito);
		rpta = poCredito.getCreditoProcesar() - poCredito.getCreditoDisponible() + poCredito.getDisponibleRetiro();
		LOG.info("[DAW] Resultado : {}", rpta);
		return rpta;
	}
}
