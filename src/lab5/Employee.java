package lab5;

public class Employee {

    private String name;

    private String email;

    private Integer hourRate;

    private Integer capacity;

    private Integer freeDays;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getHourRate() {
        return hourRate;
    }

    public void setHourRate(Integer hourRate) {
        this.hourRate = hourRate;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getFreeDays() {
        return freeDays;
    }

    public void setFreeDays(Integer freeDays) {
        this.freeDays = freeDays;
    }

    private Integer calculateDailyIncome(){
        return hourRate*capacity;
    }
    public void calculateMonthlyIncome(){
        System.out.println(calculateDailyIncome()*21-freeDays);
    }
}
