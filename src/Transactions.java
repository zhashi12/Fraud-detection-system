public class Transactions {
    private int cost;
    private String city;
    private String time; //Using ISO 8601: YYYY-MM-DDTHH:MM:SS
    public Transactions(int Cost,String City,String Time){
        this.cost = Cost;
        this.city = City;
        this.time = Time;
    }
    public int getCost(){
        return this.cost;
    }
    public String getCity(){
        return this.city;
    }
    public String getTime(){
        return this.time;
    }


}
