package algorithms;

public class Recursive_Insertion_Sort {
	
	public static void RecursiveInsertion(int [] arr, int n) {
		
		//Recursive Insertion Sort yinelemeli bir şekilde arrayi tek elemana indirgeyene kadar recursive olarak çalışır.
		//Elinde son eleman kaldığında recursive çağrısı if koşuluyla durdurulur.
		//Tek eleman tekrar ters recursive yaparak sıralanıp birşeltirilir.
		//ÖrnekArray = 7, 8, 6, 5 olsun resursive ile tek elemana ulaşma
		//7, 8, 6, 5				 RecursiveInsertion(ÖrnekArray, 4);
		//7, 8, 6		5			 RecursiveInsertion(ÖrnekArray, 3);
		//7, 8		6		5		 RecursiveInsertion(ÖrnekArray, 2);
		//7		8		6		5	 RecursiveInsertion(ÖrnekArray, 1); -> !!! n = 1 return;
		//7, 8 		6		5   = RecursiveInsertion(ÖrnekArray, 2); 	Recursive durduğu için sıralayıp birleştirme başlar
		//6, 7, 8		5		= RecursiveInsertion(ÖrnekArray, 3);	
		//5, 6, 7, 8			= RecursiveInsertion(ÖrnekArray, 4);	Birleştirme tamamlandı
		
		
		
		if (n <= 1) {
			return;
		}
		
		RecursiveInsertion(arr, n -1);
		
		//Recursive bittiğinde tek kalan eleman ve ondan önceki eleman eşiltlenir ve while ile karşılaştırılıp tekrar birleştirilir.
        int last = arr[n-1]; 	//Son eleman templenir
        int j = n-2; 			//Karşılaştırılmak için sondan önceki elemanın indexi alınır
       
        /* Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position */
        while (j >= 0 && arr[j] > last) { 
            arr[j+1] = arr[j]; 
            j--; 
        } 
        arr[j+1] = last; // karşılaştırma işlemi bittikten sonra(eldeki elemanın yeri bulunduğunda elde kalan elemanı 
        				//son karşılaştırılan elemandan sonraki indexe yerleştirme
    }
}
	
	
