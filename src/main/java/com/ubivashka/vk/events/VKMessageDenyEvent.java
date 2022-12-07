package com.ubivashka.vk.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.vk.api.sdk.objects.callback.MessageDeny;

public class VKMessageDenyEvent extends Event{
	private static final HandlerList handlers = new HandlerList();
	private MessageDeny messageDeny;

	public VKMessageDenyEvent(MessageDeny messageAllow) {
		this.setMessageDeny(messageAllow);
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

	@Override
	public final HandlerList getHandlers() {
		return handlers;
	}

	public MessageDeny getMessageDeny() {
		return messageDeny;
	}

	public Integer getUser() {
		return messageDeny.getUserId();
	}

	private void setMessageDeny(MessageDeny messageAllow) {
		this.messageDeny = messageAllow;
	}
}
