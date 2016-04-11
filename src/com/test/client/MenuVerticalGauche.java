package com.test.client;


import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.user.client.ui.AbstractImagePrototype;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.StackLayoutPanel;
import com.google.gwt.user.client.ui.Tree;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.client.ui.Tree.*;
import com.google.gwt.user.client.ui.TreeItem;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class MenuVerticalGauche {
	  /**
	   * An instance of the constants.
	   */
	  private CwConstants constants = GWT.create(CwConstants.class);

	  /**
	   * Initialize this example.
	   */
	  public Widget onInitialize() {
	    // Get the images.
	    ImagesMenu images = (ImagesMenu) GWT.create(ImagesMenu.class);

	    // Create a new stack layout panel.
	    StackLayoutPanel stackPanel = new StackLayoutPanel(Unit.EM);
	    stackPanel.setPixelSize(200, 400);

	    // Add the Mail folders.
	    Widget mailHeader = createHeaderWidget(
	        constants.cwStackLayoutPanelMailHeader(), images.mailgroup());
	    stackPanel.add(createMailItem(images), mailHeader, 4);

	    // Add a list of filters.
	    Widget filtersHeader = createHeaderWidget(
	        constants.cwStackLayoutPanelFiltersHeader(), images.filtersgroup());
	    stackPanel.add(createFiltersItem(), filtersHeader, 4);

	    // Add a list of contacts.
	    Widget contactsHeader = createHeaderWidget(
	        constants.cwStackLayoutPanelContactsHeader(), images.contactsgroup());
	    stackPanel.add(createContactsItem(images), contactsHeader, 4);

	    // Return the stack panel.
	    stackPanel.ensureDebugId("cwStackLayoutPanel");
	    return stackPanel;
	  }

	  /**
	   * Add a {@link TreeItem} to a root item.
	   * 
	   * @param root the root {@link TreeItem}
	   * @param image the icon for the new child item
	   * @param label the label for the child icon
	   */
	  private void addItem(TreeItem root, ImageResource image, String label) {
	    SafeHtmlBuilder sb = new SafeHtmlBuilder();
	    sb.append(SafeHtmlUtils.fromTrustedString(AbstractImagePrototype.create(
	        image).getHTML()));
	    sb.appendEscaped(" ").appendEscaped(label);
	    root.addItem(sb.toSafeHtml());
	  }

	  /**
	   * Create the list of Contacts.
	   * 
	   * @param images the {@link ImagesMenu} used in the Contacts
	   * @return the list of contacts
	   */
	  private Widget createContactsItem(ImagesMenu images) {
	    // Create a popup to show the contact info when a contact is clicked
	    HorizontalPanel contactPopupContainer = new HorizontalPanel();
	    contactPopupContainer.setSpacing(5);
	    contactPopupContainer.add(new Image(images.defaultContact()));
	    final HTML contactInfo = new HTML();
	    contactPopupContainer.add(contactInfo);
	    final PopupPanel contactPopup = new PopupPanel(true, false);
	    contactPopup.setWidget(contactPopupContainer);

	    // Create the list of contacts
	    VerticalPanel contactsPanel = new VerticalPanel();
	    contactsPanel.setSpacing(4);
	    String[] contactNames = constants.cwStackLayoutPanelContacts();
	    String[] contactEmails = constants.cwStackLayoutPanelContactsEmails();
	    for (int i = 0; i < contactNames.length; i++) {
	      final String contactName = contactNames[i];
	      final String contactEmail = contactEmails[i];
	      final Anchor contactLink = new Anchor(contactName);
	      contactsPanel.add(contactLink);

	      // Open the contact info popup when the user clicks a contact
	      contactLink.addClickHandler(new ClickHandler() {
	        @Override
	        public void onClick(ClickEvent event) {
	          // Set the info about the contact
	          SafeHtmlBuilder sb = new SafeHtmlBuilder();
	          sb.appendEscaped(contactName);
	          sb.appendHtmlConstant("<br><i>");
	          sb.appendEscaped(contactEmail);
	          sb.appendHtmlConstant("</i>");
	          contactInfo.setHTML(sb.toSafeHtml());

	          // Show the popup of contact info
	          int left = contactLink.getAbsoluteLeft() + 14;
	          int top = contactLink.getAbsoluteTop() + 14;
	          contactPopup.setPopupPosition(left, top);
	          contactPopup.show();
	        }
	      });
	    }
	    return new SimplePanel(contactsPanel);
	  }

	  /**
	   * Create the list of filters for the Filters item.
	   * 
	   * @return the list of filters
	   */
	  private Widget createFiltersItem() {
	    VerticalPanel filtersPanel = new VerticalPanel();
	    filtersPanel.setSpacing(4);
	    for (String filter : constants.cwStackLayoutPanelFilters()) {
	      filtersPanel.add(new CheckBox(filter));
	    }
	    return new SimplePanel(filtersPanel);
	  }

	  /**
	   * Create a widget to display in the header that includes an image and some
	   * text.
	   * 
	   * @param text the header text
	   * @param image the {@link ImageResource} to add next to the header
	   * @return the header widget
	   */
	  private Widget createHeaderWidget(String text, ImageResource image) {
	    // Add the image and text to a horizontal panel
	    HorizontalPanel hPanel = new HorizontalPanel();
	    hPanel.setHeight("100%");
	    hPanel.setSpacing(0);
	    hPanel.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
	    hPanel.add(new Image(image));
	    HTML headerText = new HTML(text);
	    headerText.setStyleName("cw-StackPanelHeader");
	    hPanel.add(headerText);
	    return new SimplePanel(hPanel);
	  }

	  /**
	   * Create the {@link Tree} of Mail options.
	   * 
	   * @param images the {@link ImagesMenu} used in the Mail options
	   * @return the {@link Tree} of mail options
	   */
	  private Widget createMailItem(ImagesMenu images) {
	    Tree mailPanel = new Tree(images);
	    TreeItem mailPanelRoot = mailPanel.addTextItem("foo@example.com");
	    String[] mailFolders = constants.cwStackLayoutPanelMailFolders();
	    addItem(mailPanelRoot, images.inbox(), mailFolders[0]);
	    addItem(mailPanelRoot, images.drafts(), mailFolders[1]);
	    addItem(mailPanelRoot, images.templates(), mailFolders[2]);
	    addItem(mailPanelRoot, images.sent(), mailFolders[3]);
	    addItem(mailPanelRoot, images.trash(), mailFolders[4]);
	    mailPanelRoot.setState(true);
	    return mailPanel;
	  }

}
