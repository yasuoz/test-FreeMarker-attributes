package com.example.test.tag;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.struts2.util.ValueStack;
import org.apache.struts2.views.annotations.StrutsTag;

/**
 * I simply extend standard Anchor tag.
 */
@StrutsTag(
		name = Anchor.OPEN_TEMPLATE,
		tldTagClass = "com.example.test.tag.AnchorTag",
		description = "Render a HTML href element that when clicked can optionally call a URL via remote XMLHttpRequest and updates its targets",
		allowDynamicAttributes = true)
public class Anchor extends org.apache.struts2.components.Anchor {
	public Anchor(final ValueStack stack, final HttpServletRequest request, final HttpServletResponse response) {
		super(stack, request, response);
	}
}