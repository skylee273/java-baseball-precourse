package baseball.controller;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;

public class RandomNumberGenerator {
    private static final int MAX_NUM = 9;
    private static final int MIN_NUM = 1;
    private static final int NUM_LEN = 3;


    public ArrayList<Integer> generateRandomNumberList() {
        ArrayList<Integer> computerNumberList = new ArrayList<>();
        while(computerNumberList.size() < NUM_LEN) {
            computerNumberList.add(generateRandomNumber());
        }
        return computerNumberList;
    }

    private int generateRandomNumber() {
        return Randoms.pickNumberInRange(MIN_NUM, MAX_NUM);
    }

}
