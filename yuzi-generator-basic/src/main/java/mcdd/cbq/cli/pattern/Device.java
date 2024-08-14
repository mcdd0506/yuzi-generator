package mcdd.cbq.cli.pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Device
 *
 * @version 1.0.0
 * @author: mcdd
 * @date: 2024/8/14 21:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Device {
    /**
     * 设备名称
     */
    private String name;

    /**
     * 开启设备
     */
    public void turnOn() {
        System.out.println(name + " turned on");
    }

    /**
     * 关闭设备
     */
    public void turnOff() {
        System.out.println(name + " turned off");
    }
}
