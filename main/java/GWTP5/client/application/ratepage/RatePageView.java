package GWTP5.client.application.ratepage;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

class RatePageView extends ViewImpl implements RatePagePresenter.MyView {
	interface Binder extends UiBinder<Widget, RatePageView> {
	}

	@UiField
	Button yesButton;

	@UiField
	Button noButton;

	@Inject
	RatePageView(Binder uiBinder) {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public Button getYesButton() {
		return yesButton;
	}

	public Button getNoButton() {
		return noButton;
	}

}