public class HotWater extends Product{
    private int volume;
    private int temp;
    public HotWater(String name, int cost, int volume, int temp) {
        super(name, cost);
        this.volume = volume;
        this.temp = temp;
    }

    public int getVolume() {
        return volume;
    }


    public void setVolume(int volume) {
        this.volume = volume;
    }

    
    public int getTemp() {
        return temp;
    }


    public void setTemp(int volume) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "HotWater{" +
                "name=" + super.getName() +
                ";cost=" + super.getCost() +
                ";volume=" + volume +";temp=" + temp +
                '}';
    }
}
