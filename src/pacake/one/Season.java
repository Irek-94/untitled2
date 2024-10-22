package pacake.one;

public enum Season {

    Winter(-30), Spring(-15), Summer(30), Autumn(15);

    private double avgTmp;

    Season(double avgTmp) {
        this.avgTmp = avgTmp;
    }
}
