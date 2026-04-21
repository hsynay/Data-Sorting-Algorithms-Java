package algorithms;

public class Selection {
	
	public static int [] selectionSort(int [] array) {
		
		//Selection sort nested for ile çalışır. 
		//Arraydaki bir elemanı(Her eleman için bunu sırayla yapar) alıp diğer tüm elemanlar ile karşılaştırır. If ile yer değişikliği yapar. 
		//Zaman karmaıklığı O(n^2). 
		//Alan Karmaşıklığı: O(1), çünkü Seçim sıralama algoritması için ekstra alan gerekmiyor.
		//array = [78, 45, 12, 89, 67, 34]
		

		for (int i = 0; i < array.length-1; i++) {
			
			for (int j = i+1; j < array.length; j++) {
				
				if (array[j] < array[i]) {
					int temp = array[i];		// temp ->78
					array[i] = array[j];		// 0->45
					array[j] = temp;			// 1->78
			}	
		}
		
	}
	
	return array ;
	}
}
