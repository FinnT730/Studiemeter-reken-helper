package cf.finnt730.math;

public class ProcentNormal {



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
