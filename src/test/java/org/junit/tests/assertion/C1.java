package org.junit.tests.assertion;

import java.util.Comparator;
public class C1 implements Comparator{
    public C1(){
        super();
    }
    public  int compare(Object o1, Object o2){
        if((Integer)o1>(Integer)o2){
            return 1;
        }else{
            return 0;
        }
    }
}
