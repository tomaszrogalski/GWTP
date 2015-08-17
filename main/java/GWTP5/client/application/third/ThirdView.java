package GWTP5.client.application.third;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

class ThirdView extends ViewImpl implements ThirdPresenter.MyView {
    interface Binder extends UiBinder<Widget, ThirdView> {
    }

       @Inject
    ThirdView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
    
   
}