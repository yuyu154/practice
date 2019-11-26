package com.example.websocket;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.socket.messaging.WebSocketStompClient;
import org.springframework.web.socket.sockjs.client.SockJsClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WebsocketApplicationTests {

	@Test
	public void webSocketTest() {
		WebSocketStompClient stompClient = new WebSocketStompClient(new SockJsClient());
	}
}
