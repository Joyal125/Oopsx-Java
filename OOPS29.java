class Laptop2{
    private String Brand;
    private int RamSize;
    private int storageSize;

    public String getBrand(){
        return Brand;
    }
    public void setBrand(String n){
        Brand = n;
    }
    public int getRamSize(){
        return RamSize;
    }
    public void setRamSize(int i){
        RamSize = i;
    }
    public int getStorageSize(){
        return storageSize;
    }
    public void setStorageSize(int j){
        storageSize = j;
    }
}



public class OOPS29 {
    public static void main(String[] args) {
        Laptop2 s1 = new Laptop2();
        s1.setBrand("ASUS TUF F15");
        System.out.println(s1.getBrand());
        s1.setRamSize(16);
        System.out.println(s1.getRamSize());
        s1.setStorageSize(512);
        System.out.println(s1.getStorageSize());

    }
}
