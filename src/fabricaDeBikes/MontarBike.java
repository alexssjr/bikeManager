package fabricaDeBikes;

public class MontarBike {
	public static void main(String[] args) {

		for (Bike.MarcaBike marca : Bike.MarcaBike.values())
			System.out.println(marca);
	}
}
