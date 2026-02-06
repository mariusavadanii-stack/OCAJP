package OopGettersNSetters;

public class GettersNSetters {

    String brand;    // brand este o variabila a clasei GettersNSetters
    int year;


    public static void main(String[] args){
        GettersNSetters car = new GettersNSetters();
//        car.brand = "Toyota";
//        car.year = 2014;
        car.setBrand("dacia");
        car.setYear(8);
        System.out.println(car.getBrand());
        System.out.println(car.getYear());

        car.printDetails();

    }
    // setter - sets within the parameter to the variable
    // no 'static' key word because it will be access throughh the class if 'static' word will be present ->
    // car.setBrand("toyota"); -> setBrand("toyota");
    public void setBrand(String brand){   // brand aici este parametru al methodei setBrand
        this.brand = brand;             //  'this' arata ca "brand" - variabila a clasei GettersNSetters = "brand" parametru  methodei setBrand
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        }
    }
    // getters
    public String getBrand(){

        return this.brand;
    }
    public Integer getYear(){

        return this.year;
    }

    public void printDetails(){
//        System.out.println(brand + ", " + year );
        System.out.println(getBrand() + ", " + getYear() );
    }
}
