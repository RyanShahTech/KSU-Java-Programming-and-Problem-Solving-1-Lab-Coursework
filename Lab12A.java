

class LightBulb
{
    private int wattage,totalWatts, ID;
    private boolean isLightBulbON;

    LightBulb()
    {
        ID = 0;
        wattage = 40;
        totalWatts = 0;
        isLightBulbON = false;
    }

    LightBulb(int ID, int wattage)
    {
        this.ID = ID;
        this.wattage = wattage;
        totalWatts = 0;
        isLightBulbON = false;
    }

    void setIsLightBulbON(boolean value)
    {
        isLightBulbON = value;
    }

    void print()
    {
        String bulbStatus = isLightBulbON ? "on" : "off";
        System.out.println("Bulb " + ID + " is " + bulbStatus + " and has used " + totalWatts + " watt-hours.");
    }

    void incrementTime(int hours)
    {
        if(isLightBulbON)
        {
            totalWatts += wattage*hours;
        }
    }

    public static void main(String[] args)
    {

        LightBulb bulb1 = new LightBulb();
        LightBulb bulb2 = new LightBulb(1, 100);

        bulb1.print();
        bulb2.print();

        bulb2.setIsLightBulbON(true);

        bulb1.incrementTime(5);
        bulb2.incrementTime(5);

        bulb1.print();
        bulb2.print();
    }
}
