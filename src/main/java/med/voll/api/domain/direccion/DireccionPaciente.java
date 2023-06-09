package med.voll.api.domain.direccion;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public @Data class DireccionPaciente {
	
	private String urbanización;
	private String numero;
	private String complemento;
	private String distrito;
	private String ciudad;
	private String codigopostal;
	private String provincia;
	
	public DireccionPaciente(DatosDireccionPaciente datosDireccionPaciente) {
		this.urbanización=datosDireccionPaciente.urbanización();
		this.numero=datosDireccionPaciente.numero();
		this.distrito=datosDireccionPaciente.distrito();
		this.complemento=datosDireccionPaciente.complemento();
		this.ciudad=datosDireccionPaciente.ciudad();
		this.codigopostal=datosDireccionPaciente.codigopostal();
		this.provincia=datosDireccionPaciente.provincia();
	}

	public void actualizarInformacion(DatosDireccionPaciente direccion) {
		this.urbanización=direccion.urbanización();
		this.numero=direccion.numero();
		this.distrito=direccion.distrito();
		this.complemento=direccion.complemento();
		this.ciudad=direccion.ciudad();
		this.codigopostal=direccion.codigopostal();
		this.provincia=direccion.provincia();
	}
}
