package com.gwtplatform.mvp.client;

import com.google.gwt.inject.client.Ginjector;
import com.google.gwt.core.shared.GWT;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.DefaultBootstrapper;
import javax.inject.Provider;
import com.google.gwt.inject.client.AsyncProvider;

public interface ClientGinjector extends Ginjector {
  static ClientGinjector SINGLETON = ((GinjectorProvider) GWT.create(GinjectorProvider.class)).get();
  
  EventBus getEventBus();
  
  PlaceManager getPlaceManager();
  
  DefaultBootstrapper getDefaultBootstrapper();
  
  Provider<com.viaxoft.mines.ProjetPI_EMSE.client.application.ApplicationPresenter> getcomviaxoftminesProjetPI_EMSEclientapplicationApplicationPresenter();
  
  AsyncProvider<com.viaxoft.mines.ProjetPI_EMSE.client.application.general.HomePresenter> getcomviaxoftminesProjetPI_EMSEclientapplicationgeneralHomePresenter();
  
  AsyncProvider<com.viaxoft.mines.ProjetPI_EMSE.client.application.general.SetupPresenter> getcomviaxoftminesProjetPI_EMSEclientapplicationgeneralSetupPresenter();
}
