package com.test.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class CasesCocher {

	  /**
	   * An instance of the constants.
	   */
	  private CwConstants constants = GWT.create(CwConstants.class);

	  /**
	   * Initialize this example.
	   */
	  public Widget onInitialize() {
	    // Create a vertical panel to align the check boxes
	    VerticalPanel vPanel = new VerticalPanel();
	    HTML label = new HTML(constants.cwCheckBoxCheckAll());
	    label.ensureDebugId("cwCheckBox-label");
	    vPanel.add(label);

	    // Add a checkbox for each day of the week
	    String[] daysOfWeek = constants.cwCheckBoxDays();
	    for (int i = 0; i < daysOfWeek.length; i++) {
	      String day = daysOfWeek[i];
	      CheckBox checkBox = new CheckBox(day);
	      checkBox.ensureDebugId("cwCheckBox-" + day);

	      // Disable the weekends
	      if (i >= 5) {
	        checkBox.setEnabled(false);
	      }

	      vPanel.add(checkBox);
	    }

	    // Return the panel of checkboxes
	    return vPanel;
	  }
}
