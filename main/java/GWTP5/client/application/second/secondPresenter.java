package GWTP5.client.application.second;

import com.google.gwt.user.client.ui.Label;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest;

import GWTP5.client.place.NameTokens;

public class secondPresenter extends Presenter<secondPresenter.MyView, secondPresenter.MyProxy> {
	interface MyView extends View {
		public Label getSecondLabel();
	}

	@NameToken(NameTokens.second) // adres
	@ProxyStandard
	interface MyProxy extends ProxyPlace<secondPresenter> {
	}

	String name = "";

	@Inject
	secondPresenter(EventBus eventBus, MyView view, MyProxy proxy) {
		super(eventBus, view, proxy, RevealType.Root);

	}

	@Override
	public void prepareFromRequest(PlaceRequest request) {
		super.prepareFromRequest(request);
		// name w odpowidzi, klucz wartosc jak w home klucz i wartosc. fajne
		// jezeli nie znajdzie wartosci o takim klucz to uzyje "default value"
		// jezeli do strony o tokenie second przejde recznie wpisujac url to
		// pojawia sie default
		name = request.getParameter("name", "Default value");
	}

	@Override // gdy byl w onbind to nie bylo nic prawdopodobnie dlatego ze w
				// momencie tworzenia nie bylo jeszcze przypisanej wartosci
	// ????????
	protected void onReset() {
		super.onReset();
		getView().getSecondLabel().setText(name);
	}

}