package programacionFuncional02;

import java.util.List;
import java.util.Optional;

public class Main {

	public static void main(String[] args) {

		List<Product> shoppingCart = List.of(
				new Product("Clothes", 15.90, Tax.NORMAL),
				new Product("Bread", 1.5, Tax.SUPERREDUCED),
				new Product("Meat", 13.99, Tax.REDUCED),
				new Product("Cheese", 3.59, Tax.SUPERREDUCED),
				new Product("Coke", 1.89, Tax.REDUCED),
				new Product("Wiskey", 19.90, Tax.NORMAL)
				);
		
				
		Optional<Double> shoppingTotal = shoppingCart.stream()
				.map(product -> product.price).reduce( (x, y) -> x + y);
		
		System.out.println("Coste total de la compra: " + shoppingTotal.get() + "€");
		
		Optional<Double> totalWithTaxes = shoppingCart.stream()
				.map(product -> product.price + ((product.price * product.tax.percent) / 100)).reduce( (x, y) -> x + y);
		
		System.out.println("Coste total de la compra: " + totalWithTaxes.get() + "€");
	}

}
