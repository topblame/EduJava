package chapter14.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MessageMain_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail", "이호준"));
		messageQueue.offer(new Message("sendSNS", "김지영"));
		messageQueue.offer(new Message("sendKaKaoTalk", "김민주"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();  // 선입선출
			switch ( message.command) {
				case "sendMail":{
					System.out.println(message.to + "님에게 메일을 보냈습니다.");
					break;
				}//case
				case "sendSNS":{
					System.out.println(message.to + "님에게 SNS를 보냈습니다.");
					break;
				}//case
				case "sendKaKaoTalk":{
					System.out.println(message.to + "님에게 카카오톡을 보냈습니다.");
					break;
				}//case
				
			}//switch
		}//while
	}//main

}
