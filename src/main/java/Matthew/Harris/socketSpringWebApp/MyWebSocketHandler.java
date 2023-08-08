package Matthew.Harris.socketSpringWebApp;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class MyWebSocketHandler extends TextWebSocketHandler {

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message){
        String receivedMessage = message.getPayload();
        String responseMessage = "Hello from the Server !";
        try{
            session.sendMessage(new TextMessage(responseMessage));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    @Override
    public void afterConnectionEstablished(WebSocketSession session){
     try {
         super.afterConnectionEstablished(session);
         System.out.println("Connection Established - Message from My Code");
     } catch (Exception e) {
         System.out.println(e.getMessage());
     }
    }

}
