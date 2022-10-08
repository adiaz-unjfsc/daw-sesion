package pe.unjfsc.daw.entity;

public class CECreditoProcesar {
	private String moneda;
	private double creditoProcesar;
	private double creditoDisponible;
	private double disponibleRetiro;
	private double cargoOperacion;
	
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	public double getCreditoProcesar() {
		return creditoProcesar;
	}
	public void setCreditoProcesar(double creditoProcesar) {
		this.creditoProcesar = creditoProcesar;
	}
	public double getCreditoDisponible() {
		return creditoDisponible;
	}
	public void setCreditoDisponible(double creditoDisponible) {
		this.creditoDisponible = creditoDisponible;
	}
	public double getDisponibleRetiro() {
		return disponibleRetiro;
	}
	public void setDisponibleRetiro(double disponibleRetiro) {
		this.disponibleRetiro = disponibleRetiro;
	}
	public double getCargoOperacion() {
		return cargoOperacion;
	}
	public void setCargoOperacion(double cargoOperacion) {
		this.cargoOperacion = cargoOperacion;
	}
	
	@Override
	public String toString() {
		return "CECreditoProcesar [moneda=" + moneda + ", creditoProcesar=" + creditoProcesar + ", creditoDisponible="
				+ creditoDisponible + ", disponibleRetiro=" + disponibleRetiro + ", cargoOperacion=" + cargoOperacion
				+ "]";
	}

}
