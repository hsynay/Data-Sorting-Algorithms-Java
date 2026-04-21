package algorithms;

public class Bubble_Sort {
	
	public static int [] Bubble(int [] array) {
		
		//Bubble Sort ilk olarak dizinin ilk 2 elemanını alır ve birbirleriyle karşılaştırır.
		//Küçük olanı önceki sıraya koyar. Büyük olanı ise bir sonraki (3. eleman) ile aynı şekilde karşılaştırır. 
		//Elinde sürekli 2 eleman bulunur ve en büyüğü hep elinde tutup bir snrakiyle karşılaştırır böylece en büyüğü en sona götürür.
		//Nested  loop ile çalışır If ile swap yapar. O(n^2)
		
		//int [] array = {23, 78, 45, 8, 32, 56};

		for (int i = 0; i < array.length - 1; i++) {
			
			for (int j = 0; j < array.length - 1 - i; j++) {
					
				if (array[j] > array[j + 1]) {
					
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}				
			}
		}
		
		return array;
		
	}
	
}
