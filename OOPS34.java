class Book{
    private String Title;
    private int Price;
    private String Author;

    public String getTitle(){
        return Title;
    }
    public void setTitle(String n){
        Title = n;
    }
    public int getPrice(){
        return Price;
    }
    public void setPrice(int i){
        Price = i;
    }
    public String getAuthor(){
        return Author;
    }
    public void setAuthor(String j){
        Author = j;
    }

}


public class OOPS34 {
    public static void main(String[] args) {
Book s1 = new Book();
s1.setTitle("Sherlock Holmes");
System.out.println("Title:"+s1.getTitle());
s1.setPrice(756);
System.out.println("Price:"+s1.getPrice());
s1.setAuthor("ARTHUR CONAN DOYLE");
System.out.println("Author:"+s1.getAuthor());
    }
}
