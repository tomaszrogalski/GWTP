package GWTP5.client.application.home;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

import GWTP5.client.application.header.headerPresenter;

public class HomePageView extends ViewImpl implements HomePagePresenter.MyView {
	public interface Binder extends UiBinder<Widget, HomePageView> {
	}

	@UiField
	Label firstLabel;
	@UiField
	TextBox firstBox;
	@UiField
	Button firstButton;
	@UiField
	HTMLPanel ratePanel;

	@Inject
	HomePageView(Binder uiBinder) {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	@Override
	public void setInSlot(Object slot, IsWidget content) {
		if (slot == HomePagePresenter.SLOT_rate) {
			ratePanel.clear();
			if (content != null) {
				ratePanel.add(content);
			}

		} else {
			super.setInSlot(slot, content);
		}

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
