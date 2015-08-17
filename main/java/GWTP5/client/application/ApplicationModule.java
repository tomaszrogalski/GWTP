package GWTP5.client.application;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

import GWTP5.client.application.header.headerModule;
import GWTP5.client.application.home.HomeModule;
import GWTP5.client.application.second.secondModule;
import GWTP5.client.application.third.ThirdModule;

public class ApplicationModule extends AbstractPresenterModule {
	@Override
	protected void configure() {
		install(new ThirdModule());
		install(new headerModule());
		install(new secondModule());
		install(new HomeModule());

		bindPresenter(ApplicationPresenter.class, ApplicationPresenter.MyView.class, ApplicationView.class,
				ApplicationPresenter.MyProxy.class);
	}
}
