class Movie {
    private String genre;
    private int Rating;
    private String title;

    public String getgenre(){
        return genre;
    }
    public void setGenre(String n){
        genre = n;
    }
    public int getRating(){
        return Rating;
    }

    public void setRating(int rating) {
        Rating = rating;
    }
    public String gettitle(){
        return title;
    }
    public void setTitle(String i){
        title = i;
    }
}


public class OOPS30 {
    public static void main(String[] args) {
        Movie s1 = new Movie();
        s1.setGenre("Science Fiction");
        System.out.println(s1.getgenre());
        s1.setRating(9);
        System.out.println(s1.getRating());
        s1.setTitle("The Martin");
        System.out.println(s1.gettitle());
    }
}
