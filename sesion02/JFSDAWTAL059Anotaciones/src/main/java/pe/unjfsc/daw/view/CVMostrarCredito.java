package pe.unjfsc.daw.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pe.unjfsc.daw.entity.CEConfigContext;
import pe.unjfsc.daw.entity.CECreditoProcesar;

public class CVMostrarCredito {
	private static final Logger LOG = LoggerFactory.getLogger("CVMostrarCredito");
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext oCntx = new AnnotationConfigApplicationContext();
		LOG.info("[DAW] Iniciando el contexto :{}", oCntx);
		
		LOG.info("[EVL] Registrar la notación : ");
		oCntx.register(CEConfigContext.class);
		oCntx.refresh();

		
		CECreditoProcesar oCredito = oCntx.getBean("idCECreditoProcesar", CECreditoProcesar.class);
		LOG.info("[DAW] Ojeto CECreditoProcesar :{}", oCredito);
		((ConfigurableApplicationContext) oCntx).close();
	}

}
