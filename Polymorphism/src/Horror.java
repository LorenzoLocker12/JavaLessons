public class Horror extends Movie{


    public Horror(String title){
        super(title);
    }


    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3), "Pleasent Scene", "Scary music", "Something Bad happens");

    }
}
