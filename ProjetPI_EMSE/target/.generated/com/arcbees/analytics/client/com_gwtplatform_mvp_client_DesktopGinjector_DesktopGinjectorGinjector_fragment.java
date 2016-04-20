package com.arcbees.analytics.client;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector;

public class com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$arcbees$analytics$client$ClientAnalytics$_annotation$$none$$(com.arcbees.analytics.client.ClientAnalytics injectee) {
    
  }
  
  private com.arcbees.analytics.client.ClientAnalytics singleton_Key$type$com$arcbees$analytics$client$ClientAnalytics$_annotation$$none$$ = null;
  
  public com.arcbees.analytics.client.ClientAnalytics get_Key$type$com$arcbees$analytics$client$ClientAnalytics$_annotation$$none$$() {
    
    if (singleton_Key$type$com$arcbees$analytics$client$ClientAnalytics$_annotation$$none$$ == null) {
    com.arcbees.analytics.client.ClientAnalytics result = com$arcbees$analytics$client$ClientAnalytics_com$arcbees$analytics$client$ClientAnalytics_methodInjection(injector.getFragment_com_gwtplatform_mvp_client().get_Key$type$java$lang$String$_annotation$$com$google$inject$name$Named$value$gaAccount$$(), injector.getFragment_com_gwtplatform_mvp_client().get_Key$type$java$lang$Boolean$_annotation$$com$google$inject$name$Named$value$uaAutoCreate$$());
    memberInject_Key$type$com$arcbees$analytics$client$ClientAnalytics$_annotation$$none$$(result);
    
        singleton_Key$type$com$arcbees$analytics$client$ClientAnalytics$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$arcbees$analytics$client$ClientAnalytics$_annotation$$none$$;
    
  }
  
  public com.arcbees.analytics.client.ClientAnalytics com$arcbees$analytics$client$ClientAnalytics_com$arcbees$analytics$client$ClientAnalytics_methodInjection(java.lang.String _0, boolean _1) {
    return new com.arcbees.analytics.client.ClientAnalytics(_0, _1);
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector injector;
  public com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment(com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector injector) {
    this.injector = injector;
  }
  
  public void initializeEagerSingletons() {
    // Eager singleton bound at:
    //   Implicit binding for com.arcbees.analytics.client.ClientAnalytics
    get_Key$type$com$arcbees$analytics$client$ClientAnalytics$_annotation$$none$$();
    
  }
  
}
