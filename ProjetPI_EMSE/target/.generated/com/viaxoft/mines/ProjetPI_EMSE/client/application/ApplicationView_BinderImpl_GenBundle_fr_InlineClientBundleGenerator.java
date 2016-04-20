package com.viaxoft.mines.ProjetPI_EMSE.client.application;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class ApplicationView_BinderImpl_GenBundle_fr_InlineClientBundleGenerator implements com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationView_BinderImpl_GenBundle {
  private static ApplicationView_BinderImpl_GenBundle_fr_InlineClientBundleGenerator _instance0 = new ApplicationView_BinderImpl_GenBundle_fr_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationView_BinderImpl_GenCss_style() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "style";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GPBYFDEEI button{margin:" + ("0.5em")  + ";}.GPBYFDEFI span{margin-left:" + ("5px")  + ";}")) : ((".GPBYFDEEI button{margin:" + ("0.5em")  + ";}.GPBYFDEFI span{margin-right:" + ("5px")  + ";}"));
      }
      public java.lang.String buttons() {
        return "GPBYFDEEI";
      }
      public java.lang.String labels() {
        return "GPBYFDEFI";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationView_BinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationView_BinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationView_BinderImpl_GenCss_style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationView_BinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
