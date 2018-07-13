import java.time.LocalTime;

public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Pelicula peliArra[] = new Pelicula[5];
		Serie serieArra[] = new Serie[5];
		
	  peliArra[0]= new Pelicula();
	  peliArra[0].setTitulo("Pelicula1");
	  peliArra[0].setGenero("Genero1");
	  peliArra[0].setCreador("Creador1");
	  peliArra[0].setAño(2000);	  
	  LocalTime tim = LocalTime.of(1, 30, 2);
	  peliArra[0].setDuracion(tim);
	  peliArra[0].marcarVisto(true);
	 
	  peliArra[1]= new Pelicula("Titulo2", "Genero2");
	  peliArra[1].setCreador("Creador2");
	  peliArra[1].setAño(2002);	  
	  LocalTime tim2 = LocalTime.of(0, 30, 2);
	  peliArra[1].setDuracion(tim2);
	  peliArra[1].marcarVisto(false);
	 
	  
	  serieArra[0]= new Serie();
	  serieArra[0].setTitulo("Serie");
	  serieArra[0].setGenero("Genero1");
	  serieArra[0].setCreador("Creador1");
	  serieArra[0].setAño(2005);	  
	  LocalTime timeseri = LocalTime.of(0, 40, 2);
	  serieArra[0].setDuracion(timeseri);
	  serieArra[0].marcarVisto(true);
	  
	  
	  serieArra[1]= new Serie();
	  serieArra[1].setTitulo("Serie2");
	  serieArra[1].setGenero("Genero2");
	  serieArra[1].setCreador("Creador2");
	  serieArra[1].setAño(2006);	  
	  LocalTime timeseri2 = LocalTime.of(0, 20, 2);
	  serieArra[1].setDuracion(timeseri2);
	  serieArra[1].marcarVisto(false);
	 
	  
	  for (Serie serie : serieArra) {
		  if(serie != null)
		System.out.println("\n"+serie.toString());
	
	}
	 
	  for (Pelicula peli : peliArra) {
		  if(peli != null)
		System.out.println("\n"+peli.toString());
	
	}
	 
	}

}
