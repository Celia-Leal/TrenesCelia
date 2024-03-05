package fp.TrayectosTren;

import java.time.LocalTime;
import java.util.List;

public interface TrayectoTren {
	 String getCodigoTren();
	 String getNombreProyecto();
	 TipoTren getTipo();
	 List<String> getestaciones();
	 List<LocalTime> getHorasSalida();
	 List<LocalTime> getHorasLlegada();
	 LocalTime getHoraSalida(String estacion);
	 LocalTime getHoraLlegada(String estacion);
	 void 
	 

	
	
	
}
