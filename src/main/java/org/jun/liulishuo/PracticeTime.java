package org.jun.liulishuo;

import java.util.*;

public class PracticeTime {
    public static Float getTotalTimes(){
        float result = 0.0f;
        List<Float> totalTimes = new ArrayList<>();
        totalTimes.add(22.4f);
        totalTimes.add(2.5f);
        totalTimes.add(2.9f);
        totalTimes.add(23.3f);
        totalTimes.add(13.9f);
        totalTimes.add(14.9f);
        totalTimes.add(115.7f);
        totalTimes.add(66.0f);
        totalTimes.add(223.0f);

        for(Float item : totalTimes){
            result += item;
        }

        System.out.println("Total Practice Time: " + result);
        System.out.println("Need to practice time: " + (8 * 60 - result));

        return result;
    }
}
