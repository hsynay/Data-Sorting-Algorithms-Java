package algorithms;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] array = {
			    78, 45, 12, 89, 67, 34, 23, 90, 11, 56,
			    98, 34, 76, 29, 3, 88, 55, 22, 77, 44,
			    19, 50, 66, 81, 13, 92, 40, 25, 61, 30,
			    74, 2, 38, 85, 99, 63, 8, 41, 47, 58,
			};
		/*
		Random rand = new Random();
		int [] array = new int[1000];
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(1000);
			
		}*/
		System.out.print("UNSORTED ARRAY: ");
		
		for (int i = 0; i < array.length-1; i++) {
			
			System.out.print(array[i] + ",");
	
		}
		
		
		System.out.println("\n\nLütfen sıralama yapmak istediğiniz algoritmayı seçin ve yanındaki numarasını giriniz. "
				+ "\n\n1-Selection Sort"
				+ "\n2-Insertion Sort"
				+ "\n3-Bubble Sort"
				+ "\n4-Recursive Insertion Sort"
				+ "\n5-Merge Sort");
		System.out.print("\nNo: ");
		
		
		Scanner input = new Scanner(System.in);
		int no = input.nextInt();
		
		switch (no) {
		case 1:
			
			System.out.print("\nSelection Sort:");

			//Selection Sort
			long startSelection = System.nanoTime(); // Başlangıç zamanı
			Selection.selectionSort(array);
            long endSelection = System.nanoTime(); // Bitiş zamanı

			for (int i = 0; i < array.length-1; i++) {
			
				System.out.print(array[i] + ",");
		
			}
            System.out.println("\nSelection Sort Çalışma Süresi: " + (endSelection - startSelection) / 1_000_000.0 + " ms");

			break;
		case 2:
			
			System.out.print("\nInsertion Sort:");
			
			//Insertion Sort
            long startInsertion = System.nanoTime();
			Insertion_Sort.Insertion(array);
            long endInsertion = System.nanoTime();

			for (int i = 0; i < array.length-1; i++) {
				System.out.print(array[i] + ",");
			}
			System.out.println("\nInsertion Sort Çalışma Süresi: " + (endInsertion - startInsertion) / 1_000_000.0 + " ms");
			
			break;
		case 3:
			System.out.print("\nBubble Sort:");
			
			//Bubble Sort
			
            long startBubble = System.nanoTime();
            Bubble_Sort.Bubble(array);
            long endBubble = System.nanoTime();
            
            for (int i = 0; i < array.length-1; i++) {
			
				System.out.print(array[i] + ",");
		
			}
            System.out.println("\nBubble Sort Çalışma Süresi: " + (endBubble - startBubble) / 1_000_000.0 + " ms");
			
			break;
		case 4:
			
			System.out.print("\nRecursive Insertion Sort: ");
			
			//Recursive Insertion Sort
            long startRecursive = System.nanoTime();
            Recursive_Insertion_Sort.RecursiveInsertion(array, array.length);
            long endRecursive = System.nanoTime();
            
            for (int i = 0; i < array.length-1; i++) {
			
				System.out.print(array[i] + ",");
		
			}
            System.out.println("\nRecursive Insertion Sort Çalışma Süresi: " + (endRecursive - startRecursive) / 1_000_000.0 + " ms");
			
            break;
		case 5:
			
			System.out.print("\nMerge Sort: ");
			
			//Recursive Insertion Sort
            long startMerge = System.nanoTime();
            Merge_Sort.mergeSort(array);
            long endMerge = System.nanoTime();
            
            for (int i = 0; i < array.length-1; i++) {
			
				System.out.print(array[i] + ",");
		
			}
            System.out.println("\nMerge Sort Çalışma Süresi: " + (endMerge - startMerge) / 1_000_000.0 + " ms");
			
            break;
		default:
			System.out.println("Lütfen yukarıdaki numaralardan birini giriniz!!!");
			break;
		}


	}

}
