package com.ubivashka.vk.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.vk.api.sdk.objects.callback.PhotoCommentDelete;

public class VKPhotoCommentDeleteEvent extends Event{
	private static final HandlerList handlers = new HandlerList();
	private PhotoCommentDelete photoCommentDelete;

	public VKPhotoCommentDeleteEvent(PhotoCommentDelete photoCommentDelete) {
		setPhotoCommentDelete(photoCommentDelete);
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

	@Override
	public final HandlerList getHandlers() {
		return handlers;
	}

	public PhotoCommentDelete getPhotoCommentDelete() {
		return photoCommentDelete;
	}

	public void setPhotoCommentDelete(PhotoCommentDelete photoCommentDelete) {
		this.photoCommentDelete = photoCommentDelete;
	}
}
