package fp.TrayectosTren;

import java.time.Duration;
import java.time.LocalTime;
import java.util.List;

public class Tren {
	private String CodigoTren;
	private String NombreProyecto;
	private TipoTren tren;
	private List<String> estaciones;
	private List<LocalTime> HorasSalida;
	private List<LocalTime>HorasLlegada;
	private LocalTime HoraSalida;
	private LocalTime HoraLlegada;
	private Duration DuracionTrayecto;
	
	public Tren(String codigoTren, String nombreProyecto, TipoTren tren, List<String> estaciones, LocalTime horaSalida,
			LocalTime horaLlegada, Duration duracionTrayecto) {
		super();
		CodigoTren = codigoTren;
		NombreProyecto = nombreProyecto;
		this.tren = tren;
		this.estaciones = estaciones;
		HoraSalida = horaSalida;
		HoraLlegada = null;
		DuracionTrayecto = duracionTrayecto;
	}
	
	
	
	
	
	
	
}
