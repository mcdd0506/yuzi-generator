package mcdd.cbq.cli.pattern;

import lombok.val;

/**
 * Client
 *
 * @version 1.0.0
 * @author: mcdd
 * @date: 2024/8/14 21:39
 */
public class Client {
    public static void main(String[] args) {
        Device tv = new Device("tv");
        Device game = new Device("game");

        TurnOnCommand tvTurnOn = new TurnOnCommand(tv);
        TurnOffCommand tvTurnOff = new TurnOffCommand(tv);

        TurnOnCommand gameTurnOn = new TurnOnCommand(game);
        TurnOffCommand gameTurnOff = new TurnOffCommand(game);

        RemoteControl control = new RemoteControl();

        control.setCommand(tvTurnOn);
        control.pressButton();

        control.setCommand(tvTurnOff);
        control.pressButton();

        control.setCommand(gameTurnOn);
        control.pressButton();

        control.setCommand(gameTurnOff);
        control.pressButton();

    }
}
