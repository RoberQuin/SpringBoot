package med.voll.api.domain.direccion;

import jakarta.validation.constraints.NotBlank;

public record DatosDireccionPaciente(
		@NotBlank
		String urbanización, 
		@NotBlank
		String distrito, 
		@NotBlank
		String codigopostal,
		@NotBlank
		String ciudad, 
		String numero, 
		String complemento,
		@NotBlank
		String provincia) {

}
