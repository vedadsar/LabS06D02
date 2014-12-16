public class TestPackage {
	public static void main(String[] args) {

		System.out.println("Enter width ");
		double width = TextIO.getDouble();
		
		System.out.println("Enter height ");
		double height = TextIO.getDouble();
		System.out.println("Enter length ");
		double lenght = TextIO.getDouble();
		System.out.println("Enter weight ");
		double weight = TextIO.getDouble();
		
		Package paket = new Package(width, height, lenght, weight);
		System.out.println("Price of package is " +paket.getPrice());
		
		
	}
}
