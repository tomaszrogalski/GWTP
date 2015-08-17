package GWTP5.client.application.ratepage;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.View;

public class RatePagePresenter extends PresenterWidget<RatePagePresenter.MyView> {
	interface MyView extends View {
		public Button getYesButton();

		public Button getNoButton();
	}

	@Inject
	RatePagePresenter(EventBus eventBus, MyView view) {
		super(eventBus, view);

	}

	//tutaj ustawiam dzialanie mojego panelu na onliki dodaje alerty
	@Override
	protected void onBind() {
		super.onBind();

		getView().getYesButton().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				Window.alert("To dobrze");
			}
		});

		getView().getNoButton().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				Window.alert("To zle");
			}
		});
	}

}