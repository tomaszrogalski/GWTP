package GWTP5.client.application.home;

import javax.inject.Inject;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest;

import GWTP5.client.application.ApplicationPresenter;
import GWTP5.client.application.header.headerPresenter;
import GWTP5.client.place.NameTokens;

public class HomePagePresenter extends Presenter<HomePagePresenter.MyView, HomePagePresenter.MyProxy> {
	public interface MyView extends View {
		public Label getFirstLabel();

		public TextBox getFirstBox();

		public Button getFirstButton();
	}

	@ProxyCodeSplit
	@NameToken(NameTokens.home)
	public interface MyProxy extends ProxyPlace<HomePagePresenter> {
	}

	@Inject // Posrednik, synchronizuje
	PlaceManager placeManager;

	@Inject
	HomePagePresenter(EventBus eventBus, MyView view, MyProxy proxy) {
		super(eventBus, view, proxy, ApplicationPresenter.SLOT_SetMainContent);
	}

	@Override//???????????
	protected void revealInParent() {
		RevealContentEvent.fire(this, headerPresenter.SLOT_content, this);
	}

	@Override // gdy kod ten wkleilem do onbind to po cofnieciu z seconda
				// firsttextbox wciaz mial nazwe a w on reset resetuje sie do
				// domyslnego
	protected void onReset() {
		super.onReset();
		// ustawienie tekstu na textboxie
		getView().getFirstBox().setText("First Text");

		// akcja na button
		getView().getFirstButton().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				// name bedzie mialo wartosc tego textboxa
				PlaceRequest responsePlaceRequest = new PlaceRequest.Builder().nameToken(NameTokens.second)
						.with("name", getView().getFirstBox().getText()).build();
				//moge zmienic widocznosc w url, sprawdzic
				placeManager.revealPlace(responsePlaceRequest);
			}
		});
	}

}
