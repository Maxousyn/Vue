// .ui.xml template last modified: 1461145586711
package com.viaxoft.mines.ProjetPI_EMSE.client.application;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeUri;
import com.google.gwt.safehtml.shared.UriUtils;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class ApplicationView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationView>, com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationView.Binder {

  interface Template extends SafeHtmlTemplates {
    @Template("PAGE 1")
    SafeHtml html1();
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationView owner) {


    return new Widgets(owner).get_f_ScrollPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationView owner;


    public Widgets(final com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_nameTokens();  // more than one getter call detected. Type: IMPORTED, precedence: 1
    }

    SafeHtml template_html1() {
      return template.html1();
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationView_BinderImpl_GenBundle) GWT.create(com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationView_BinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for nameTokens called 2 times. Type: IMPORTED. Build precedence: 1.
     */
    private com.viaxoft.mines.ProjetPI_EMSE.client.place.NameTokens nameTokens;
    private com.viaxoft.mines.ProjetPI_EMSE.client.place.NameTokens get_nameTokens() {
      return nameTokens;
    }
    private com.viaxoft.mines.ProjetPI_EMSE.client.place.NameTokens build_nameTokens() {
      // Creation section.
      nameTokens = (com.viaxoft.mines.ProjetPI_EMSE.client.place.NameTokens) GWT.create(com.viaxoft.mines.ProjetPI_EMSE.client.place.NameTokens.class);
      // Setup section.

      return nameTokens;
    }

    /**
     * Getter for style called 0 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationView_BinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationView_BinderImpl_GenCss_style build_style() {
      // Creation section.
      final com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationView_BinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();

      return style;
    }

    /**
     * Getter for f_ScrollPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.ScrollPanel get_f_ScrollPanel1() {
      return build_f_ScrollPanel1();
    }
    private com.google.gwt.user.client.ui.ScrollPanel build_f_ScrollPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.ScrollPanel f_ScrollPanel1 = (com.google.gwt.user.client.ui.ScrollPanel) GWT.create(com.google.gwt.user.client.ui.ScrollPanel.class);
      // Setup section.
      f_ScrollPanel1.add(get_f_Container2());

      return f_ScrollPanel1;
    }

    /**
     * Getter for f_Container2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.Container get_f_Container2() {
      return build_f_Container2();
    }
    private org.gwtbootstrap3.client.ui.Container build_f_Container2() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Container f_Container2 = (org.gwtbootstrap3.client.ui.Container) GWT.create(org.gwtbootstrap3.client.ui.Container.class);
      // Setup section.
      f_Container2.add(get_f_Navbar3());
      f_Container2.add(get_contentContainer());

      return f_Container2;
    }

    /**
     * Getter for f_Navbar3 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Navbar get_f_Navbar3() {
      return build_f_Navbar3();
    }
    private org.gwtbootstrap3.client.ui.Navbar build_f_Navbar3() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Navbar f_Navbar3 = (org.gwtbootstrap3.client.ui.Navbar) GWT.create(org.gwtbootstrap3.client.ui.Navbar.class);
      // Setup section.
      f_Navbar3.add(get_f_Container4());
      f_Navbar3.setPosition(org.gwtbootstrap3.client.ui.constants.NavbarPosition.FIXED_TOP);

      return f_Navbar3;
    }

    /**
     * Getter for f_Container4 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.Container get_f_Container4() {
      return build_f_Container4();
    }
    private org.gwtbootstrap3.client.ui.Container build_f_Container4() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Container f_Container4 = (org.gwtbootstrap3.client.ui.Container) GWT.create(org.gwtbootstrap3.client.ui.Container.class);
      // Setup section.
      f_Container4.add(get_f_NavbarHeader5());
      f_Container4.add(get_navbarCollapse());

      return f_Container4;
    }

    /**
     * Getter for f_NavbarHeader5 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.NavbarHeader get_f_NavbarHeader5() {
      return build_f_NavbarHeader5();
    }
    private org.gwtbootstrap3.client.ui.NavbarHeader build_f_NavbarHeader5() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarHeader f_NavbarHeader5 = (org.gwtbootstrap3.client.ui.NavbarHeader) GWT.create(org.gwtbootstrap3.client.ui.NavbarHeader.class);
      // Setup section.
      f_NavbarHeader5.add(get_brand());
      f_NavbarHeader5.add(get_f_NavbarCollapseButton6());

      return f_NavbarHeader5;
    }

    /**
     * Getter for brand called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.NavbarBrand get_brand() {
      return build_brand();
    }
    private org.gwtbootstrap3.client.ui.NavbarBrand build_brand() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarBrand brand = (org.gwtbootstrap3.client.ui.NavbarBrand) GWT.create(org.gwtbootstrap3.client.ui.NavbarBrand.class);
      // Setup section.
      brand.setHTML(template_html1().asString());
      brand.setTargetHistoryToken("" + get_nameTokens().getHome() + "");

      return brand;
    }

    /**
     * Getter for f_NavbarCollapseButton6 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.NavbarCollapseButton get_f_NavbarCollapseButton6() {
      return build_f_NavbarCollapseButton6();
    }
    private org.gwtbootstrap3.client.ui.NavbarCollapseButton build_f_NavbarCollapseButton6() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarCollapseButton f_NavbarCollapseButton6 = (org.gwtbootstrap3.client.ui.NavbarCollapseButton) GWT.create(org.gwtbootstrap3.client.ui.NavbarCollapseButton.class);
      // Setup section.
      f_NavbarCollapseButton6.setDataTarget("#navbar-collapse");

      return f_NavbarCollapseButton6;
    }

    /**
     * Getter for navbarCollapse called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.NavbarCollapse get_navbarCollapse() {
      return build_navbarCollapse();
    }
    private org.gwtbootstrap3.client.ui.NavbarCollapse build_navbarCollapse() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarCollapse navbarCollapse = (org.gwtbootstrap3.client.ui.NavbarCollapse) GWT.create(org.gwtbootstrap3.client.ui.NavbarCollapse.class);
      // Setup section.
      navbarCollapse.add(get_f_NavbarNav7());
      navbarCollapse.setId("navbar-collapse");

      this.owner.navbarCollapse = navbarCollapse;

      return navbarCollapse;
    }

    /**
     * Getter for f_NavbarNav7 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.NavbarNav get_f_NavbarNav7() {
      return build_f_NavbarNav7();
    }
    private org.gwtbootstrap3.client.ui.NavbarNav build_f_NavbarNav7() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarNav f_NavbarNav7 = (org.gwtbootstrap3.client.ui.NavbarNav) GWT.create(org.gwtbootstrap3.client.ui.NavbarNav.class);
      // Setup section.
      f_NavbarNav7.add(get_f_AnchorListItem8());

      return f_NavbarNav7;
    }

    /**
     * Getter for f_AnchorListItem8 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem8() {
      return build_f_AnchorListItem8();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem8() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem8 = (org.gwtbootstrap3.client.ui.AnchorListItem) GWT.create(org.gwtbootstrap3.client.ui.AnchorListItem.class);
      // Setup section.
      f_AnchorListItem8.setTargetHistoryToken("" + get_nameTokens().getSetup() + "");
      f_AnchorListItem8.setText("Page 2");

      return f_AnchorListItem8;
    }

    /**
     * Getter for contentContainer called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.SimplePanel get_contentContainer() {
      return build_contentContainer();
    }
    private com.google.gwt.user.client.ui.SimplePanel build_contentContainer() {
      // Creation section.
      final com.google.gwt.user.client.ui.SimplePanel contentContainer = (com.google.gwt.user.client.ui.SimplePanel) GWT.create(com.google.gwt.user.client.ui.SimplePanel.class);
      // Setup section.

      this.owner.contentContainer = contentContainer;

      return contentContainer;
    }
  }
}
