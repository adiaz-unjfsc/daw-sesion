package pe.unjfsc.daw.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pe.unjfsc.daw.logical.CLCredito;

@Configuration
public class CEConfigContext {

	@Bean
	public CECreditoProcesar idCECreditoProcesar() {
		return new CECreditoProcesar();
	}
	
	@Bean
	public CLCredito idCLCredito() {
		return new CLCredito();
	}
}
