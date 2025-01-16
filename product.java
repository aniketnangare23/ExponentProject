//1st create a classes
class Product{

//2nd create a methods 1 
public void displayProductDetails(){
	System.out.println("101 Bike 100000");

}
//2nd create a methods 2
public void displayProductaddress(){
	System.out.println("12 PCMC PUNE");
}
//2nd create a methods 3
public void displayOrderDetails(){
	System.out.println("1 4/12/2024 10:00AM");
}
//3rd create a main method and input the all above method call
public static void main(String[] args){
	Product all = new Product(); //(Product means class)(all means just reference )( new means memoryallocat)
	all.displayProductDetails(); // method calling
	all.displayProductaddress();
	all.displayOrderDetails();
}
}