package baseball;

import baseball.controller.BaseBallGame;
import baseball.model.Balls;

public class Application {
    public static void main(String[] args) {
        do {
            Balls computer = BaseBallGame.ready();
            BaseBallGame.start(computer);
        } while(BaseBallGame.isNewGame());
    }
}
