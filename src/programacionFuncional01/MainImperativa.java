package programacionFuncional01;

import java.util.List;

public class MainImperativa {

	public static void main(String[] args) {

		List<Integer> numberList = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);
		
		int result = 0;
		for (Integer number : numberList) {
			if (number > 10) {
				result ++;
			}
		}
		
		System.out.println("Hay un total de " + result + " números que son mayor de 10");
	}

}
