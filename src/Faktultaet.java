public class Faktultaet {


 public static int rechneRekursion(int a){
	 
	 if (a<=1) {
		 return 1;
	 }
	 else {
		 return a*rechneRekursion(a-1);
	 }
 }
 public static int rechneIteration(int a) {
	 int result = 1;
	 
	 for (int i=1; i<=a; i++) {
		 result = result*i;
	 }

	 return result;
 }
 
 public static void main(String[] args) {
	 final long timeStart = System.currentTimeMillis();
	 
	 System.out.println("4! = "+rechneRekursion(4));
	 final long timeEnd = System.currentTimeMillis();
     System.out.println("Verlaufszeit der Schleife: " + (timeEnd - timeStart) + " Millisek.");
 }
}
