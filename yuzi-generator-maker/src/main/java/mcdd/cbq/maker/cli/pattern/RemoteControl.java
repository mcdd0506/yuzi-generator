package mcdd.cbq.maker.cli.pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * RemoteControl
 *
 * @version 1.0.0
 * @author: mcdd
 * @date: 2024/8/14 21:38
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RemoteControl {
    private Command command;

    public void pressButton() {
        command.execute();
    }

}
