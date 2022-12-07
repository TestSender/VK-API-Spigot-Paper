package com.ubivashka.vk.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.google.gson.JsonObject;

public class VKJsonEvent extends Event {
	private static final HandlerList handlers = new HandlerList();
	private JsonObject jsonObject;

	public VKJsonEvent(JsonObject jsonObject) {
		setJsonObject(jsonObject);
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

	@Override
	public final HandlerList getHandlers() {
		return handlers;
	}

	public JsonObject getJsonObject() {
		return jsonObject;
	}

	public String getType() {
		return jsonObject.get("type").getAsString();
	}

	private void setJsonObject(JsonObject jsonObject) {
		this.jsonObject = jsonObject;
	}
}
