package GWTP5.client.application.third;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;

import GWTP5.client.application.header.headerPresenter;
import GWTP5.client.place.NameTokens;

public class ThirdPresenter extends Presenter<ThirdPresenter.MyView, ThirdPresenter.MyProxy> {
	interface MyView extends View {
	}
	// @ContentSlot
	// public static final Type<RevealContentHandler<?>> SLOT_Third = new
	// Type<RevealContentHandler<?>>();

	@NameToken(NameTokens.third)
	@ProxyCodeSplit //musialem pozmieniac na codesplit poniewaz na proxy standard nie dzialalo
	interface MyProxy extends ProxyPlace<ThirdPresenter> {
	}

	@Inject
	ThirdPresenter(EventBus eventBus, MyView view, MyProxy proxy) {
		//wywolanie slotu w konstruktorze nadklasy z parametrem jaki to ma byc slot
		super(eventBus, view, proxy, headerPresenter.SLOT_content);

	}

}