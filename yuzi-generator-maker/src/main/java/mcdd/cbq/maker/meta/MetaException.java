package mcdd.cbq.maker.meta;

/**
 * MetaException
 *
 * @version 1.0.0
 * @author: mcdd
 * @date: 2024/8/15 19:59
 */
public class MetaException extends RuntimeException {

    public MetaException(String message) {
        super(message);
    }

    public MetaException(String message, Throwable cause) {
        super(message, cause);
    }
}
