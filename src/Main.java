public class Main {
    public static void main(String[] args) {

        Laptop laptop=new Laptop("Asus",8,1024);

        System.out.println(laptop.toString());

        Laptop cloneObj = laptop.clone();
        System.out.println(cloneObj.toString());

        cloneObj.setStorage(2048);
        System.out.println(cloneObj);

        System.out.println(laptop.toString());

    }
}