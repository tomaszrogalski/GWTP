package GWTP5.client.application.header;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

class headerView extends ViewImpl implements headerPresenter.MyView {
	interface Binder extends UiBinder<Widget, headerView> {
	}

	@UiField
	HTMLPanel contentPanel;

	@Inject
	headerView(Binder uiBinder) {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override // Will replace existing presenter(s) in the slot.
	public void setInSlot(Object slot, IsWidget content) {
		if (slot == headerPresenter.SLOT_content) {
			contentPanel.clear();
			if (content != null) {
				contentPanel.add(content);
			}
		} else {
			super.setInSlot(slot, content);
		}
	}
}