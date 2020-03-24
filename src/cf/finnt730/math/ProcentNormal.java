package cf.finnt730.math;

public class ProcentNormal {


    public float toename(float nieuw, float oud) {
        return (nieuw-oud)/oud * 100 * -1;
    }


    public float calc(int a, int b) {
        return (float) 100*b/a;
    }

    public float calc(float a, float b) {
        return a % b;
    }


    public int calc(int a, float b) {
        return (int) ((float)a % b);
    }


}
