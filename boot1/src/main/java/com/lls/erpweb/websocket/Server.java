package com.lls.erpweb.websocket;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/server/{name}")
public class Server {
	private Map<String, Session> map = new HashMap<>();

	@OnOpen
	public void open(Session session, @PathParam("name") String name) {
		System.out.println(name + "Login!");
		System.out.println(session.getClass());
	}

	@OnMessage
	public void message(String message, Session session) throws IOException {
		Set<Session> sessions = session.getOpenSessions();
		for (Session s : sessions) {
			System.out.println(message);
			s.getBasicRemote().sendText(message);
		}
	}

	@OnClose
	public void close(Session session, @PathParam("name") String name) {
		System.out.println(name + "用户退出");
	}
}
