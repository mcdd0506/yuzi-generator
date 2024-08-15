package mcdd.cbq.maker.cli.pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TurnOffCommand
 *
 * @version 1.0.0
 * @author: mcdd
 * @date: 2024/8/14 21:37
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TurnOffCommand implements Command {
    private Device device;

    @Override
    public void execute() {
        device.turnOff();
    }
}
