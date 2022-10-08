package pe.unjfsc.daw.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.entity.CECreditoProcesar;

public class CVMostrarCredito {
	private static final Logger LOG = LoggerFactory.getLogger("CVMostrarCredito");
	
	public static void main(String[] args) {
		
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-credito.xml");
		LOG.info("[DAW] Iniciando el contexto :{}", oCntx);
		
		CECreditoProcesar oCredito = oCntx.getBean("idCECreditoProcesar", CECreditoProcesar.class);
		LOG.info("[DAW] Ojeto CECreditoProcesar :{}", oCredito);
		
		((ConfigurableApplicationContext) oCntx).close();
	}

}
