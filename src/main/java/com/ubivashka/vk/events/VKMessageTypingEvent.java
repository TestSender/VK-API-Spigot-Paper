package com.ubivashka.vk.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.ubivashka.vk.callback.objects.MessageTyping;

public class VKMessageTypingEvent extends Event {
	private static final HandlerList handlers = new HandlerList();
	private MessageTyping messageTyping;

	public VKMessageTypingEvent(MessageTyping message) {
		setMessageTyping(message);
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

	@Override
	public final HandlerList getHandlers() {
		return handlers;
	}

	public MessageTyping getMessageTyping() {
		return messageTyping;
	}

	public String getState() {
		return messageTyping.getState();
	}

	public Integer getToId() {
		return messageTyping.getToId();
	}

	public Integer getFromId() {
		return messageTyping.getFromId();
	}

	public void setMessageTyping(MessageTyping messageTyping) {
		this.messageTyping = messageTyping;
	}
}
