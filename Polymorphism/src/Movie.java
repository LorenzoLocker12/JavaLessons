public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film ");
    }

    public static Movie getMovie(String title, String type){
        return switch (type.toUpperCase().charAt(0)){
            case 'C' -> new Comedy(title);
            case 'H' -> new Horror(title);
            default -> new Movie(title);
        };
    }
}
