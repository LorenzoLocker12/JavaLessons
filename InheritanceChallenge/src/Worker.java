public class Worker {

    private String name;
    private String dateOfBirth;
    protected String endDate;

    public Worker(){

    }

    public Worker(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge(){
        int currentYear = 2023;
        int birthYear = Integer.parseInt(dateOfBirth.substring(6));

        return (currentYear - birthYear);
    }

    public double collectPay(){
        return 0.00;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
