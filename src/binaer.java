
public class binaer {
	public static int binaerRekursiv(int[] array, int key) {
		  return Rekursiv(array, 0, array.length, key);
		}

		public static int Rekursiv(
		    int[] array, int fromIndex, int toIndex, int key) {
		  if (toIndex <= fromIndex) return -1;

		  int mid = (fromIndex + toIndex) >>> 1;
		  int midVal = array[mid];

		  if (key == midVal) {
		    return mid;
		  } else if (key < midVal) {
		    return Rekursiv(array, fromIndex, mid, key);
		  } else {
		    return Rekursiv(array, mid + 1, toIndex, key);
		  }
		}
		
}
