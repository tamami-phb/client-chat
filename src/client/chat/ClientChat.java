package client.chat;

import client.chat.manager.MessageManager;
import client.chat.socket.SocketMessageManager;
import client.chat.ui.ClientUI;

/**
 *
 * @author tamami
 */
public class ClientChat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MessageManager messageManager;

        if(args.length == 0) {
            messageManager = new SocketMessageManager("localhost");
        } else {
            messageManager = new SocketMessageManager(args[0]);
        }

        ClientUI clientGui = new ClientUI(messageManager);
        clientGui.setSize(300,400);
        clientGui.setResizable(false);
        clientGui.setVisible(true);
    }
    
}
