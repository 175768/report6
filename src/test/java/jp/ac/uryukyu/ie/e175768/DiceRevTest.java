package jp.ac.uryukyu.ie.e175768;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceRevTest {
    @Test
    void setDice() {
        int eye;
        for(;;){
            int ran = (int) (Math.random() * 6);
            eye = ran + 1;
            System.out.println(eye);

            if(eye==1){break;}
        }
    }

}