package com.test.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class Login implements ClickHandler 
{
	private TextBox textBox = new TextBox();
	private PasswordTextBox password = new PasswordTextBox();
	private Button bouton = new Button();
	private VerticalPanel panel = new VerticalPanel();

public Login()
{
textBox.setText("Identifiant");
password.setText("12345678");	
bouton.setText("Envoyer");
	
panel.add(textBox);
panel.add(password);
panel.add(bouton);

bouton.addClickHandler(this);   


}

public void onClick(ClickEvent event) {
	Widget sender = (Widget) event.getSource();
	
	if (sender == bouton)
	{
		Window.alert("coucou");
	}
}


}