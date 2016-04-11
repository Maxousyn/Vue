package com.test.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.MouseMoveEvent;
import com.google.gwt.event.dom.client.MouseMoveHandler;
import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DecoratedPopupPanel;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class DashboardAcceuil implements ClickHandler, MouseMoveHandler,
MouseOverHandler, MouseOutHandler{

	VerticalPanel dashboardPanel = new VerticalPanel();
	HorizontalPanel l1Panel = new HorizontalPanel();
	HorizontalPanel l2Panel = new HorizontalPanel();
	HorizontalPanel l3Panel = new HorizontalPanel();

	/*
    DecoratorPanel  rouge = new DecoratorPanel();
    VerticalPanel bleu = new VerticalPanel();
    VerticalPanel vert = new VerticalPanel();
    
    DecoratorPanel  rouge2 = new DecoratorPanel();
    VerticalPanel bleu2 = new VerticalPanel();
    VerticalPanel vert2 = new VerticalPanel();
    
    DecoratorPanel  rouge3 = new DecoratorPanel();
    VerticalPanel bleu3 = new VerticalPanel();
    VerticalPanel vert3 = new VerticalPanel();
    */
	
	Button rouge = new Button("Factures");
	Button bleu = new Button("Relevés");
	Button vert = new Button("Graph");
    
		
	public Widget onInitialize(){
		
/*	    final DecoratedPopupPanel simplePopup = new DecoratedPopupPanel(true);
	    simplePopup.ensureDebugId("cwBasicPopup-simplePopup");
	    simplePopup.setWidth("150px");
	    simplePopup.setWidget(
	        new HTML("afficher le popup"));

	    // Create a button to show the popup
	    Button openButton = new Button(
	        "boutton popup", new ClickHandler() {
	          public void onClick(ClickEvent event) {
	            // Reposition the popup relative to the button
	            Widget source = (Widget) event.getSource();
	            int left = source.getAbsoluteLeft() + 10;
	            int top = source.getAbsoluteTop() + 10;
	            simplePopup.setPopupPosition(left, top);

	            // Show the popup
	            simplePopup.show();
	          }
	        });
		
	    rouge.getElement().getStyle().setBackgroundColor("#FF0000");
	    bleu.getElement().getStyle().setBackgroundColor("#0000FF");
	    vert.getElement().getStyle().setBackgroundColor("#00FF00");
	    
	    rouge.setSize("60px", "60px");
	    bleu.setSize("60px", "60px");
	    vert.setSize("60px", "60px");
	    
	    rouge2.getElement().getStyle().setBackgroundColor("#FF0000");
	    bleu2.getElement().getStyle().setBackgroundColor("#0000FF");
	    vert2.getElement().getStyle().setBackgroundColor("#00FF00");
	    
	    rouge2.setSize("60px", "60px");
	    bleu2.setSize("60px", "60px");
	    vert2.setSize("60px", "60px");
	    
	    rouge3.getElement().getStyle().setBackgroundColor("#FF0000");
	    bleu3.getElement().getStyle().setBackgroundColor("#0000FF");
	    vert3.getElement().getStyle().setBackgroundColor("#00FF00");
	    
	    rouge3.setSize("60px", "60px");
	    bleu3.setSize("60px", "60px");
	    vert3.setSize("60px", "60px");
*/		
		rouge.setStyleName("button_red");
		vert.setStyleName("button_green");
		bleu.setStyleName("button_blue");
		
		
	    rouge.addClickHandler(this);
	    rouge.addMouseOverHandler(this);
	    rouge.addMouseOutHandler(this);    
	    
	    l1Panel.setSpacing(5);
	    l2Panel.setSpacing(5);
	    l3Panel.setSpacing(5);
	    dashboardPanel.setSpacing(5);
	    
	    l1Panel.add(rouge);
	    l1Panel.add(bleu);
	    l1Panel.add(vert);
/*	    
	    l2Panel.add(bleu2);
	    l2Panel.add(rouge2);
	    l2Panel.add(vert2);
	    
	    l3Panel.add(vert3);
	    l3Panel.add(bleu3);
	    l3Panel.add(rouge3);
*/	    
	    dashboardPanel.add(l1Panel);
//	    dashboardPanel.add(l2Panel);
//	    dashboardPanel.add(l3Panel);

		
		return dashboardPanel;
	}



	@Override
	public void onClick(ClickEvent event) {
		Widget sender = (Widget) event.getSource();
		
		if(sender == rouge){
			
			rouge.setStyleName("button_green");
		}
	}



	@Override
	public void onMouseMove(MouseMoveEvent event) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void onMouseOver(MouseOverEvent event) {
		Widget sender = (Widget) event.getSource();
		
		if(sender == rouge){
			
			rouge.setStyleName("button_black");
		}
	}



	@Override
	public void onMouseOut(MouseOutEvent event) {
		Widget sender = (Widget) event.getSource();
		
		if(sender == rouge){
			
			rouge.setStyleName("button_red");
		}
	}
	
	

}
