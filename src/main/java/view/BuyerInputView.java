package view;

import camp.nextstep.edu.missionutils.Console;
import domain.enums.GameMessage;

public class BuyerInputView {
    public static String getInputPrice() {
        System.out.println(GameMessage.PROMPT_MESSAGE.getGameMessage());
        return Console.readLine();
    }


}
