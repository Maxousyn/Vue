package com.test.client;

import com.google.gwt.i18n.client.Constants;

/**
 * The constants used in this Content Widget.
 */
public interface CwConstants extends Constants {
	
  //constantes
	 @DefaultStringValue("test")
  String cwConstantsExampleDescription();
	 
	 @DefaultStringValue("test")
  String cwConstantsExampleLinkText();

	 @DefaultStringValue("test")
  String cwConstantsExampleName();
  
  //zone de sugestion
	 @DefaultStringValue("test")
  String cwSuggestBoxDescription();

	 @DefaultStringValue("test")
  String cwSuggestBoxLabel();

	 @DefaultStringValue("test")
  String cwSuggestBoxName();

	 @DefaultStringArrayValue({"test","test2"})
  String[] cwSuggestBoxWords();
  
  //Cases à cocher
	 @DefaultStringValue("test")
  String cwCheckBoxCheckAll();

	 @DefaultStringArrayValue({"test","test2"})
  String[] cwCheckBoxDays();

	 @DefaultStringValue("test")
  String cwCheckBoxDescription();

	 @DefaultStringValue("test")
  String cwCheckBoxName();
	 
	 //MenuVerticalauche
	String[] cwStackLayoutPanelContacts();

	String[] cwStackLayoutPanelContactsEmails();

	String cwStackLayoutPanelContactsHeader();

	String cwStackLayoutPanelDescription();

	String[] cwStackLayoutPanelFilters();

	String cwStackLayoutPanelFiltersHeader();

    String[] cwStackLayoutPanelMailFolders();

    String cwStackLayoutPanelMailHeader();

    String cwStackLayoutPanelName();
}