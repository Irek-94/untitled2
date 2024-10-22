package package5;

public enum Season {

    Winter(-30),Spring(-15),Summer(30),Autumn(10);

    private double avgTemp;

    Season(double avgTemp) {
        this.avgTemp = avgTemp;
    }

    public double getAvgTemp() {
        return avgTemp;
    }

    public void setAvgTemp(double avgTemp) {
        this.avgTemp = avgTemp;
    }
}
