package com.ttn.demo1;

import com.ttn.demo1.Sorting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
    //When multiple component is available for a bean to be autowired with,
    // then we can resolve this by below three ways:
    //1) Autowiring by @primary annotation: gives the component the highest priority over other mentioned components

    //2)Autowiring by name: While creating the reference of the dependency(in this case Sorting)
    // specify the name of algorithm as a variable name to get autowired with that specific class

    //3)Autowiring by Qualifier notation: add Qualifier to give a name to each component
    // and at the time of Autowiring,
    // mention that Qualifier annotation for which you want to get the bean of the class
    @Autowired
    //@Qualifier("Quick")
    Sorting sortList;
    BinarySearchImpl(Sorting sort){
        this.sortList=sortList;
    }
    public boolean binarySearch(int[] numbers,int searchNo)
    {
        sortList.sort(numbers);
        int l=0, u = numbers.length-1, m;
        while(l<=u)
        {
            m=l+(u-l)/2;
            if(numbers[m]==searchNo)
                return true;
            else if(numbers[m] < searchNo)
                l=m+1;
            else
                u=m-1;
        }
        return false;
    }
}
