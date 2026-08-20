package com.uprint.ui;

import com.uprint.ui.components.BagsGrid;
import com.uprint.ui.components.SignsGrid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "signsview", layout = MainLayout.class)
public class SignsView extends VerticalLayout {

    public SignsView() {
        add(new SignsGrid());
    }
}
