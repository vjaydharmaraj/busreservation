package busrev;

public class bus {
    private int bus_no;
    private boolean ac;
    private int capacity;

    bus(int bus_no,boolean ac,int capacity)
    {
        this.bus_no = bus_no;
        this.ac = ac;
        this.capacity = capacity;
    }

    public int getBus_no() {
        return bus_no;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void DisplayInfo()
    {
        System.out.println("Bus No :"+bus_no +"  AC :"+ac+"  Capacity :"+capacity);
    }
}
