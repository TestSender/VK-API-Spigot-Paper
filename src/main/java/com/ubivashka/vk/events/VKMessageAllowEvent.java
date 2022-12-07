package com.ubivashka.vk.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.vk.api.sdk.objects.callback.MessageAllow;

public class VKMessageAllowEvent extends Event{
	private static final HandlerList handlers = new HandlerList();
	private MessageAllow messageAllow;

	public VKMessageAllowEvent(MessageAllow messageAllow) {
		this.setMessageAllow(messageAllow);
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

	@Override
	public final HandlerList getHandlers() {
		return handlers;
	}

	public MessageAllow getMessageAllow() {
		return messageAllow;
	}

	public Integer getUser() {
		return messageAllow.getUserId();
	}

	private void setMessageAllow(MessageAllow messageAllow) {
		this.messageAllow = messageAllow;
	}
}
