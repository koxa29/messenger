package com.messenger.entities;

import java.util.Date;

public class Message {

    private String uuid;
    private String content;
    private Date sent;
    private Sender sender;
    private ActionType actionType;

    public String getContent() {
        return content;
    }

    public Message setContent(String content) {
        this.content = content;
        return this;
    }

    public Date getSent() {
        return sent;
    }

    public Message setSent(Date sent) {
        this.sent = sent;
        return this;
    }

    public Sender getSender() {
        return sender;
    }

    public Message setSender(Sender sender) {
        this.sender = sender;
        return this;
    }

    public ActionType getActionType()
    {
        return actionType;
    }

    public Message setActionType( ActionType actionType )
    {
        this.actionType = actionType;
        return this;
    }
}
