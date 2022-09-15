package com.example.Balloon;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;

@Service
public class balloonService {
    public int countBalloons(String s) {
        int[] counters=new int[]{0,0,0,0,0};
        for(String c:s.split("")){
            switch (c){
                case "B":
                    counters[0]++;
                    break;
                case "A":
                    counters[1]++;
                    break;
                case "L":
                    counters[2]++;
                    break;
                case "O":
                    counters[3]++;
                    break;
                case "N":
                    counters[4]++;
                    break;
            }
        }
        counters[2]/=2;
        counters[3]/=2;
        int min=counters[0];
        for(int i = 1; i<counters.length;i++){
            if(counters[i]<min){
                min=counters[i];
            }
        }
        return min;
    }

}
