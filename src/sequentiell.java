
public class sequentiell {
	public static int sequentielleSuche (int[] feld, int schluessel) {
	   int Index = 0;
	   while (Index< feld.length && feld[Index] < schluessel) Index++;
	      if ((Index < feld.length) && (feld[Index] == feld[schluessel])) 
	           return Index; // Erfolg
	      else return -1; //kein Erfolg
	}
}
