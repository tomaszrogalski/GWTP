package GWTP5.client.application.home;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

public class HomePageView extends ViewImpl implements HomePagePresenter.MyView {
	public interface Binder extends UiBinder<Widget, HomePageView> {
	}

	@UiField
	Label firstLabel;
	@UiField
	TextBox firstBox;
	@UiField
	Button firstButton;

	@Inject
	HomePageView(Binder uiBinder) {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public Label getFirstLabel() {
		return firstLabel;
	}

	public TextBox getFirstBox() {
		return firstBox;
	}

	public Button getFirstButton() {
		return firstButton;
	}
}
