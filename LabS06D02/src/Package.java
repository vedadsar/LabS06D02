
public class Package {
private double width;
private double height;
private double lenght;
private double weight;
private double price;




public Package(double width, double height, double lenght, double weight){
	this.width = width;
	this.height=height;
	this.lenght=lenght;
	this.weight=weight;
}

public double getPrice(){
	this.price = this.weight *3;
	return price;
}

public double getWidth() {
	return width;
}
public void setWidth(double width) {
	this.width = width;
}
public double getHeight() {
	return height;
}
public void setHeight(double height) {
	this.height = height;
}
public double getLenght() {
	return lenght;
}
public void setLenght(double lenght) {
	this.lenght = lenght;
}
public double getWeight() {
	return weight;
}
public void setWeight(double weight) {
	this.weight = weight;
}

}
