package com.hdzy.blog.domain.model.enums;

/**
 * Created by donghe on 16/6/6.
 */
public enum OrderField {
	GMT_CREATE("gmt_create"),HEAT("heat");

	private String fieldName;

	OrderField (String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFieldName () {
		return fieldName;
	}
}
