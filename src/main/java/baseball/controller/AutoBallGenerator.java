package baseball.controller;

import baseball.model.Ball;

import java.util.ArrayList;
import java.util.List;
public class AutoBallGenerator {

    private static final int ZERO = 0;

    public static List<Ball> generate(List<Integer> balls) {
        List<Ball> ballItems = new ArrayList<>();
        for (int position=ZERO; position<balls.size(); position++) {
            ballItems.add(new Ball(position, balls.get(position)));
        }
        return ballItems;
    }

}
