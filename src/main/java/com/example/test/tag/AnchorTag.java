package com.example.test.tag;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.struts2.components.Component;
import org.apache.struts2.util.ValueStack;

/**
 * @see		Anchor
 */
public class AnchorTag extends org.apache.struts2.views.jsp.ui.AnchorTag {
	private static final long	serialVersionUID	= -6598671119276762666L;
	private String	original;
	
	@Override
	public Component getBean(final ValueStack stack, final HttpServletRequest req, final HttpServletResponse res) {
		// FIXME if returns super.getBean(), FreeMarker exception not occurs
		return original != null ? super.getBean(stack, req, res) : new Anchor(stack, req, res);
	}
	
	@Override
	protected void populateParams() {
		super.populateParams();
	}
	
	public void setOriginal(final String original) {
		this.original	= original;
	}
	
	/**
	* Must declare the setter at the descendant Tag class level in order for the tag handler to locate the method.
	*/
	@Override
	public void setPerformClearTagStateForTagPoolingServers(final boolean performClearTagStateForTagPoolingServers) {
		super.setPerformClearTagStateForTagPoolingServers(performClearTagStateForTagPoolingServers);
	}
	
	@Override
	protected void clearTagStateForTagPoolingServers() {
		if(!getPerformClearTagStateForTagPoolingServers()) {
			return;	// If flag is false (default setting), do not perform any state clearing.
		}
		super.clearTagStateForTagPoolingServers();
		original	= null;
	}
}