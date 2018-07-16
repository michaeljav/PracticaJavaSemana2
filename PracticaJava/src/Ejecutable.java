import java.time.LocalTime;
import java.util.Arrays;

public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Pelicula peliArra[] = new Pelicula[5];
		Serie serieArra[] = new Serie[5];
		
	
		
	  peliArra[0]= new Pelicula();
	  peliArra[0].setTitulo("Pelicula1");
	  peliArra[0].setGenero("Genero1");
	  peliArra[0].setCreador("Creador1");
	  peliArra[0].setAño(2001);	  
	  LocalTime tim = LocalTime.of(1, 40, 0);
	  peliArra[0].setDuracion(tim);
	  LocalTime tiempoVisto = LocalTime.of(1, 40, 0);
	  peliArra[0].setTiempoVisto(tiempoVisto);
	  peliArra[0].marcarVisto();
	 
	  peliArra[1]= new Pelicula("Pelicula2", "Genero2");	  
	  peliArra[2]= new Pelicula("Pelicula3","Genero3","Creador3",2003,LocalTime.of(1, 40, 0),LocalTime.of(0, 10, 2));	 
	  peliArra[3]= new Pelicula("Pelicula4","Genero4","Creador4",2004,LocalTime.of(1, 10, 0),LocalTime.of(0, 5, 2));
	  peliArra[4]= new Pelicula("Pelicula5","Genero5","Creador5",2005,LocalTime.of(1, 40, 0),LocalTime.of(1, 40, 0));
	  peliArra[4].marcarVisto();
	  
	  serieArra[0]= new Serie();
	  serieArra[0].setTitulo("Serie1");
	  serieArra[0].setGenero("Genero1");
	  serieArra[0].setCreador("Creador1");
	  serieArra[0].setAño(1991);	  
	  LocalTime timeseri = LocalTime.of(0, 40, 0);
	  serieArra[0].setDuracion(timeseri);
	  LocalTime SerieTiempoVisto = LocalTime.of(0, 40, 0);
	  serieArra[0].setTiempoVisto(SerieTiempoVisto);
	  serieArra[0].marcarVisto();
	  
	  
	  serieArra[1]= new Serie("Serie2", "Genero2");	  
	  serieArra[2]= new Serie("Serie3","Genero3","Creador3",3,1992,LocalTime.of(0, 40, 0),LocalTime.of(0, 6, 0));	 
	  serieArra[3]= new Serie("Serie4","Genero4","Creador4",4,1993,LocalTime.of(0, 40, 0),LocalTime.of(0, 14, 0));
	  serieArra[4]= new Serie("Serie5","Genero5","Creador5",5,1994,LocalTime.of(0, 40, 0),LocalTime.of(0, 40, 0));
	  serieArra[4].marcarVisto();
	  
	  
	  /*General*/
	  System.out.println("\n *****************************IMPRESION DE PELICULAS Y SERIES EN GENERAL");
	  for (Serie serie : serieArra) {
		  if(serie != null)
		System.out.println(serie.getTitulo()+":"+((serie.toString().replace('[', ' ').replace(']', ' '))));
	
	}
	 
	  for (Pelicula peli : peliArra) {
		  if(peli != null)
	//	
		  System.out.println(peli.getTitulo()+":"+((peli.toString().replace('[', ' ').replace(']', ' '))));
	
	}
	  
	  /*Peliculas y Series que se visualizaron completamente*/
	  System.out.println("\n *****************************PELICULAS Y SERIES QUE SE VIZUALIZARON COMPLETAMENTE");
	  for (Serie serie : serieArra) {
		  if(serie.visto == true) {
	//	
		System.out.println(serie.getTitulo()+":"+((serie.toString().replace('[', ' ').replace(']', ' '))));
		
		  }
	
	}
	 
	  for (Pelicula peli : peliArra) {
		  if(peli.visto == true) {
		//
		  System.out.println(peli.getTitulo()+":"+((peli.toString().replace('[', ' ').replace(']', ' '))));
	
	} 
	  }
		  
		  /*Serie con mas temporadas y pelicula del anio mas reciente*/
		  System.out.println("\n *****************************SERIE CON MAS TEMPORADAS Y PELICULA DEL ANIO MAS RECIENTE");
		  Arrays.sort(serieArra);		  
		  String ArraySerieOrdenadoDesc =Arrays.toString(serieArra);		  
		  String rr[] = ArraySerieOrdenadoDesc.split("]");		  
		  System.out.println("Serie con mas temporada: "+rr[0]);
		  
		 
		 
			  
			  Arrays.sort(peliArra);		  
			  String ArrayPelicOrdenadoDesc =Arrays.toString(peliArra);		  
			  String peliOrder[] = ArrayPelicOrdenadoDesc.split("]");		  
			  System.out.println("Pelicula del anio mas reciente: "+peliOrder[0]);
	  
	  
	 
	}

}

