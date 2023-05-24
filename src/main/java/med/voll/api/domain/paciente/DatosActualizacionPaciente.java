package med.voll.api.domain.paciente;

import jakarta.validation.Valid;
import med.voll.api.domain.direccion.DatosDireccionPaciente;

public record DatosActualizacionPaciente(
	    Long id,
	    String nombre,
	    String telefono,
	    @Valid DatosDireccionPaciente direccion
	) {}
