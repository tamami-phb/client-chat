package client.chat.socket;

/**
 *
 * @author tamami
 */
public interface SocketMessengerConstants {
    
    public static final String MULTICAST_ADDRESS = "239.0.0.1";

    public static final int MULTICAST_LISTENING_PORT = 5555;

    public static final int MULTICAST_SENDING_PORT = 5554;

    public static final int SERVER_PORT = 5000;

    public static final String DISCONNECT_STRING = "DISCONNECT";

    public static final String MESSAGE_SEPARATOR = ">>>";

    public static final int MESSAGE_SIZE = 512;
    
}
