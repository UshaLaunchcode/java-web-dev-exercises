package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {

    @Override
    public int compare(Cone o1, Cone o2) {
        //Positive integer if o1 is greater than 02
        //Negative integer if o1 is greater than 02
        //Zero if o1 o2 are equal
        if (o1.getCost() > o2.getCost()) {
            return 1;
        } else if(o1.getCost() < o2.getCost()){
            return -1;
        }else{
            return 0;
        }
    }
}
