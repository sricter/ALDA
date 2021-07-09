import java.net.Socket;

public class Newton {

	public static void main(String[] args) {
		double n = 49.0;			//n= Wert für den die Wurzel berechnet werden soll
		double x1;
		double x0;	
		double z=1.0E-5;		//so klein wie möglich
		
		x0=n;
		x1=(x0*x0+n)/(2*x0);
		while(Math.abs(x1-x0)>z) {
			x0=x1;
			x1=(x0*x0+n)/(2*x0);
		}
		System.out.println("Wurzel von " + n + " ist " +x1);
	}
}
