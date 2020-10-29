
public class TipoTrabalho {
	
	private String codigoTrabalho;
	private String caracteristicas;
	
	
	public TipoTrabalho(String dado1, String dado2) { 
		this.codigoTrabalho = dado1;
		this.caracteristicas = dado2;
	}


	
	public String getCodigoTrabalho() {
		return codigoTrabalho;
	}

	public void setCodigoTrabalho(String codigoTrabalho) {
		this.codigoTrabalho = codigoTrabalho;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

}