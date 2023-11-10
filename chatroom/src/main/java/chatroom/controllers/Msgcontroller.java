package chatroom.controllers;

import chatroom.models.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Msgcontroller {

    @MessageMapping("/msg")
    @SendTo("/topic/return-to")
    public Message getMessage(@RequestBody Message msg){

        return msg;

    }

}
