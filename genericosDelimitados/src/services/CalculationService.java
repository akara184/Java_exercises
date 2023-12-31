package services;

import java.util.List;

public class CalculationService {

	public static <T extends Comparable<T>> T max(List<T> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		} 
		T max = list.get(0);
		for (T item : list) {
			//Basicamente ele verificar se um é maior que o outro
			//Se caso for positivo, o maior vira o max
			if (item.compareTo(max) > 0 ){
				max = item;
			}
		} 
		return max;
	}
}
