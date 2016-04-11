package com.test.client;

import com.google.gwt.dom.client.Style;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class PanneauFooter {

	private LayoutPanel hPanel = new LayoutPanel();
	private HTML conditions = new HTML("<a href=\"\" class=\"link_test\">conditions<a/>");

	public Widget onInitialize() {
		hPanel.getElement().getStyle().setBackgroundColor("#FF0000");
		hPanel.add(conditions);
		
		hPanel.setWidgetRightWidth(conditions, 0, Style.Unit.PCT, 55, Style.Unit.PCT);
		
		return hPanel;
	}

}