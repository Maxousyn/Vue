package com.viaxoft.mines.ProjetPI_EMSE.client.application;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector;

public class com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$viaxoft$mines$ProjetPI_EMSE$client$application$ApplicationPresenter$MyProxy$_annotation$$none$$(com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationPresenter.MyProxy injectee) {
    
  }
  
  public void memberInject_Key$type$com$viaxoft$mines$ProjetPI_EMSE$client$application$ApplicationPresenter$_annotation$$none$$(com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationPresenter injectee) {
    injector.getFragment_com_gwtplatform_mvp_client().com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection(injectee, injector.getFragment_com_gwtplatform_mvp_client().get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$());
    
  }
  
  public void memberInject_Key$type$com$viaxoft$mines$ProjetPI_EMSE$client$application$ApplicationView$Binder$_annotation$$none$$(com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationView.Binder injectee) {
    
  }
  
  public void memberInject_Key$type$com$viaxoft$mines$ProjetPI_EMSE$client$application$ApplicationView$_annotation$$none$$(com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationView injectee) {
    
  }
  
  
  /**
   * Binding for com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationPresenter$MyView declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:122)
   */
  public com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationPresenter.MyView get_Key$type$com$viaxoft$mines$ProjetPI_EMSE$client$application$ApplicationPresenter$MyView$_annotation$$none$$() {
    com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationPresenter.MyView result = get_Key$type$com$viaxoft$mines$ProjetPI_EMSE$client$application$ApplicationView$_annotation$$none$$();
    return result;
    
  }
  
  private com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationPresenter.MyProxy singleton_Key$type$com$viaxoft$mines$ProjetPI_EMSE$client$application$ApplicationPresenter$MyProxy$_annotation$$none$$ = null;
  
  public com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationPresenter.MyProxy get_Key$type$com$viaxoft$mines$ProjetPI_EMSE$client$application$ApplicationPresenter$MyProxy$_annotation$$none$$() {
    
    if (singleton_Key$type$com$viaxoft$mines$ProjetPI_EMSE$client$application$ApplicationPresenter$MyProxy$_annotation$$none$$ == null) {
    Object created = GWT.create(com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationPresenter.MyProxy.class);
    assert created instanceof com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationPresenter.MyProxy;
    com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationPresenter.MyProxy result = (com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationPresenter.MyProxy) created;
    
    memberInject_Key$type$com$viaxoft$mines$ProjetPI_EMSE$client$application$ApplicationPresenter$MyProxy$_annotation$$none$$(result);
    
        singleton_Key$type$com$viaxoft$mines$ProjetPI_EMSE$client$application$ApplicationPresenter$MyProxy$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$viaxoft$mines$ProjetPI_EMSE$client$application$ApplicationPresenter$MyProxy$_annotation$$none$$;
    
  }
  
  private com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationPresenter singleton_Key$type$com$viaxoft$mines$ProjetPI_EMSE$client$application$ApplicationPresenter$_annotation$$none$$ = null;
  
  public com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationPresenter get_Key$type$com$viaxoft$mines$ProjetPI_EMSE$client$application$ApplicationPresenter$_annotation$$none$$() {
    
    if (singleton_Key$type$com$viaxoft$mines$ProjetPI_EMSE$client$application$ApplicationPresenter$_annotation$$none$$ == null) {
    com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationPresenter result = com$viaxoft$mines$ProjetPI_EMSE$client$application$ApplicationPresenter_com$viaxoft$mines$ProjetPI_EMSE$client$application$ApplicationPresenter_methodInjection(injector.getFragment_com_google_web_bindery_event_shared().get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$(), get_Key$type$com$viaxoft$mines$ProjetPI_EMSE$client$application$ApplicationPresenter$MyView$_annotation$$none$$(), get_Key$type$com$viaxoft$mines$ProjetPI_EMSE$client$application$ApplicationPresenter$MyProxy$_annotation$$none$$());
    memberInject_Key$type$com$viaxoft$mines$ProjetPI_EMSE$client$application$ApplicationPresenter$_annotation$$none$$(result);
    
        singleton_Key$type$com$viaxoft$mines$ProjetPI_EMSE$client$application$ApplicationPresenter$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$viaxoft$mines$ProjetPI_EMSE$client$application$ApplicationPresenter$_annotation$$none$$;
    
  }
  
  public com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationPresenter com$viaxoft$mines$ProjetPI_EMSE$client$application$ApplicationPresenter_com$viaxoft$mines$ProjetPI_EMSE$client$application$ApplicationPresenter_methodInjection(com.google.web.bindery.event.shared.EventBus _0, com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationPresenter.MyView _1, com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationPresenter.MyProxy _2) {
    return new com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationPresenter(_0, _1, _2);
  }
  
  
  /**
   * Binding for com.google.inject.Provider<com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationPresenter> declared at:
   *   Implicit provider for com.google.inject.Provider<com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationPresenter>
   */
  public com.google.inject.Provider<com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationPresenter> get_Key$type$com$google$inject$Provider$com$viaxoft$mines$ProjetPI_EMSE$client$application$ApplicationPresenter$$_annotation$$none$$() {
    com.google.inject.Provider<com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationPresenter> result = new com.google.inject.Provider<com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationPresenter>() { 
      public com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationPresenter get() { 
        return get_Key$type$com$viaxoft$mines$ProjetPI_EMSE$client$application$ApplicationPresenter$_annotation$$none$$();
      }
    };
    return result;
    
  }
  
  
  /**
   * Binding for com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationView$Binder declared at:
   *   Implicit GWT.create binding for com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationView$Binder
   */
  public com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationView.Binder get_Key$type$com$viaxoft$mines$ProjetPI_EMSE$client$application$ApplicationView$Binder$_annotation$$none$$() {
    Object created = GWT.create(com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationView.Binder.class);
    assert created instanceof com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationView.Binder;
    com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationView.Binder result = (com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationView.Binder) created;
    
    memberInject_Key$type$com$viaxoft$mines$ProjetPI_EMSE$client$application$ApplicationView$Binder$_annotation$$none$$(result);
    
    return result;
    
  }
  
  private com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationView singleton_Key$type$com$viaxoft$mines$ProjetPI_EMSE$client$application$ApplicationView$_annotation$$none$$ = null;
  
  public com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationView get_Key$type$com$viaxoft$mines$ProjetPI_EMSE$client$application$ApplicationView$_annotation$$none$$() {
    
    if (singleton_Key$type$com$viaxoft$mines$ProjetPI_EMSE$client$application$ApplicationView$_annotation$$none$$ == null) {
    com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationView result = com$viaxoft$mines$ProjetPI_EMSE$client$application$ApplicationView_com$viaxoft$mines$ProjetPI_EMSE$client$application$ApplicationView_methodInjection(get_Key$type$com$viaxoft$mines$ProjetPI_EMSE$client$application$ApplicationView$Binder$_annotation$$none$$());
    memberInject_Key$type$com$viaxoft$mines$ProjetPI_EMSE$client$application$ApplicationView$_annotation$$none$$(result);
    
        singleton_Key$type$com$viaxoft$mines$ProjetPI_EMSE$client$application$ApplicationView$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$viaxoft$mines$ProjetPI_EMSE$client$application$ApplicationView$_annotation$$none$$;
    
  }
  
  public com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationView com$viaxoft$mines$ProjetPI_EMSE$client$application$ApplicationView_com$viaxoft$mines$ProjetPI_EMSE$client$application$ApplicationView_methodInjection(com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationView.Binder _0) {
    return new com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationView(_0);
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
    //   Implicit GWT.create binding for com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationPresenter$MyProxy
    get_Key$type$com$viaxoft$mines$ProjetPI_EMSE$client$application$ApplicationPresenter$MyProxy$_annotation$$none$$();
    
  }
  
}
