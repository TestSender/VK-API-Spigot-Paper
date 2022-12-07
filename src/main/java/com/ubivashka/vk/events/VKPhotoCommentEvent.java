package com.ubivashka.vk.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.vk.api.sdk.objects.callback.PhotoComment;

public class VKPhotoCommentEvent extends Event{
	private static final HandlerList handlers = new HandlerList();
	private PhotoComment photoComment;

	public VKPhotoCommentEvent(PhotoComment photoComment) {
		setPhotoComment(photoComment);
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

	@Override
	public final HandlerList getHandlers() {
		return handlers;
	}

	public PhotoComment getPhotoComment() {
		return photoComment;
	}

	public void setPhotoComment(PhotoComment photoComment) {
		this.photoComment = photoComment;
	}
}
