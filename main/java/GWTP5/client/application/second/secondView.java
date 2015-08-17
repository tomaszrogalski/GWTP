package GWTP5.client.application.second;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

class secondView extends ViewImpl implements secondPresenter.MyView {
	interface Binder extends UiBinder<Widget, secondView> {
	}

	@UiField
	Label secondLabel;

	@Inject
	secondView(Binder uiBinder) {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public Label getSecondLabel() {
		return secondLabel;
	}

}