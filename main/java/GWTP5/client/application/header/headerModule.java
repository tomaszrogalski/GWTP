package GWTP5.client.application.header;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class headerModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(headerPresenter.class, headerPresenter.MyView.class, headerView.class, headerPresenter.MyProxy.class);
    }
}