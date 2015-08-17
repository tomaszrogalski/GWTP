package GWTP5.client.application.second;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class secondModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(secondPresenter.class, secondPresenter.MyView.class, secondView.class, secondPresenter.MyProxy.class);
    }
}