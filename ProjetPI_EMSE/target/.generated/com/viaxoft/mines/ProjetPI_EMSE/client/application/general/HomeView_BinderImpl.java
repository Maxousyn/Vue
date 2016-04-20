// .ui.xml template last modified: 1461145586711
package com.viaxoft.mines.ProjetPI_EMSE.client.application.general;

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

public class HomeView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.viaxoft.mines.ProjetPI_EMSE.client.application.general.HomeView>, com.viaxoft.mines.ProjetPI_EMSE.client.application.general.HomeView.Binder {

  interface Template extends SafeHtmlTemplates {
    @Template("PAGE 1 : LOGIN")
    SafeHtml html1();
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.viaxoft.mines.ProjetPI_EMSE.client.application.general.HomeView owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.viaxoft.mines.ProjetPI_EMSE.client.application.general.HomeView owner;


    public Widgets(final com.viaxoft.mines.ProjetPI_EMSE.client.application.general.HomeView owner) {
      this.owner = owner;
    }

    SafeHtml template_html1() {
      return template.html1();
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.viaxoft.mines.ProjetPI_EMSE.client.application.general.HomeView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.viaxoft.mines.ProjetPI_EMSE.client.application.general.HomeView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.viaxoft.mines.ProjetPI_EMSE.client.application.general.HomeView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.viaxoft.mines.ProjetPI_EMSE.client.application.general.HomeView_BinderImpl_GenBundle) GWT.create(com.viaxoft.mines.ProjetPI_EMSE.client.application.general.HomeView_BinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for f_Row1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row1() {
      return build_f_Row1();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row1() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row1 = (org.gwtbootstrap3.client.ui.Row) GWT.create(org.gwtbootstrap3.client.ui.Row.class);
      // Setup section.
      f_Row1.add(get_f_Column2());

      return f_Row1;
    }

    /**
     * Getter for f_Column2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column2() {
      return build_f_Column2();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column2() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column2 = new org.gwtbootstrap3.client.ui.Column("XS_12");
      // Setup section.
      f_Column2.add(get_f_Jumbotron3());

      return f_Column2;
    }

    /**
     * Getter for f_Jumbotron3 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Jumbotron get_f_Jumbotron3() {
      return build_f_Jumbotron3();
    }
    private org.gwtbootstrap3.client.ui.Jumbotron build_f_Jumbotron3() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Jumbotron f_Jumbotron3 = (org.gwtbootstrap3.client.ui.Jumbotron) GWT.create(org.gwtbootstrap3.client.ui.Jumbotron.class);
      // Setup section.
      f_Jumbotron3.add(get_f_Heading4());
      f_Jumbotron3.add(get_f_Paragraph5());

      return f_Jumbotron3;
    }

    /**
     * Getter for f_Heading4 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading4() {
      return build_f_Heading4();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading4() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading4 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H1);
      // Setup section.
      f_Heading4.setText("COUCOU");

      return f_Heading4;
    }

    /**
     * Getter for f_Paragraph5 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph5() {
      return build_f_Paragraph5();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph5() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph5 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html1().asString());
      // Setup section.

      return f_Paragraph5;
    }
  }
}
