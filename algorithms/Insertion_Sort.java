package algorithms;

public class Insertion_Sort {
	
	public static int [] Insertion(int [] array) {
		//Eklemeli sıralama
		//Insertion Sort arrayin ilk olarak 2. elemanını alır ve ondan bir önceki elaman ile karşılaştırır.
		//Eğer önceki eleman daha büyükse onu kendi yerine taşır ve ondan bir sonraki ile aynı şekilde karşılaştırır.
		//Böylece her elemanı kendinden önceki her eleman ile karşılaştırıp yer değiştirme yapar.
		//Nested loop ile çalışır ve temp değişkeniyle karşılaştıracağı elemanı tutar.
		//int [] array = {23, 78, 45, 8, 32, 56};
		
		for (int i = 1; i < array.length; i++) {
					
			int temp = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > temp) {
				
				array[j + 1] = array[j];			
				array[j] = temp;
				j--;	
			}
		}
		return array;
		
		/*for (int i = 0; i < array.length -1; i++) {
		
		int temp = array[i];

		for (int j = i + 1; j < array.length; j++) {

			if (array[j] < array[i]) {
				
				array[i] = array[j];
				array[j] = temp;
			}
		}
		return array;
	}*/
		
}	
	
	
}
