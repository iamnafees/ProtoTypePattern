public class Laptop  implements ProtoTypeLaptop{

    private  String  brand;
    private  int ram;
    private  int storage;


    public Laptop(String  brand,int ram,int storage ){

        this.brand=brand;
        this.ram=ram;
        this.storage=storage;

    }

    public  String getBrand(){
        return  brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }


    public  int getRam(){
        return  ram;
    }

    public void setRam(int ram){
        this.ram = ram;
    }



    public  int getStorage(){
        return  storage;
    }

    public void setStorage(int storage){
        this.storage = storage;
    }

    @Override
    public Laptop clone(){

        Laptop laptop = new Laptop(this.brand,this.ram,this.storage);
        return  laptop;
    }

    public String toString(){
        String details = "Brand: "+this.brand+" "+"Ram: "+this.ram+" "+"Storage: "+this.storage;
        return details;
    }



}
