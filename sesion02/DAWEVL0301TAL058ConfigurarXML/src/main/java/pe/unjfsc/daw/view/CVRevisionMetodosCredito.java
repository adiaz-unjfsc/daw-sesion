package pe.unjfsc.daw.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.entity.CECreditoProcesar;
import pe.unjfsc.daw.logical.CLCredito;

public class CVRevisionMetodosCredito {
	private static final Logger LOG = LoggerFactory.getLogger("CVRevisionMetodosCredito");
	
	public static void main(String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-credito.xml");
		LOG.info("[DAW] Iniciando el contexto :{}", oCntx);
		
		CECreditoProcesar oCredito = oCntx.getBean("idCECreditoProcesar", CECreditoProcesar.class);
		LOG.info("[DAW] Ojeto Before CECreditoProcesar :{}", oCredito);
		
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
