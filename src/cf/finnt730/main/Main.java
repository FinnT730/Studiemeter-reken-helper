package cf.finnt730.main;

import cf.finnt730.math.Add;
import cf.finnt730.math.ProcentNormal;
import cf.finnt730.math.Sub;

public class Main {


    public static void main(String[] args) {
        Add add = new Add();
        Sub sub = new Sub();
        ProcentNormal pro = new ProcentNormal();


        System.out.println((18.02-38.17)/38.17*100);
        System.out.println(pro.toename(36,(float)36+9));

    }


}
