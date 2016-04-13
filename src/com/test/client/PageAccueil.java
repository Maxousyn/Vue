package com.test.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.SplitLayoutPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.dom.client.*;
import com.google.gwt.dom.client.Style.BorderStyle;



/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class PageAccueil implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		
	//LayoutPanel sousmenu_g = new LayoutPanel();
	LayoutPanel p = new LayoutPanel();
	RootLayoutPanel rp = RootLayoutPanel.get();
	DockLayoutPanel sp = new DockLayoutPanel(Style.Unit.EM);
	//MyDockLayoutPanel testPan = new MyDockLayoutPanel();
	HelloWorld hw = new HelloWorld("coucou");
	VerticalPanel vP = new VerticalPanel();
	
	vP.add(hw);
	
	//sousmenu_g.getElement().getStyle().setBackgroundColor("#FF0000");
	//sousmenu_g.setWidth("1");	
	
	CasesCocher cases = new CasesCocher();
	MenuVerticalGauche menu = new MenuVerticalGauche();
	PanneauFooter footer = new PanneauFooter();
	DashboardAcceuil dashb = new DashboardAcceuil();
	Widget w_cases = new Widget();
	Widget w_menu = new Widget();
	Widget w_footer = new Widget();
	Widget w_dashb = new Widget();
	//HTML version = new HTML("<div id=\"footer\"></div>");
	
	w_menu = menu.onInitialize();
	w_cases = cases.onInitialize();
	w_footer = footer.onInitialize();
	w_dashb = dashb.onInitialize();
	
	w_cases.getElement().getStyle().setProperty("backgroundColor", "#ff0000");
	w_footer.setWidth("100%");
	w_footer.setHeight("40px");
	//w_menu.setStyleName("menu_gauche");
	
	p.add(w_cases);
	//p.add(w_footer);
	p.add(w_dashb);
	
	sp.addSouth(w_footer, 2);
    sp.addWest(w_menu, 18);
    //p.setWidgetLeftWidth(w_menu, 0, Style.Unit.PCT, 40, Style.Unit.PCT);
    p.setWidgetRightWidth(w_cases, 0, Style.Unit.PCT, 6, Style.Unit.PCT);
    //p.setWidgetBottomHeight(w_footer, 0, Style.Unit.PCT, 4, Style.Unit.PCT);
    p.setWidgetLeftRight(w_dashb, 1, Style.Unit.EM, 1, Style.Unit.EM);
    p.setWidgetTopHeight(w_dashb, 1, Style.Unit.EM, 10, Style.Unit.EM);

    sp.add(p);
    
    //rp.add(p);    
    rp.add(sp);
    //rp.add(vP);
  
	}
		
}
