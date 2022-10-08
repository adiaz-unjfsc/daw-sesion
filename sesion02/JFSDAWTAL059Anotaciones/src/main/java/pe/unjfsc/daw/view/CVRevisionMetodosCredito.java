package pe.unjfsc.daw.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pe.unjfsc.daw.entity.CEConfigContext;
import pe.unjfsc.daw.entity.CECreditoProcesar;
import pe.unjfsc.daw.logical.CLCredito;

public class CVRevisionMetodosCredito {
	private static final Logger LOG = LoggerFactory.getLogger("CVRevisionMetodosCredito");
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext oCntx = new AnnotationConfigApplicationContext();
		LOG.info("[DAW] Iniciando el contexto :{}", oCntx);
		
		LOG.info("[EVL] Registrar la notación : ");
		oCntx.register(CEConfigContext.class);
		oCntx.refresh();
		
		CECreditoProcesar oCredito = oCntx.getBean("idCECreditoProcesar", CECreditoProcesar.class);
		LOG.info("[DAW] Ojeto CECreditoProcesar :{}", oCredito);
		
		oCredito.setMoneda("S/");
		oCredito.setCreditoProcesar(1838.08);
		oCredito.setCreditoDisponible(8273.93);
		oCredito.setDisponibleRetiro(89.68);
		oCredito.setCargoOperacion(5.0);
		LOG.info("[DAW] Ojeto After CECreditoProcesar :{}", oCredito);
		
		CLCredito oCLCreditoEvaluar = oCntx.getBean("idCLCredito", CLCredito.class);
		
		double iResult = oCLCreditoEvaluar.resultadoNoSoles(oCredito);
		LOG.info("[DAW] Resultado :{}", iResult);		
		
		((ConfigurableApplicationContext) oCntx).close();
	}
}
