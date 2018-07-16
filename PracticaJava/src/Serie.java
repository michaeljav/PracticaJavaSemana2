
import java.time.LocalTime;



public class Serie extends Video implements IVisualizable,Comparable<Serie>  {


	private int no_temporada;

	
	
	public Serie() {
		
		this.no_temporada =1;
	    super.visto =false;
	}
	
	public Serie(String titulo, String creador) {

		super(titulo,creador);
	
		}
	
	
	public Serie(String titulo, String genero, String creador,int no_temporada, int año, LocalTime duracion,LocalTime tiempoVisto) {
		super( titulo,  genero,  creador,  año,  duracion,tiempoVisto);
		  super.visto =false;
		  this.no_temporada=no_temporada;
		
	}
	
	
	/*public Serie(int no_temporada, String genero, LocalTime duracion) {
	//	super("Creado por defecto",genero, "Michael Javier", no_temporada, duracion,false);
		this.no_temporada = no_temporada;
			
	
	}*/

	
	public int getNo_temporada() {
		return no_temporada;
	}
	public void setNo_temporada(int no_temporada) {
		
		this.no_temporada = no_temporada;
	}


	@Override
	public String toString() {
		
		String resul ="["
				+ "  titulo=" + getTitulo() 
				+ ", genero=" + getGenero() 
				+ ", creador=" + getCreador()
				+ ", año=" + getAnio()
				+ ", duracion=" + getDuracion()
				+ ", tiempoVisto=" + getTiempoVisto()
				+ ", visto=" + esVisto()
				+"  no_temporada=" + getNo_temporada() +"]";
		return resul;
		
		
	}

	@Override
	public void marcarVisto() {
		// TODO Auto-generated method stub
		
        super.visto = true;
		
	}

	@Override
	public boolean esVisto() {
		// TODO Auto-generated method stub
		return super.visto;
	}

	@Override
	public LocalTime tiempoVisto() {
		// TODO Auto-generated method stub
		return getTiempoVisto();
	}

	@Override
	public int compareTo(Serie arg0) {
		// TODO Auto-generated method stub
		// return Integer.valueOf(no_temporada).compareTo(arg0.no_temporada);
		 return Integer.valueOf(arg0.no_temporada).compareTo(no_temporada);
	}



	
	
}
